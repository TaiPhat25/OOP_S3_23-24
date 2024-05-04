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
public class Complex {
    private double re;
    private double im;
    
    public Complex() {
        
    }
    
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public void setIm(double im) {
        this.im = im;
    }
    
    public void InputComplex() {
        Scanner obj = new Scanner(System.in);
       re = obj.nextDouble();
       im = obj.nextDouble();
    }
    
    public void Print() {
        System.out.println(re+" i"+im);
    }
    
    public Complex Plus(Complex cp1) {
        Complex result = new Complex();
        result.setRe(this.re + cp1.getRe());
        result.setIm(this.re + cp1.getRe());
        return result;
    }
    
    public Complex Minus(Complex cp1) {
        Complex result = new Complex();
        result.setRe(this.re - cp1.getRe());
        result.setIm(this.re - cp1.getRe());
        return result;
    }
    
    public Complex Multiply(Complex cp1) {
        Complex result = new Complex();
        result.setRe(this.re*cp1.getRe() - this.im*cp1.getIm());
        result.setIm(this.re*cp1.getIm()+this.im*cp1.getRe());
        return result;
    }
    
//    public Complex Divide(Complex cp1) {
//        var resultRe = this.re  cp1.getRe();
//        var resultIm = this.im + cp1.getIm();
//        return new Complex(resultRe, resultIm);
//    }
}
