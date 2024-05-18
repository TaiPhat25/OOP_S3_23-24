/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Student
 */
public class School {

    static Scanner obj = new Scanner(System.in);

    Vector<Student> listStudent = new Vector<>();

    public void AddCollege() {
        System.out.print("How Many College Students Do You Want To Add: ");
        var n = obj.nextInt();

        for (int i = 0; i < n; i++) {
            CollegeStudent cs1 = new CollegeStudent();
            cs1.CollegeInput();
            listStudent.add(cs1);
        }
    }

    public void AddUniversity() {
        System.out.print("How Many University Students Do You Want To Add: ");
        var n = obj.nextInt();

        for (int i = 0; i < n; i++) {
            UniversityStudent us1 = new UniversityStudent();
            us1.UniversityInput();
            listStudent.add(us1);
        }
    }

    public void RemoveStudent() {
        System.out.print("Enter Student Code: ");
        var code = obj.nextLine();

        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getStudentNumber().equals(code)) {
                listStudent.remove(i);
            }
        }
    }
    
    public void Print() {
        for(int i = 0; i<listStudent.size(); i++) {
            listStudent.get(i).Output();
        }
    }

}
