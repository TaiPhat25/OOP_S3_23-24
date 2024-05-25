/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

/**
 *
 * @author Student
 */
public class UniversityStudent extends Student {

    private String thesisName;
    private double thesisScore;

    public UniversityStudent() {

    }

    public UniversityStudent(String thesisName, double thesisScore) {
        this.thesisName = thesisName;
        this.thesisScore = thesisScore;
    }

    public UniversityStudent(String thesisName, double thesisScore, String studentNumber, String studentFullName,
            int credits, double avgScore) {
        super(studentNumber, studentFullName, credits, avgScore);
        this.thesisName = thesisName;
        this.thesisScore = thesisScore;
    }

    public String getThesisName() {
        return thesisName;
    }

    public double getThesisScore() {
        return thesisScore;
    }

    public void setThesisName(String thesisName) {
        this.thesisName = thesisName;
    }

    public void setThesisScore(double thesisScore) {
        this.thesisScore = thesisScore;
    }

    @Override
    public boolean Graduation() {
        return this.getCredits() >= 150 && this.getAvgScore() >= 5 && this.getThesisScore() >= 5;
    }

    @Override
    public void Input() {
        super.Input();
        System.out.print("Thesis Name: ");
        thesisName = obj.nextLine();
        System.out.print("Thesis Score: ");
        thesisScore = obj.nextDouble();
        obj.nextLine();
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("Thesis Name: " + thesisName);
        System.out.println("Thesis Score: " + thesisScore);
    }
}
