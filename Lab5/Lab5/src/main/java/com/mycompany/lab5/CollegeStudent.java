/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

/**
 *
 * @author Student
 */
public class CollegeStudent extends Student {

    private double examScore;

    public CollegeStudent() {

    }

    public CollegeStudent(double examScore) {
        this.examScore = examScore;
    }

    public CollegeStudent(double examScore, String studentNumber, String studentFullName, int credits,
            double avgScore) {
        super(studentNumber, studentFullName, credits, avgScore);
        this.examScore = examScore;
    }

    public double getExamScore() {
        return examScore;
    }

    public void setExamScore(double examScore) {
        this.examScore = examScore;
    }

    @Override
    public boolean Graduation() {
        return this.getCredits() >= 100 && this.getAvgScore() >= 5 && this.getExamScore() >= 5;
    }

    @Override
    public void Input() {
        super.Input();
        System.out.print("Exam Score: ");
        examScore = obj.nextDouble();
        obj.nextLine();
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("Exam Score: " + examScore);
    }
}
