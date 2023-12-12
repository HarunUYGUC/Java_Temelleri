package com.mycompany.java_temelleri;

import java.util.Random;

public class Kart_Destesi {
    
    private int KART_SAYISI = 52;
    private Kart[] deste;
    
    public Kart_Destesi() {
        String[] no = {"As", "Papaz", "Kiz", "Vale", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] tur = {"Kupa", "Karo", "Sinek", "Maca"};
        
        deste = new Kart[KART_SAYISI];
        
        for (int i = 0; i < deste.length; i++) {
            deste[i] = new Kart(no[i % 13], tur[i / 13]);
        }
    }
    
    public void kart_karistir() {
        int birinci;
        int siradakiKart = 0; // Hatalı
        Random rnd = new Random();
        
        for (birinci = 0; birinci < deste.length; birinci++) {
            int ikinci = rnd.nextInt(KART_SAYISI);
            Kart temp = deste[birinci];
            deste[birinci] = deste[ikinci];
            deste[ikinci] = temp;
        }
    }
    
    // Hatalı
    public Kart dagit() {
        if (siradakiKart < deste.length)
            return deste[siradakiKart++];
        else
            return null;
    }
}
