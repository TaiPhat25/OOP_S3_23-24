/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.util.ArrayList;

/**
 *
 * @author Tai-E758
 */
public class Lecture extends Member {

    private String academicRank;
    private String academicDegree;
    private int yearsOfTeachingXP;
    private int numberOfSubjectsBeingTaught;
    ArrayList<String> listSubjects = new ArrayList<>();

    public Lecture() {

    }

    public Lecture(String academicRank, String academicDegree, int yearsOfTeachingXP, int numberOfSubjectsBeingTaught) {
        this.academicRank = academicRank;
        this.academicDegree = academicDegree;
        this.yearsOfTeachingXP = yearsOfTeachingXP;
        this.numberOfSubjectsBeingTaught = numberOfSubjectsBeingTaught;
    }

    public Lecture(String academicRank, String academicDegree, int yearsOfTeachingXP, int numberOfSubjectsBeingTaught,
            String fullName, String dateOfBirth, String ID) {
        super(fullName, dateOfBirth, ID);
        this.academicRank = academicRank;
        this.academicDegree = academicDegree;
        this.yearsOfTeachingXP = yearsOfTeachingXP;
        this.numberOfSubjectsBeingTaught = numberOfSubjectsBeingTaught;
    }

    public String getAcademicRank() {
        return academicRank;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public int getYearsOfTeachingXP() {
        return yearsOfTeachingXP;
    }

    public int getNumberOfSubjectsBeingTaught() {
        return numberOfSubjectsBeingTaught;
    }

    public ArrayList<String> getListSubjects() {
        return listSubjects;
    }

    public void setAcademicRank(String academicRank) {
        this.academicRank = academicRank;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public void setYearsOfTeachingXP(int yearsOfTeachingXP) {
        this.yearsOfTeachingXP = yearsOfTeachingXP;
    }

    public void setNumberOfSubjectsBeingTaught(int numberOfSubjectsBeingTaught) {
        this.numberOfSubjectsBeingTaught = numberOfSubjectsBeingTaught;
    }

    public void setListSubjects(ArrayList<String> listSubjects) {
        this.listSubjects = listSubjects;
    }

    @Override
    public void Input() {
        super.Input();
        System.out.println("Academic Rank: ");
        academicRank = obj.nextLine();

        System.out.println("Academic Degree: ");
        academicDegree = obj.nextLine();

        System.out.println("Years Of Teaching Experience: ");
        yearsOfTeachingXP = obj.nextInt();
        obj.nextLine();

        System.out.println("Number Of Subjects Being Taught: ");
        numberOfSubjectsBeingTaught = obj.nextInt();
        for (int i = 0; i < numberOfSubjectsBeingTaught; i++) {
            System.out.print("Enter Subject: ");
            String subject = obj.next();
            listSubjects.add(subject);
        }
    }

    @Override
    public double Salary() {
        return (numberOfSubjectsBeingTaught * yearsOfTeachingXP * 0.12) * 20000;
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("Academic Rank: " + academicRank);
        System.out.println("Academic Degree: " + academicDegree);
        System.out.println("Years Of Teaching Experience: " + yearsOfTeachingXP);
        System.out.println("Number Of Subjects Being Taught: ");
        for (var s : listSubjects) {
            System.out.println(s);
        }
        System.out.println("Salary: " + Salary());
    }
}
