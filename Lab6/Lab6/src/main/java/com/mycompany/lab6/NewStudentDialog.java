/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Tai-E758
 */
public class NewStudentDialog extends JDialog {

    private JTextField studentID, lastName, midName, firstName, yearOfBirth;
    private JRadioButton male, female;
    private JComboBox schoolStage;
    private JButton btnSave, btnClear, btnCancel;
    private Student st;

    public Student getSt() {
        return st;
    }

    public NewStudentDialog(Frame owner, String title) {
        super(owner, title);
        this.setSize(300, 300);
        this.setLocation(200, 200);
//        pack();
        this.setLayout(new GridLayout(5, 1));
        JPanel pannel1 = new JPanel(new FlowLayout());
        pannel1.add(new JLabel("Student ID: "));
        studentID = new JTextField();
        studentID.setPreferredSize(new Dimension(50, 20));
        pannel1.add(studentID);
        this.add(pannel1);

        JPanel pannel2 = new JPanel(new FlowLayout());
        pannel2.add(new JLabel("Last-Mid-First Name: "));
        lastName = new JTextField();
        lastName.setPreferredSize(new Dimension(50, 20));
        midName = new JTextField();
        midName.setPreferredSize(new Dimension(50, 20));
        firstName = new JTextField();
        firstName.setPreferredSize(new Dimension(50, 20));
        pannel2.add(lastName);
        pannel2.add(midName);
        pannel2.add(firstName);
        this.add(pannel2);

        JPanel pannel3 = new JPanel(new FlowLayout());
        pannel3.add(new JLabel("Year Of Birth: "));
        yearOfBirth = new JTextField();
        yearOfBirth.setPreferredSize(new Dimension(50, 20));
        pannel3.add(yearOfBirth);
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        ButtonGroup rndGroup = new ButtonGroup();
        rndGroup.add(male);
        rndGroup.add(female);
        pannel3.add(male);
        pannel3.add(female);
        this.add(pannel3);

        String[] data = {"Select Your School Stage", "Primary School", "Secondary School", "High School"};
        schoolStage = new JComboBox(data);
        this.add(schoolStage);

        JPanel pannel4 = new JPanel(new FlowLayout());
        btnSave = new JButton("Save");
        btnSave.addActionListener((e) -> {
            saveStudent();
            setVisible(false);
        });
        btnClear = new JButton("Clear");
        btnClear.addActionListener((e) -> {
            studentID.setText(" ");
            lastName.setText(" ");
            midName.setText(" ");
            firstName.setText(" ");
            yearOfBirth.setText(" ");
        });
        btnCancel = new JButton("Cancel");
        btnCancel.addActionListener((e) -> {
            setVisible(false);
        });
        pannel4.add(btnSave);
        pannel4.add(btnClear);
        pannel4.add(btnCancel);
        this.add(pannel4);
    }

    public void setSt(Student st) {
        this.st = st;
    }

    private void saveStudent() {
        String id = studentID.getText();
        String last = lastName.getText();
        String mid = midName.getText();
        String first = firstName.getText();
        int yob = Integer.parseInt(yearOfBirth.getText());
        String gender = male.isSelected() == true ? "Male" : "Female";
        String school = schoolStage.getSelectedItem().toString();
        st = new Student(id, last, mid, first, yob, gender, school);
    }
}
