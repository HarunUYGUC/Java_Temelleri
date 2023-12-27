package com.mycompany.java_temelleri;

public class Main {
    
    public static void main(String[] args) {
        
        Abone abone = new Abone();
        
        /* Encapsulation'a aykırı kullanım yaptığımız için yani private özellik
        yerine public özellik tanımladığımız için diğer sınıftaki özelliklere direkt
        olarak bu sınıftan ulaşabiliyoruz. */
        abone.isim = "Harun Uyguç";
        abone.bakiye = 200;
        abone.sehir = "Çanakkale";
        
        abone.dogalgaz_kullan(200);
    }
}
