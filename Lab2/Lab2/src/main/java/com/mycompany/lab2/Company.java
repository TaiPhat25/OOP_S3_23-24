/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Company {

    static Scanner obj = new Scanner(System.in);

    ArrayList<Employee> listE = new ArrayList<>();

    public Company() {

    }

    public void Input() {
        int n;
        System.out.println("Input N Employees: ");
        n = obj.nextInt();
        for (int i = 0; i < n; i++) {
            Employee emp = new Employee();
            emp.Input();
            listE.add(emp);
        }
    }

    public void Output() {
        for (int i = 0; i < listE.size(); i++) {
            listE.get(i).Output();
        }
    }

    public void sortSalary() {
        listE.sort((s1, s2) -> {
            var compare = Double.compare(s2.Salary(), s1.Salary());
            return compare;
        });
    }

    public void HighestSalary() {
        double max = listE.get(0).Salary();
        for (int i = 0; i < listE.size(); i++) {
            if (listE.get(i).Salary() == max) {
                System.out.println(listE.get(i).getFullName());
            }
        }
    }
}
