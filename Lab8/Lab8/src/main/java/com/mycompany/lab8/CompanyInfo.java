/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author Tai-E758
 */
public class CompanyInfo {

    private static CompanyInfo instance;

    private String companyName;
    private String address;
    private String phoneNumber;
    private String email;
    private String owner;

    private CompanyInfo() {

    }

    private CompanyInfo(String companyName, String address, String phoneNumber, String email, String owner) {
        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.owner = owner;
    }

    public static CompanyInfo getInstance() {
        if (instance == null) {
            instance = new CompanyInfo();
        }
        return instance;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getOwner() {
        return owner;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    

    public void displayInfo() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Owner: " + owner);
    }
}
