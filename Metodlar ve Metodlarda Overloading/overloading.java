package com.mycompany.java_temelleri;

public class overloading {
    
    public static void toplama(String a, String b) {
        
        System.out.println(a + " " + b);
    }
    
    public static void toplama(int a, int b) {
        
        System.out.println("Toplamları = " + (a + b));
    }
    
    public static void toplama(int a, int b, int c) {
        
        System.out.println("Toplamları = " + (a + b + c));
    }
    
    
    public static void skor_hesapla(String isim, int puan) {
        
        System.out.println(isim + " adlı oyuncunun " + puan + " puanı var.");
    }
    
    public static void skor_hesapla(int puan) {
        
        System.out.println("İsimsiz oyuncunun " + puan + " puanı var.");
    }
    
    public static void skor_hesapla(String isim) {
        
        System.out.println(isim + " adlı oyuncunun hiç puanı yok.");
    }
    
    public static void main(String[] args) {
        
        // Bir fonksiyonu birden fazla kez farklı şekilde tanımlayarak
        // metod overloading yapmış oluyoruz.
        // Yani bir fonksiyona birden fazla iş yüklemiş oluyoruz.
        toplama(3, 4, 5);
        toplama(2, 5);
        toplama("Harun", "Uyguç");
        
        skor_hesapla("Harun", 1000);
        skor_hesapla("Uyguç");
        skor_hesapla(1500);
        
    }
}
