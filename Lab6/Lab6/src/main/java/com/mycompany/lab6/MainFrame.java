/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab6;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Tai-E758
 */
public class MainFrame extends JFrame {

    private JButton btnCheckTotalStudents;
    private JButton btnNewStudent;
    private StudentManager stuManager = new StudentManager();
    private JButton btnRefresh;

    public MainFrame() throws HeadlessException {
    }

    public MainFrame(GraphicsConfiguration gc) {
        super(gc);
    }

    public MainFrame(String title) throws HeadlessException {
        super(title);
        btnCheckTotalStudents = new JButton("Check Total Student");
        btnCheckTotalStudents.addActionListener((e) -> {
            JOptionPane.showMessageDialog(null, String.format("There Are %d Students In Database", stuManager.getListStudent().size()), "Message", JOptionPane.INFORMATION_MESSAGE);
        });
        btnNewStudent = new JButton("New Student");
        btnNewStudent.addActionListener((e) -> {
            NewStudentDialog dlg = new NewStudentDialog(this, "New Student");
            dlg.setModal(true);
            dlg.setVisible(true);
            if (dlg.getSt() != null) {
                if (stuManager.addStudent(dlg.getSt()) == true) {
                    JOptionPane.showMessageDialog(null, "Valid Input", "Message", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Input", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        btnRefresh = new JButton("Refresh Table");

        this.setLayout(new BorderLayout());
        JPanel pannel = new JPanel();
        pannel.setLayout(new FlowLayout());
        pannel.add(btnCheckTotalStudents);
        pannel.add(btnNewStudent);
        pannel.add(btnRefresh);
        this.add(pannel, BorderLayout.NORTH);
        this.setSize(800, 600);
        this.setLocation(200, 200);
        this.pack();
    }

    public MainFrame(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }

}
