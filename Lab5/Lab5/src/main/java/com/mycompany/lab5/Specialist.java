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
public class Specialist extends Member {

    private int numberOfEduCodes;
    private int yearsOfWorkXP;
    ArrayList<String> listOfEduCodes = new ArrayList<>();

    public Specialist() {

    }

    public Specialist(int numberOfEduCodes, int yearsOfWorkXP) {
        this.numberOfEduCodes = numberOfEduCodes;
        this.yearsOfWorkXP = yearsOfWorkXP;
    }

    public Specialist(int numberOfEduCodes, int yearsOfWorkXP, String fullName, String dateOfBirth, long ID) {
        super(fullName, dateOfBirth, ID);
        this.numberOfEduCodes = numberOfEduCodes;
        this.yearsOfWorkXP = yearsOfWorkXP;
    }

    public int getNumberOfEduCodes() {
        return numberOfEduCodes;
    }

    public int getYearsOfWorkXP() {
        return yearsOfWorkXP;
    }

    public ArrayList<String> getListOfEduCodes() {
        return listOfEduCodes;
    }

    public void setNumberOfEduCodes(int numberOfEduCodes) {
        this.numberOfEduCodes = numberOfEduCodes;
    }

    public void setYearsOfWorkXP(int yearsOfWorkXP) {
        this.yearsOfWorkXP = yearsOfWorkXP;
    }

    public void setListOfEduCodes(ArrayList<String> listOfEduCodes) {
        this.listOfEduCodes = listOfEduCodes;
    }

    @Override
    public void Input() {
        super.Input();
        System.out.println("Number Of Educational Project Codes: ");
        numberOfEduCodes = obj.nextInt();
        obj.nextLine();
        for (int i = 0; i < numberOfEduCodes; i++) {
            try {
                String code = obj.nextLine();
                if (code.matches("[A-Za-z][0-9]{2}.*")) {
                    System.out.println(code + " Is A Valid Code");
                    listOfEduCodes.add(code);
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("The Code Must Start With A Letter Followed By Two Digits");
                i--;
            }
        }

        System.out.println("Years Of Work Experience: ");
        yearsOfWorkXP = obj.nextInt();
        obj.nextLine();
    }

    @Override
    public double Salary() {
        int projectsStartWithT = 0;
        for (var c : listOfEduCodes) {
            if (c.startsWith("T")) {
                projectsStartWithT++;
            }
        }
        return ((yearsOfWorkXP * 4) + projectsStartWithT) * 18000;
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("List Of Educational Project Codes: ");
        for (var c : listOfEduCodes) {
            System.out.println(c);
        }
        System.out.println("Years Of Work Experience: " + yearsOfWorkXP);
        System.out.println("Salary: " + Salary());
    }
}
