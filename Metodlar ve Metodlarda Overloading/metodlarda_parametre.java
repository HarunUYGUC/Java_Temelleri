package com.mycompany.java_temelleri;

import java.util.Scanner;

public class metodlarda_parametre {
    
    public static void toplama(int a, int b, int c) {
        
        System.out.println("Toplamları = " + (a + b + c));
    }
    
    public static void selamlama(String isim) {
        
        System.out.println("Selamlar, " + isim);
    }
    
    public static void main(String[] args) {
        // Java class yapısı üzerine kurulu olduğu için ve class'lara özel fonksiyonlara
        // da metod dediğimiz için Java'da fonksiyon kelimesi yerine genelde metod
        // kelimesi kullanılır.
        
        selamlama("Harun.");
        selamlama("Uyguç.");
        
        toplama(3, 4, 5);
        toplama(10, 12, 20);

    }
}
