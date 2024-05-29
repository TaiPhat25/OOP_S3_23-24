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
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tai-E758
 */
public class StaffManagement {

    static Scanner obj = new Scanner(System.in);

    ArrayList<Member> listStaff = new ArrayList<>();

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
