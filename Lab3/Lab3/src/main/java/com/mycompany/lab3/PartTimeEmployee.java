/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author Student
 */
public class PartTimeEmployee extends Employee {
    public int workingHour;
    public float payRate;
    
    public PartTimeEmployee() {
        
    }

    public PartTimeEmployee(int workingHour, float payRate) {
        this.workingHour = workingHour;
        this.payRate = payRate;
    }

    public PartTimeEmployee(int workingHour, float payRate, String employeeID, String employeeName, int yearOfBirth, String address, String phone) {
        super(employeeID, employeeName, yearOfBirth, address, phone);
        this.workingHour = workingHour;
        this.payRate = payRate;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    @Override
    public String getInfor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float getPayment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void PTEInput() {
        workingHour = obj.nextInt();
        payRate = obj.nextFloat()
    }
}
