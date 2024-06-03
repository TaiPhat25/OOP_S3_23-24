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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tai-E758
 */
public class MainFrame extends JFrame {

    private JButton btnCheckTotalStudents;
    private JButton btnNewStudent;
    private StudentManager stuManager = new StudentManager();
    private JButton btnRefresh;
    private JTable table;
    private DefaultTableModel model;
    private JButton btnDelete;

    public MainFrame() throws HeadlessException {
    }

    public MainFrame(GraphicsConfiguration gc) {
        super(gc);
    }

    public MainFrame(String title) throws HeadlessException {
        super(title);
        btnCheckTotalStudents = new JButton("Check Total Student");
        btnCheckTotalStudents.addActionListener((e) -> {
            JOptionPane.showMessageDialog(null, String.format("There Are %d Students In The Database", stuManager.getListStudent().size()), "Message", JOptionPane.INFORMATION_MESSAGE);
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
        btnRefresh.addActionListener((e) -> {
            refreshTable();
        });
        btnDelete = new JButton("Delete");
        btnDelete.addActionListener((e) -> {
            
        });
        this.setLayout(new BorderLayout());
        JPanel pannel = new JPanel();
        pannel.setLayout(new FlowLayout());
        pannel.add(btnCheckTotalStudents);
        pannel.add(btnNewStudent);
        pannel.add(btnRefresh);
        this.add(pannel, BorderLayout.NORTH);

        model = new DefaultTableModel();
        table = new JTable(model);

        model.addColumn("Student ID");
        model.addColumn("First Name");
        model.addColumn("Middle Name");
        model.addColumn("Last Name");
        model.addColumn("Gender");
        model.addColumn("School Stage");

        JScrollPane scrollPane = new JScrollPane(table);

        this.add(scrollPane, BorderLayout.CENTER);

        this.setSize(1024, 768);
        this.setLocation(250, 250);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public MainFrame(String title, GraphicsConfiguration gc) {
        super(title, gc);
    }

    public void fillInStudentTable() {
        for (Student s : stuManager.getListStudent()) {
            String[] rowStudentInfo = {s.getStudentID(), s.getFirstName(), s.getMidName(), s.getLastName(), s.getGender(), s.getSchoolStage()};
            model.addRow(rowStudentInfo);
        }
    }

    public void clearTable() {
        if (model != null) {
            model.setRowCount(0);
        }
    }

    public void refreshTable() {
        clearTable();
        fillInStudentTable();
    }
}
