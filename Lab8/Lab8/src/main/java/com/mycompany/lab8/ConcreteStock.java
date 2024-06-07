/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

import java.util.ArrayList;

/**
 *
 * @author Tai-E758
 */
public class ConcreteStock implements Stock {

    private String symbol;
    private double currentPrice;
    private ArrayList<Investor> investors = new ArrayList<>();

    public ConcreteStock(String symbol, double currentPrice) {
        this.symbol = symbol;
        this.currentPrice = currentPrice;
    }

    public void addObserver(Investor investor) {
        this.investors.add(investor);
    }

    public void removeObserver(Investor investor) {
        this.investors.remove(investor);
    }

    public void notifyInvestors(double priceChange) {
        currentPrice = priceChange;
        for (Investor investor : investors) {
            investor.update(symbol, priceChange);
        }
    }
}
