/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.util.Scanner;

/**
 *
 * @author Tai-E758
 */
public class Student {

    static Scanner obj = new Scanner(System.in);

    private String studentID;
    private String lastName;
    private String midName;
    private String firstName;
    private int yearOfBirth;
    private String gender;
    private String schoolStage;

    public Student() {

    }

    public Student(String studentID, String lastName, String midName, String firstName, int yearOfBirth, String gender, String schoolStage) {
        this.studentID = studentID;
        this.lastName = lastName;
        this.midName = midName;
        this.firstName = firstName;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.schoolStage = schoolStage;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMidName() {
        return midName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getSchoolStage() {
        return schoolStage;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSchoolStage(String schoolStage) {
        this.schoolStage = schoolStage;
    }

    public void Input() {
        System.out.println("Student ID: ");
        studentID = obj.nextLine();
        System.out.println("Student Last Name: ");
        lastName = obj.nextLine();
        System.out.println("Student Middle Name: ");
        midName = obj.nextLine();
        System.out.println("Student First Name: ");
        firstName = obj.nextLine();
        System.out.println("Year Of Birth: ");
        yearOfBirth = obj.nextInt();
        System.out.println("Gender: ");
        gender = obj.nextLine();
        System.out.println("School Stage: ");
        schoolStage = obj.nextLine();
    }

    public void Output() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Last Name: " + lastName);
        System.out.println("Student Middle Name: " + midName);
        System.out.println("Student First Name: " + firstName);
        System.out.println("Year Of Birth: " + yearOfBirth);
        System.out.println("Gender: " + gender);
        System.out.println("School Stage: " + schoolStage);
    }
}
