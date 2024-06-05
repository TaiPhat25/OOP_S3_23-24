/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

    public void removeStudent(String ID) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getStudentID().equals(ID)) {
                listStudent.remove(i);
                break;
            }
        }
    }

    public void Print() {
        for (int i = 0; i < listStudent.size(); i++) {
            listStudent.get(i).Output();
        }
    }

    public StudentTableModel getStudentTableModel() {
        return stm;
    }

    public void writeFile() {
        try {
            FileOutputStream f = new FileOutputStream("Student.dat");
            try (ObjectOutputStream oStream = new ObjectOutputStream(f)) {
                for (Student s : listStudent) {
                    oStream.writeObject(s);
                }
            }
        } catch (IOException e) {
            System.out.println("Error Write File");
        }
    }

    public void readFile() {
        try {
            FileInputStream f = new FileInputStream("Student.dat");
            try (ObjectInputStream iStream = new ObjectInputStream(f)) {
                Student s = null;
                while ((s = (Student) iStream.readObject()) != null) {
                    listStudent.add(s);
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");
        } catch (IOException e) {
            System.out.println("Error Read File");
        }
    }
}
