/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

/**
 *
 * @author Tai-E758
 */
public class TeachingAssistant extends Member {

    private int numberOfSubjectsAssisted;

    public TeachingAssistant() {

    }

    public TeachingAssistant(int numberOfSubjectsAssisted) {
        this.numberOfSubjectsAssisted = numberOfSubjectsAssisted;
    }

    public TeachingAssistant(int numberOfSubjectsAssisted, String fullName, String dateOfBirth, long ID) {
        super(fullName, dateOfBirth, ID);
        this.numberOfSubjectsAssisted = numberOfSubjectsAssisted;
    }

    public int getNumberOfSubjectsAssisted() {
        return numberOfSubjectsAssisted;
    }

    public void setNumberOfSubjectsAssisted(int numberOfSubjectsAssisted) {
        this.numberOfSubjectsAssisted = numberOfSubjectsAssisted;
    }

    @Override
    public void Input() {
        super.Input();
        System.out.println("Number Of Subject Assisted: ");
        numberOfSubjectsAssisted = obj.nextInt();
        obj.nextLine();
    }

    @Override
    public double Salary() {
        return (numberOfSubjectsAssisted * 0.3) * 18000;
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("Number Of Subject Assisted: " + numberOfSubjectsAssisted);
        System.out.println("Salary: " + Salary());
    }
}
