package com.mycompany.java_temelleri;

import java.util.*;

public class Poly_Test {
    
    public static void main(String[] args) {
        
        /* Alt sınıftan üretilecek nesnelerin hepsini
        üst sınıfları olan Calisan sınıfından ürettiğimiz
        dizide saklayacağız. */
        Calisan calisanlar[] = new Calisan[3];
        
        for (int i = 0; i < 3; i++) {
            calisanlar[i] = calisan_sec();
        }
        
        for (int j = 0; j < 3; j++) {
            ben_kimim(calisanlar[j]);
        }
    }
    
    public static Calisan calisan_sec() {
        Random rnd = new Random();
        int sec;
        
        sec = rnd.nextInt(3);
        Calisan c1 = null;
        
        if (sec == 0)
            c1 = new Calisan();
        if (sec == 1)
            c1 = new Muhendis();
        if (sec == 2)
            c1 = new Patron();
        
        return c1;
    }
    
    public static void ben_kimim(Calisan a) {
        a.mtd();
    }
}
