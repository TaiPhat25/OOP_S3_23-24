/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab4;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Main {

    static Scanner obj = new Scanner(System.in);

    public static void main(String[] args) {
//        var wordMap = new HashMap<String, String>();
//        Question1 q1 = new Question1();
//
//        wordMap.put("Ice Cream", "Kem");
//        wordMap.put("Water", "Nuoc");
//        wordMap.put("Computer", "May Vi Tinh");
//        wordMap.put("Wallpaper", "Hinh Nen");
//        wordMap.put("Earth", "Trai Dat");
//
//        System.out.println("Enter The Word You Want To Look Up: ");
//        var w = obj.nextLine();
//
//        // Check if a word exists
//        if (q1.Check(wordMap, w)) {
//            System.out.println("Founded");
//        } else {
//            System.out.println("Not Found");
//        }
//
//        // Find the meaning of a word
//        if (q1.Check(wordMap, w)) {
//            System.out.println(wordMap.get(w));
//        } else {
//            System.out.println("Not Found");
//        }
//
//        // Look up the word that user need and print the meaning of it
//        var rd = new Random();
//        var map = new HashMap<Long, Long>();
//        for (int i = 0; i < 500; i++) {
//            var w1 = rd.nextLong();
//            var w2 = rd.nextLong();
//            map.put(w1, w2);
//        }
//
//        var wordNumber = 0;
//        for (var m : map.keySet()) {
//            System.out.println(m);
//            wordNumber++;
//            if (wordNumber == 10) {
//                break;
//            }
//        }
//
//        System.out.println("Enter The Word That Need To Look Up: ");
//        var nu = obj.nextLong();
//
//        if (q1.Check1(map, nu)) {
//            System.out.println(map.get(nu));
//        } else {
//            System.out.println("Not Found");
//        }

        BankFactory bf1 = new BankFactory();
        var type = obj.nextInt();
        Bank bank;

        switch (type) {
            case 1 -> {
                bank = bf1.getBank(BankType.TPBank);
                System.out.println(bank.getBankName());
            }
            case 2 -> {
                bank = bf1.getBank(BankType.VietcomBank);
                System.out.println(bank.getBankName());
            }
            default ->
                System.out.println("Not Found");
        }
    }
}
