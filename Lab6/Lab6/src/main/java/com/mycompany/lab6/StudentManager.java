/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.util.ArrayList;

/**
 *
 * @author Tai-E758
 */
public class StudentManager {

    private ArrayList<Student> listStudent = new ArrayList<>();
    private StudentTableModel stm = new StudentTableModel();

    public StudentManager() {
    }

    public ArrayList<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public Student findStudentByID(String studentID) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getStudentID().equals(studentID)) {
                return listStudent.get(i);
            }
        }
        return null;
    }

    public boolean addStudent(Student stu) {
        for (Student s : listStudent) {
            if (s.getStudentID().equals(stu.getStudentID())) {
                return false;
            }
        }
        listStudent.add(stu);
        return true;
    }

    public StudentTableModel getStudentTableModel() {
        return stm;
    }
}
