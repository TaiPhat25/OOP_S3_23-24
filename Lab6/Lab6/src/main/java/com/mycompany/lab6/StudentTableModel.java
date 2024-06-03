/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tai-E758
 */
public class StudentTableModel extends DefaultTableModel {

    public StudentTableModel() {
        this.addColumn("Student ID");
        this.addColumn("First Name");
        this.addColumn("Middle Name");
        this.addColumn("Last Name");
        this.addColumn("Gender");
        this.addColumn("School Stage");
    }
}
