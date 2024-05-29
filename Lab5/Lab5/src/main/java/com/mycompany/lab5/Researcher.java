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
public class Researcher extends Member {

    private int numberOfResCodes;
    private int yearsOfResXP;
    ArrayList<String> listOfResCodes = new ArrayList<>();

    public Researcher() {

    }

    public Researcher(int numberOfResCodes, int yearsOfResXP) {
        this.numberOfResCodes = numberOfResCodes;
        this.yearsOfResXP = yearsOfResXP;
    }

    public Researcher(int numberOfResCodes, int yearsOfResXP, String fullName, String dateOfBirth, long ID) {
        super(fullName, dateOfBirth, ID);
        this.numberOfResCodes = numberOfResCodes;
        this.yearsOfResXP = yearsOfResXP;
    }

    public int getNumberOfResCodes() {
        return numberOfResCodes;
    }

    public int getYearsOfResXP() {
        return yearsOfResXP;
    }

    public ArrayList<String> getListOfResCodes() {
        return listOfResCodes;
    }

    public void setNumberOfResCodes(int numberOfResCodes) {
        this.numberOfResCodes = numberOfResCodes;
    }

    public void setYearsOfResXP(int yearsOfResXP) {
        this.yearsOfResXP = yearsOfResXP;
    }

    public void setListOfResCodes(ArrayList<String> listOfResCodes) {
        this.listOfResCodes = listOfResCodes;
    }

    @Override
    public void Input() {
        super.Input();
        System.out.println("Number Of Research Project Codes: ");
        numberOfResCodes = obj.nextInt();
        obj.nextLine();
        for (int i = 0; i < numberOfResCodes; i++) {
            try {
                String code = obj.nextLine();
                if (code.matches("[A-Za-z][0-9]{2}.*")) {
                    System.out.println(code + " Is A Valid Code");
                    listOfResCodes.add(code);
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("The Code Must Start With A Letter Followed By Two Digits");
                i--;
            }
        }

        System.out.println("Years Of Research Experience: ");
        yearsOfResXP = obj.nextInt();
        obj.nextLine();
    }

    @Override
    public double Salary() {
        int projectsStartWithD = 0;
        for (var c : listOfResCodes) {
            if (c.startsWith("D")) {
                projectsStartWithD++;
            }
        }
        return ((yearsOfResXP * 2) + projectsStartWithD) * 20000;
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("List Of Research Project Codes: ");
        for (var c : listOfResCodes) {
            System.out.println(c);
        }
        System.out.println("Years Of Research Experience: " + yearsOfResXP);
        System.out.println("Salary: " + Salary());
    }
}
