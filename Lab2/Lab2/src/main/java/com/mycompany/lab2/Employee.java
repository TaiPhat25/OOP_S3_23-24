/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Employee {

    static Scanner obj = new Scanner(System.in);
    
    private String code;
    private String fullName;
    private int yearsOfService;
    private double salaryCoefficient;
    private double basicSalary;

    public Employee() {

    }

    public Employee(String code, String fullName, int yearsOfService, double salaryCoefficient, double basicSalary) {
        this.code = code;
        this.fullName = fullName;
        this.yearsOfService = yearsOfService;
        this.salaryCoefficient = salaryCoefficient;
        this.basicSalary = basicSalary;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getCode() {
        return code;
    }

    public String getFullName() {
        return fullName;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void Input() {
        System.out.println("Employee Code: ");
        code = obj.nextLine();
        System.out.println("Employee Full Name: ");
        fullName = obj.nextLine();
        System.out.println("Years Of Service: ");
        yearsOfService = obj.nextInt();
        obj.nextLine();
        System.out.println("Salary Coefficient: ");
        salaryCoefficient = obj.nextDouble();
        obj.nextLine();
        System.out.println("Basic Salary: ");
        basicSalary = obj.nextDouble();
        obj.nextLine();
    }

    public double Salary() {
        return salaryCoefficient * basicSalary;
    }

    public void Output() {
        System.out.println("Employee Code: " + code);
        System.out.println("Employee Full Name: " + fullName);
        System.out.println("Years Of Service: " + yearsOfService);
        System.out.println("Salary: " + Salary());
    }
}
