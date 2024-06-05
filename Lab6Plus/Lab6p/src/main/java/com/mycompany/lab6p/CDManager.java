/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6p;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tai-E758
 */
public class CDManager {

    static Scanner obj = new Scanner(System.in);
    ArrayList<CD> listCD = new ArrayList<>();

    public ArrayList<CD> getListCD() {
        return listCD;
    }

    public boolean addCD(CD cd) {
        for (CD c : listCD) {
            if (c.getCdID() == cd.getCdID()) {
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
}
