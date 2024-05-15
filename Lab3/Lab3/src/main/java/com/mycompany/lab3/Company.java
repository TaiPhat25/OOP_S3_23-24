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
        System.out.print("Enter Number Of Full-time Employees: ");
        int n = obj.nextInt();

        for (int i = 0; i < n; i++) {
            FullTimeEmployee fte = new FullTimeEmployee();
            fte.FTEInput();
            listFullTime.add(fte);
        }
    }

    public void AddPTE() {
        System.out.print("Enter Number Of Part-time Employees: ");
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
        System.out.println("Information About All Full-time Employees");
        for (int i = 0; i < listFullTime.size(); i++) {
            listFullTime.get(i).FTEOutput();
        }

        System.out.println("Information About All Part-time Employees");
        for (int i = 0; i < listPartTime.size(); i++) {
            listPartTime.get(i).PTEOutput();
        }
    }

    public void SearchEmployeebyID() {
        System.out.print("Search ID: ");
        var ID = obj.next();

        for (int i = 0; i < listFullTime.size(); i++) {
            if (listFullTime.get(i).getEmployeeID().equals(ID)) {
                listFullTime.get(i).FTEOutput();
            }
        }

        for (int i = 0; i < listPartTime.size(); i++) {
            if (listPartTime.get(i).getEmployeeID().equals(ID)) {
                listPartTime.get(i).PTEOutput();
            }
        }
    }

    public void DeleteEmployeebyID() {
        System.out.print("Remove ID: ");
        var ID = obj.next();

        for (int i = 0; i < listFullTime.size(); i++) {
            if (listFullTime.get(i).getEmployeeID().equals(ID)) {
                listFullTime.remove(i);
            }
        }

        for (int i = 0; i < listPartTime.size(); i++) {
            if (listPartTime.get(i).getEmployeeID().equals(ID)) {
                listPartTime.remove(i);
            }
        }
    }

    public void EditInfor() {
        System.out.print("Edit ID: ");
        var ID = obj.next();

        for (int i = 0; i < listFullTime.size(); i++) {
            if (listFullTime.get(i).getEmployeeID().equals(ID)) {
                listFullTime.get(i).EditFTE();
            }
        }

        for (int i = 0; i < listPartTime.size(); i++) {
            if (listPartTime.get(i).getEmployeeID().equals(ID)) {
                listPartTime.get(i).EditPTE();
            }
        }
    }

    public void SearchEmployeebyPayment() {
        System.out.print("Start Payment: ");
        var startPayment = obj.nextFloat();
        System.out.print("End Payment: ");
        var endPayment = obj.nextFloat();

        for (int i = 0; i < listFullTime.size(); i++) {
            if (listFullTime.get(i).getSalary() >= startPayment && listFullTime.get(i).getSalary() <= endPayment) {
                listFullTime.get(i).FTEOutput();
            }
        }

        for (int i = 0; i < listPartTime.size(); i++) {
            var salary = listPartTime.get(i).getWorkingHour() * listPartTime.get(i).getPayRate();
            if (salary >= startPayment && salary <= endPayment) {
                listPartTime.get(i).PTEOutput();
            }
        }
    }

    public void SortEmployeebyAge() {
        System.out.println("Current Year: ");
        var currentYear = obj.nextInt();
        obj.nextLine();

        // Sort Full-time Employess by Age
        listFullTime.sort((FullTimeEmployee fte1, FullTimeEmployee fte2) -> {
            return (currentYear - fte1.getYearOfBirth()) - (currentYear - fte2.getYearOfBirth());
        });

        // Sort Part-time Employess by Age
        listPartTime.sort((PartTimeEmployee pte1, PartTimeEmployee pte2) -> {
            return (currentYear - pte1.getYearOfBirth()) - (currentYear - pte2.yearOfBirth);
        });
    }

    public void SortEmployeebyPayment() {
        // Sort Full-time Employees by Payment
        listFullTime.sort((FullTimeEmployee fte1, FullTimeEmployee fte2) -> {
            return (int) (fte1.getSalary() - fte2.getSalary());
        });

        // Sort Part-time Employees by Payment
        listPartTime.sort((PartTimeEmployee pte1, PartTimeEmployee pte2) -> {
            return (int) ((pte1.getWorkingHour() * pte1.getPayRate()) - (pte2.getWorkingHour() * pte2.getPayRate()));
        });
    }
}
