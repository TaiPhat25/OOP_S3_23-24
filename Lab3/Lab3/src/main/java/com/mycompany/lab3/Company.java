/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Company {

    static Scanner obj = new Scanner(System.in);
    ArrayList<FullTimeEmployee> listFullTime = new ArrayList<>();
    ArrayList<PartTimeEmployee> listPartTime = new ArrayList<>();

    public void AddFTE() {
        int n = obj.nextInt();

        for (int i = 0; i < n; i++) {
            FullTimeEmployee fte = new FullTimeEmployee();
            fte.FTEInput();
            listFullTime.add(fte);
        }
    }

    public void AddPTE() {
        int n = obj.nextInt();

        for (int i = 0; i < n; i++) {
            PartTimeEmployee pte = new PartTimeEmployee();
            pte.PTEInput();
            listPartTime.add(pte);
        }
    }

    public void ShowFTE() {
        for (int i = 0; i < listFullTime.size(); i++) {
            listFullTime.get(i).FTEOutput();
        }
    }

    public void ShowPTE() {
        for (int i = 0; i < listPartTime.size(); i++) {
            listPartTime.get(i).PTEOutput();
        }
    }
    
    public void ShowAllEmployee() {
        for(int i = 0; i<listFullTime.size()+listPartTime.size(); i++) {
            listFullTime.get
        }
    }
}
