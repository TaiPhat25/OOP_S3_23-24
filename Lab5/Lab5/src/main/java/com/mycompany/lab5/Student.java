/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public abstract class Student implements Serializable{

    static Scanner obj = new Scanner(System.in);

    private String studentNumber;
    private String studentFullName;
    private int credits;
    private double avgScore;

    public Student() {

    }

    public Student(String studentNumber, String studentFullName, int credits, double avgScore) {
        this.studentNumber = studentNumber;
        this.studentFullName = studentFullName;
        this.credits = credits;
        this.avgScore = avgScore;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getStudentFullName() {
        return studentFullName;
    }

    public int getCredits() {
        return credits;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setStudentFullName(String studentFullName) {
        this.studentFullName = studentFullName;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public abstract boolean Graduation();

    public void Input() {
        System.out.print("Student Number: ");
        studentNumber = obj.nextLine();
        System.out.print("Student Full Name: ");
        studentFullName = obj.nextLine();
        System.out.print("Credits: ");
        credits = obj.nextInt();
        obj.nextLine();
        System.out.print("Average Score: ");
        avgScore = obj.nextDouble();
        obj.nextLine();
    }

    public void Output() {
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Student Full Name: " + studentFullName);
        System.out.println("Credits: " + credits);
        System.out.println("Average Score: " + avgScore);
    }
}
