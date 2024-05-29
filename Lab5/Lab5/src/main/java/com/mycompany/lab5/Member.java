/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Tai-E758
 */
public abstract class Member implements Serializable {

    static Scanner obj = new Scanner(System.in);

    private String fullName;
    private String dateOfBirth;
    private long ID;

    public Member() {

    }

    public Member(String fullName, String dateOfBirth, long ID) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public long getID() {
        return ID;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public abstract double Salary();

    public void Input() {
        System.out.println("Full Name: ");
        fullName = obj.nextLine();

        System.out.println("Date Of Birth");
        System.out.print("Day: ");
        int D = obj.nextInt();
        obj.nextLine();
        System.out.print("Month: ");
        int M = obj.nextInt();
        obj.nextLine();
        System.out.print("Year: ");
        int Y = obj.nextInt();
        obj.nextLine();
        //*****
        String Day;
        if (D < 10) {
            Day = "0" + D;
        } else {
            Day = Integer.toString(D);
        }
        //*****
        String Month;
        if (M < 10) {
            Month = "0" + M;
        } else {
            Month = Integer.toString(D);
        }
        dateOfBirth = Day + "/" + Month + "/" + Y;

        System.out.println("ID Number: ");
        ID = obj.nextLong();
        obj.nextLine();
    }

    public void Output() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Date Of Birth: " + dateOfBirth);
        System.out.println("ID Number: " + ID);
    }
}
