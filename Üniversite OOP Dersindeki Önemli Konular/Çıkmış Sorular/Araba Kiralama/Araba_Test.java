package com.mycompany.java_temelleri;

import java.util.*;

public class Araba_Test {
    
    public static void main(String[] args) {
        
        Araba a1 = new Araba("Model1");
        Araba a2 = new Araba("Model2");

        Scanner inp = new Scanner(System.in);
        int km1, km2;
        
        System.out.println("İlk araç için başlangıç km?: ");
        km1 = inp.nextInt();
        System.out.println("İlk araç için bitiş km?: ");
        km2 = inp.nextInt();
        a1.setBasKm(km1);
        a1.setBitisKm(km2);
        
        System.out.println("İkinci araç için başlangıç km?: ");
        km1 = inp.nextInt();
        System.out.println("İkinci araç için bitiş km?: ");
        km2 = inp.nextInt();
        a2.setBasKm(km1);
        a2.setBitisKm(km2);
        
        System.out.println("İlk araç için ödenesi gereken ücret = " + a1.ucret_hesapla(a1));
        System.out.println("İkinci araç için ödenesi gereken ücret = " + a2.ucret_hesapla(a2));
    }
}
