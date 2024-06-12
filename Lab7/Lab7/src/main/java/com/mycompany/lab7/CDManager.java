/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

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
public class CDManager {

    static Scanner obj = new Scanner(System.in);
    ArrayList<CDInformation> listCD = new ArrayList<>();

    public ArrayList<CDInformation> getListCD() {
        return listCD;
    }

    public boolean addCD(CDInformation cd) {
        for (CDInformation c : listCD) {
            if (c.getCdID().equals(cd.getCdID())) {
                return false;
            }
        }
        listCD.add(cd);
        return true;
    }

    public void showAllCD() {
        for (int i = 0; i < listCD.size(); i++) {
            listCD.get(i).Output();
        }
    }

    public void deleteCD(String ID) {
        for (int i = 0; i < listCD.size(); i++) {
            if (listCD.get(i).getCdID().equals(ID)) {
                listCD.remove(i);
                break;
            }
        }
    }

    public void writeFile() {
        try {
            FileOutputStream f = new FileOutputStream("CD.eiu");
            try (ObjectOutputStream oStream = new ObjectOutputStream(f)) {
                for (CDInformation c : listCD) {
                    oStream.writeObject(c);
                }
            }
        } catch (IOException e) {
            System.out.println("Error Write File");
        }
    }

    public void readFile() {
        try {
            FileInputStream f = new FileInputStream("CD.eiu");
            try (ObjectInputStream iStream = new ObjectInputStream(f)) {
                CDInformation c = null;
                while ((c = (CDInformation) iStream.readObject()) != null) {
                    listCD.add(c);
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");
        } catch (IOException e) {
            System.out.println("Error Read File");

        }
    }
}
