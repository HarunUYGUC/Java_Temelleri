package com.mycompany.java_temelleri;

public class Calisan_Test {
    
    public static void main(String[] args) {
        
        Calisan c1 = new Calisan("ali", "veli", 123, 20, 20);
        Yuzdeli_Calisan c2 = new Yuzdeli_Calisan("ASD", "DSA", 125, 30, 30, 0.5);
        
        System.out.println(c1.GetAd() + " " + c1.GetSoyad() + " " + c1.GetId() + " Alacağı ücret = " + c1.Kazanc());
        System.out.println(c2.GetAd() + " " + c2.GetSoyad() + " " + c2.GetId() + " Alacağı ücret = " + c2.Kazanc());

        Patron p1 = new Patron("XYZ", "KLM", 100, 40, 50, 0.5);
        
        c1.mtd();
        c2.mtd();
        p1.mtd();
    }
}
