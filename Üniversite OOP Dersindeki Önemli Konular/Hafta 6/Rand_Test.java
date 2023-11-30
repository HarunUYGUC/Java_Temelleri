package com.mycompany.java_temelleri;

import java.util.*;

public class Rand_Test {
    
    public static void main(String[] args) {
        
        Random num = new Random();
        int zar1, zar2;
        
        zar1 = ZarToplam(num);
        zar2 = ZarToplam(num);
        
        if ((zar1 + zar2) % 2 == 0)
            System.out.println("Zar toplami = " + (zar1 + zar2) + " Çift Sayı");
        else
            System.out.println("Zar toplami = " + (zar1 + zar2) + " Tek Sayı");
    }
    
    public static int ZarToplam(Random r) {
        int sonuc;
        sonuc = 1 + r.nextInt(6); // 0 ile 5 arasından bir sayı üretir.
        // Zarda ise 1'den 6'ya kadar değerler vardır.
        // Bu değerleri elde etmek için +1 ekledik.
        return sonuc;
    }
}
