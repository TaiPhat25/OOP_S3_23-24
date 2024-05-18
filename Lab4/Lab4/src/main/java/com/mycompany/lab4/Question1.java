/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Question1 {

    static Scanner obj = new Scanner(System.in);
    static Random rd = new Random();

    private String wordEng;
    private String wordViet;
    HashMap<String, String> wordMap = new HashMap<>();
    HashMap<Long, Long> numberMap = new HashMap<>();

    public Question1() {

    }

    public Question1(String wordEng, String wordViet) {
        this.wordEng = wordEng;
        this.wordViet = wordViet;
    }

    public String getWordEng() {
        return wordEng;
    }

    public String getWordViet() {
        return wordViet;
    }

    public void setWordEng(String wordEng) {
        this.wordEng = wordEng;
    }

    public void setWordViet(String wordViet) {
        this.wordViet = wordViet;
    }

    public boolean Check(HashMap<String, String> wordMap, String w) {
        return wordMap.containsKey(w);
    }
    
    public boolean Check1(HashMap<Long, Long> numberMap, Long nu) {
        return numberMap.containsKey(nu);
    }
}
