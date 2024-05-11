/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public abstract class Employee {

    static Scanner obj = new Scanner(System.in);

    public String employeeID;
    public String employeeName;
    public int yearOfBirth;
    public String address;
    public String phone;

    public abstract String getInfor();

    public abstract float getPayment();

    public Employee() {

    }

    public Employee(String employeeID, String employeeName, int yearOfBirth, String address, String phone) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.phone = phone;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void Input() {
        System.out.println("Employee ID: ");
        employeeID = obj.nextLine();
        System.out.println("Employee Name: ");
        employeeName = obj.nextLine();
        System.out.println("Year Of Birth: ");
        yearOfBirth = obj.nextInt();
        obj.nextLine();
        System.out.println("Address: ");
        address = obj.nextLine();
        System.out.println("Phone: ");
        phone = obj.nextLine();
    }

    public void Output() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Year Of Birth: " + yearOfBirth);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
    }

}
