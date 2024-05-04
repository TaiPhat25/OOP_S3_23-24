/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class BankAccount {

    static Scanner obj = new Scanner(System.in);

    private int AccNum;
    private String Name;
    private double Balance;

    public int getAccNum() {
        return AccNum;
    }

    public String getName() {
        return Name;
    }

    public double getBalance() {
        return Balance;
    }

    public BankAccount() {

    }

    public BankAccount(int AccNum, String Name, double Balance) {
        this.AccNum = AccNum;
        this.Name = Name;
        this.Balance = Balance;
    }

    public void Deposit(double money) {
        Balance += money;
    }

    public boolean Widthdraw(double money) {
        if (Balance < money) {
            return false;
        }
        Balance -= money;
        return true;
    }

    public boolean transferMoney(BankAccount acc2, double money) {
        if (Balance < money) {
            return false;
        }
        acc2.Deposit(money);
        Balance -= money;
        return true;
    }
    
    public boolean CompareAccountNumber(int acc) {
        return acc == AccNum;
    }

    public void Print() {
        System.out.println("Account Number: " + AccNum);
        System.out.println("Name: " + Name);
        System.out.println("Balance: " + Balance);
    }

    public String ToString() {
        return String.valueOf(Balance);
    }
    
    public void Input() {
        System.out.println("Account Number: ");
        AccNum = obj.nextInt();
        System.out.println("Name: "+Name);
        Name = obj.nextLine();
        System.out.println("Balance: "+Balance);
        Balance = obj.nextDouble();
    }
}
