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
public class CDStore {

    static Scanner obj = new Scanner(System.in);
    ArrayList<CDInformation> listCD = new ArrayList<>();

    public void StoreInput() {
        int n = obj.nextInt();

        for (int i = 0; i < n; i++) {
            var cd = new CDInformation();
            cd.Input();
            listCD.add(cd);
        }
    }

    public void StoreOutput() {
        for (int i = 0; i < listCD.size(); i++) {
            listCD.get(i).Output();
        }
    }

    public void SearchCDbyTitle() {
        System.out.print("Search Title: ");
        var checkTitle = obj.next();

        for (int i = 0; i < listCD.size(); i++) {
            if (listCD.get(i).getCdTitle().equals(checkTitle)) {
                listCD.get(i).Output();
            }
        }
    }

    public void SearchCDbyCollection() {
        System.out.println("Search Collection: ");
        var checkCollection = obj.next();

        for (int i = 0; i < listCD.size(); i++) {
            if (listCD.get(i).getCdCollection().equals(checkCollection)) {
                listCD.get(i).Output();
            }
        }
    }

    public void SearchbyType() {
        System.out.println("Search Type: ");
        var checkType = obj.next();

        for (int i = 0; i < listCD.size(); i++) {
            if (listCD.get(i).getCdType().equals(checkType)) {
                listCD.get(i).Output();
            }
        }
    }

    public void DeleteCD() {
        System.out.print("Delete CD ID: ");
        var deleteID = obj.nextLong();

        for (int i = 0; i < listCD.size(); i++) {
            if (listCD.get(i).getCdID() == deleteID) {
                listCD.remove(i);
            }
        }
    }

    public void EditCD() {

    }

    public void DisplayAllCD() {
        for (int i = 0; i < listCD.size(); i++) {
            listCD.get(i).Output();
        }
    }

    public void SortCDbyYear() {
        listCD.sort((CDInformation s1, CDInformation s2) -> {
            return s1.getCdYearOfRelease() - s2.getCdYearOfRelease();
        });
    }
}
