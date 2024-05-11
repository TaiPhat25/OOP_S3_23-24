/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class CDInformation {

    static Scanner obj = new Scanner(System.in);
    private long cdID;
    private String cdCollection;
    private String cdType;
    private String cdTitle;
    private int cdPrice;
    private int cdYearOfRelease;

    public void setCdID(long cdID) {
        this.cdID = cdID;
    }

    public void setCdCollection(String cdCollection) {
        this.cdCollection = cdCollection;
    }

    public void setCdType(String cdType) {
        this.cdType = cdType;
    }

    public void setCdTitle(String cdTitle) {
        this.cdTitle = cdTitle;
    }

    public void setCdPrice(int cdPrice) {
        this.cdPrice = cdPrice;
    }

    public void setCdYearOfRelease(int cdYearOfRelease) {
        this.cdYearOfRelease = cdYearOfRelease;
    }

    public long getCdID() {
        return cdID;
    }

    public String getCdCollection() {
        return cdCollection;
    }

    public String getCdType() {
        return cdType;
    }

    public String getCdTitle() {
        return cdTitle;
    }

    public int getCdPrice() {
        return cdPrice;
    }

    public int getCdYearOfRelease() {
        return cdYearOfRelease;
    }

    public CDInformation(long cdID, String cdCollection, String cdType, String cdTitle, int cdPrice, int cdYearOfRelease) {
        this.cdID = cdID;
        this.cdCollection = cdCollection;
        this.cdType = cdType;
        this.cdTitle = cdTitle;
        this.cdPrice = cdPrice;
        this.cdYearOfRelease = cdYearOfRelease;
    }

    public CDInformation() {

    }

    public void Input() {
        System.out.print("CD ID: ");
        cdID = obj.nextLong();
        System.out.print("CD Collection: ");
        cdCollection = obj.next();
        System.out.print("CD Type: ");
        cdType = obj.next();
        System.out.print("CD Title: ");
        cdTitle = obj.next();
        System.out.print("CD Price: ");
        cdPrice = obj.nextInt();
        System.out.print("CD Year Of Release: ");
        cdYearOfRelease = obj.nextInt();
    }

    public void Output() {
        System.out.println("CD ID: " + cdID);
        System.out.println("CD Collection: " + cdCollection);
        System.out.println("CD Type: " + cdType);
        System.out.println("CD Title: " + cdTitle);
        System.out.println("CD Price: " + cdPrice);
        System.out.println("CD Year Of Release: " + cdYearOfRelease);
    }

    

}
