/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Bank {

    static Scanner obj = new Scanner(System.in);
    ArrayList<BankAccount> listBK = new ArrayList<>();

    public Bank() {

    }

    public void Input() {
        int n;
        System.out.println("Input N Account Banks: ");
        n = obj.nextInt();
        for (int i = 0; i < n; i++) {
            BankAccount acc = new BankAccount();
            acc.Input();
            listBK.add(acc);
        }
    }

    public void Print() {
        for (int i = 0; i < listBK.size(); i++) {
            listBK.get(i).Print();
        }
    }

    public void DepositAccount() {
        int accNumberRe, accNumberSen;
        double money;
        System.out.println("Input Money: ");
        money = obj.nextDouble();
        System.out.println("Account 1: ");
        accNumberSen = obj.nextInt();
        System.out.println("Account 2: ");
        accNumberRe = obj.nextInt();
        BankAccount acc1 = null, acc2 = null;
        for (int i = 0; i < listBK.size(); i++) {
            if (listBK.get(i).CompareAccountNumber(accNumberSen)) {
                acc1 = listBK.get(i);
            } else if (listBK.get(i).CompareAccountNumber(accNumberRe)) {
                acc2 = listBK.get(i);
            }
        }
        if (acc1 != null && acc2 != null) {
            acc1.transferMoney(acc2, money);
        }
    }
}
