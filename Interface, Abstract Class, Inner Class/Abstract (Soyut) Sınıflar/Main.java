package com.mycompany.java_temelleri;

public class Main {
    
    public static void main(String[] args) {
        
        // Sekil sekil = new Sekil("Sekil");
        // Abstract Sınıftan nesne üretilemez demiştik.
        
        // Abstract Sınıftan referans üretip alt sınıfa referans gösterebiliriz.
        Sekil sekil;
        sekil = new Kare("Kare1", 6);
        
        Kare kare1 = new Kare("Kare1", 5);
        Daire daire1 = new Daire("Daire1", 3);
        
        kare1.alan_hesapla();
        daire1.alan_hesapla();
        sekil.alan_hesapla();
        
        kare1.cevre_hesapla();
        // sekil.cevre_hesapla();
    }
}
