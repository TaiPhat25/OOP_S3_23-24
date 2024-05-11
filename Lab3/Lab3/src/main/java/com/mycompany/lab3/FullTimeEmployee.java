/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;



/**
 *
 * @author Student
 */
public class FullTimeEmployee extends Employee {

    public float salary;

    public FullTimeEmployee() {

    }

    public FullTimeEmployee(float salary) {
        this.salary = salary;
    }

    public FullTimeEmployee(float salary, String employeeID, String employeeName, int yearOfBirth, String address, String phone) {
        super(employeeID, employeeName, yearOfBirth, address, phone);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String getInfor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float getPayment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void FTEInput() {
        salary = obj.nextFloat();
    }
}
