/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Tai-E758
 */
public class StaffManagement {

    static Scanner obj = new Scanner(System.in);

    Vector<Member> listStaff = new Vector<>();

    public void addLecture() {
        System.out.println("How Many Lectures Do You Want To Add: ");
        var n = obj.nextInt();

        for (int i = 0; i < n; i++) {
            Lecture lt1 = new Lecture();
            lt1.Input();
            listStaff.add(lt1);
        }
    }

    public void addTeachingAssistant() {
        System.out.println("How Many Teaching Assistants Do You Want To Add: ");
        var n = obj.nextInt();

        for (int i = 0; i < n; i++) {
            TeachingAssistant ta1 = new TeachingAssistant();
            ta1.Input();
            listStaff.add(ta1);
        }
    }

    public void addResearcher() {
        System.out.println("How Many Researchers Do You Want To Add: ");
        var n = obj.nextInt();

        for (int i = 0; i < n; i++) {
            Researcher rs1 = new Researcher();
            rs1.Input();
            listStaff.add(rs1);
        }
    }

    public void addSpecialist() {
        System.out.println("How Many Specialists Do You Want To Add: ");
        var n = obj.nextInt();

        for (int i = 0; i < n; i++) {
            Specialist sp1 = new Specialist();
            sp1.Input();
            listStaff.add(sp1);
        }
    }

    public void editInformationbyID() {
        System.out.println("Enter The ID: ");
        String id = obj.nextLine();

        for (int i = 0; i < listStaff.size(); i++) {
            if (listStaff.get(i).getID().equals(id)) {
                System.out.println("Enter New Name: ");
                String name = obj.next();

                System.out.println("Enter New Date Of Birth");
                System.out.print("Day: ");
                int d = obj.nextInt();
                System.out.print("Month: ");
                int m = obj.nextInt();
                System.out.print("Year: ");
                int y = obj.nextInt();
                String day;
                if (d < 10) {
                    day = "0" + d;
                } else {
                    day = Integer.toString(d);
                }
                String month;
                if (m < 10) {
                    month = "0" + m;
                } else {
                    month = Integer.toString(m);
                }
                String DoB = day + "/" + month + "/" + y;

                System.out.println("Enter New ID: ");
                String newID = obj.nextLine();

                listStaff.get(i).setFullName(name);
                listStaff.get(i).setDateOfBirth(DoB);
                listStaff.get(i).setID(newID);
                break;
            }
        }
    }

    public void removeStaffbyID() {
        System.out.println("Enter The ID: ");
        String id = obj.nextLine();

        for (int i = 0; i < listStaff.size(); i++) {
            if (listStaff.get(i).getID().equals(id)) {
                listStaff.remove(i);
                break;
            }
        }
    }

    public void totalSalary() {
        double salary = 0;
        for (int i = 0; i < listStaff.size(); i++) {
            salary += listStaff.get(i).Salary();
        }
        System.out.println(salary);
    }

    public void totalSalarybyStaff() {
        listStaff.sort((s1, s2) -> {
            if (s1.getClass().toString().compareTo(s2.getClass().toString()) == 0) {
                return s1.getID().compareTo(s2.getID());
            }
            return s1.getClass().toString().compareTo(s2.getClass().toString());
        });
    }

    public void highestPaidStaff() {
        listStaff.sort((s1, s2) -> {
            return Double.compare(s2.Salary(), s1.Salary());
        });
        for (int i = 0; i < 3; i++) {
            listStaff.get(i).Output();
        }
    }

    public void printStaffInformation() {
        for (int i = 0; i < listStaff.size(); i++) {
            listStaff.get(i).Output();
        }
    }

    public void writeFile() {
        try {
            FileOutputStream f = new FileOutputStream("EIUStaff.eiu");
            try (ObjectOutputStream oStream = new ObjectOutputStream(f)) {
                for (Member m : listStaff) {
                    oStream.writeObject(m);
                }
            }
        } catch (IOException e) {
            System.out.println("Error Write File");
        }
    }

    public void writeFileQ4() {
        try {
            FileOutputStream f = new FileOutputStream("TotalSalary.eiu");
            try (ObjectOutputStream oStream = new ObjectOutputStream(f)) {
                for (Member m : listStaff) {
                    oStream.writeObject(m);
                }
            }
        } catch (IOException e) {
            System.out.println("Error Write File");
        }
    }

    public void writeFileQ5() {
        try {
            FileOutputStream f = new FileOutputStream("TotalSalarybyType.eiu");
            try (ObjectOutputStream oStream = new ObjectOutputStream(f)) {
                for (Member m : listStaff) {
                    oStream.writeObject(m);
                }
            }
        } catch (IOException e) {
            System.out.println("Error Write File");
        }
    }

    public void writeFileQ6() {
        try {
            FileOutputStream f = new FileOutputStream("HighestPaidStaff.eiu");
            try (ObjectOutputStream oStream = new ObjectOutputStream(f)) {
                for (Member m : listStaff) {
                    oStream.writeObject(m);
                }
            }
        } catch (IOException e) {
            System.out.println("Error Write File");
        }
    }

    public void readFile() {
        try {
            FileInputStream f = new FileInputStream("EIUStaff.eiu");
            try (ObjectInputStream iStream = new ObjectInputStream(f)) {
                Member m = null;
                while ((m = (Member) iStream.readObject()) != null) {
                    listStaff.add(m);
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");
        } catch (IOException e) {
            System.out.println("Error Read File");
        }
    }

}
