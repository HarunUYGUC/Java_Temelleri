package com.mycompany.java_temelleri;

public class Degisken_Degerlerini_Degistir {
    
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        System.out.println("a: " + a + " b: " + b);
 
        a = a + b; // a = 30  b = 20
        b = a - b; // b = 10  a = 30
        a = a - b; // a = 20  b = 10
        
        System.out.println("Degiskenler degistirildi...\na: " + a + " b: " + b);
    }
}
