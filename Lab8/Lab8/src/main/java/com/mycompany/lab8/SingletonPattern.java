/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author Tai-E758
 */
public class SingletonPattern {
    
    public static void main(String[] args) {
        CompanyInfo companyInfo = CompanyInfo.getInstance();
        
        companyInfo.setCompanyName("EIU");
        companyInfo.setAddress("Thu Dau Mot City, Binh Duong");
        companyInfo.setPhoneNumber("(+84) 0274 222 0372");
        companyInfo.setEmail("EIU@eiu.edu.vn");
        companyInfo.setOwner("IDK");
        
        companyInfo.displayInfo();
    }
}
