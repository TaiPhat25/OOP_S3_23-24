/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Student
 */
public class School {

    static Scanner obj = new Scanner(System.in);

    Vector<Student> listStudents = new Vector<>();

    public void AddCollege() {
        System.out.print("How Many College Students Do You Want To Add: ");
        var n = obj.nextInt();

        for (int i = 0; i < n; i++) {
            CollegeStudent cs1 = new CollegeStudent();
            cs1.Input();
            listStudents.add(cs1);
        }
    }

    public void AddUniversity() {
        System.out.print("How Many University Students Do You Want To Add: ");
        var n = obj.nextInt();

        for (int i = 0; i < n; i++) {
            UniversityStudent us1 = new UniversityStudent();
            us1.Input();
            listStudents.add(us1);
        }
    }

    public void RemoveStudent() {
        System.out.print("Enter Student Code: ");
        var code = obj.next();

        for (int i = 0; i < listStudents.size(); i++) {
            if (listStudents.get(i).getStudentNumber().equals(code)) {
                listStudents.remove(i);
            }
        }
    }

    public void Print() {
        System.out.println("All Students-----------------");
        for (int i = 0; i < listStudents.size(); i++) {
            listStudents.get(i).Output();
        }
    }

    public void GraduationStudent() {
        int count = 0;

        for (int i = 0; i < listStudents.size(); i++) {
            if (listStudents.get(i).Graduation()) {
                listStudents.get(i).Output();
                count++;
            }
        }
        System.out.println("Total Of " + count + " Students Can Graduate");
    }

    public void Sort() {
        listStudents.sort((s1, s2) -> {
            if (s1.getClass().toString().compareTo(s2.getClass().toString()) == 0) {
                return s1.getStudentNumber().compareTo(s2.getStudentNumber());
            }
            return s1.getClass().toString().compareTo(s2.getClass().toString());
        });
    }

    public void FindStudent() {
        System.out.print("Name You Want To Find: ");
        String name = obj.next();

        for (int i = 0; i < listStudents.size(); i++) {
            if (listStudents.get(i).getStudentFullName().equals(name)) {
                listStudents.get(i).Output();
            }
        }
    }

    // Dung de ghi vao file
    public void WriteFile() {
        try {
            FileOutputStream f = new FileOutputStream(
                    "D:\\Java\\CSE 203 (OOP)\\OOP_S3_23-24\\Lab5\\Lab5\\Students.dat");
            try (ObjectOutputStream oStream = new ObjectOutputStream(f)) {
                for (Student s : listStudents) {
                    oStream.writeObject(s);
                }
            }
        } catch (IOException e) {
            System.out.println("Error Write File");
        }
    }

    // Dung de load du lieu len tu file
    public void ReadFile() {
        try {
            FileInputStream f = new FileInputStream("D:\\Java\\CSE 203 (OOP)\\OOP_S3_23-24\\Lab5\\Lab5\\Students.dat");
            try (ObjectInputStream iStream = new ObjectInputStream(f)) {
                Student st = null;
                while ((st = (Student) iStream.readObject()) != null) {
                    listStudents.add(st);
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");
        } catch (IOException e) {
            System.out.println("Error Read File");
        }
    }

    public void WriteFile1() {
        try {
            FileOutputStream f = new FileOutputStream(
                    "D:\\Java\\CSE 203 (OOP)\\OOP_S3_23-24\\Lab5\\Lab5\\Result.dat");
            try (ObjectOutputStream oStream = new ObjectOutputStream(f)) {
                for (Student s : listStudents) {
                    oStream.writeObject(s);
                }
            }
        } catch (IOException e) {
            System.out.println("Error Write File");
        }
    }

    public void ReadFile1() {
        try {
            FileInputStream f = new FileInputStream("D:\\Java\\CSE 203 (OOP)\\OOP_S3_23-24\\Lab5\\Lab5\\Result.dat");
            try (ObjectInputStream iStream = new ObjectInputStream(f)) {
                Student st = null;
                while ((st = (Student) iStream.readObject()) != null) {
                    listStudents.add(st);
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");
        } catch (IOException e) {
            System.out.println("Error Read File");
        }
    }
}
