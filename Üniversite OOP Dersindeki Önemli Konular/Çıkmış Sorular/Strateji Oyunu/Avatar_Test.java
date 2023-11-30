package com.mycompany.java_temelleri;

import java.util.*;

public class Avatar_Test {
    
    public static void main(String[] args) {
        
        Avatar oyuncu1[] = new Avatar[5];
        Avatar oyuncu2[] = new Avatar[5];
        Random rnd = new Random();
        
        int puan1 = 0, puan2 = 0;
        int guc, tur;
        
        for (int i = 0; i < oyuncu1.length; i++) {
            guc = rnd.nextInt(10);
            tur = rnd.nextInt(2);
            
            oyuncu1[i] = new Avatar();
            oyuncu1[i].SetGuc(guc);
            oyuncu1[i].SetTur(tur);
        }
        
        for (int i = 0; i < oyuncu2.length; i++) {
            guc = rnd.nextInt(10);
            tur = rnd.nextInt(2);
            
            oyuncu2[i] = new Avatar();
            oyuncu2[i].SetGuc(guc);
            oyuncu2[i].SetTur(tur);
        }
        
        for (int i = 0; i < oyuncu1.length; i++) {
            System.out.println("İlk oyuncu için tür: " + oyuncu1[i].GetTur() + " Güç: " + oyuncu1[i].GetGuc());
        }    
        for (int i = 0; i < oyuncu2.length; i++) {
            System.out.println("İkinci oyuncu için tür: " + oyuncu2[i].GetTur() + " Güç: " + oyuncu2[i].GetGuc());  
        }
        
        for (int i = 0; i < oyuncu1.length; i++) {
            if (oyuncu1[i].GetTur() == oyuncu2[i].GetTur()) {
                if (oyuncu1[i].GetGuc() > oyuncu2[i].GetGuc()) {
                    puan1 += oyuncu1[i].GetGuc() - oyuncu2[i].GetGuc();
                }
                else {
                    puan2 += oyuncu2[i].GetGuc() - oyuncu1[i].GetGuc();
                }
            }
            else if (oyuncu1[i].GetTur() > oyuncu2[i].GetTur()) {
                puan1 += 10;
            }
            else {
                puan2 += 10;
            }
        }
        
        System.out.println("1. oyuncunun puanı = " + puan1);
        System.out.println("2. oyuncunun puanı = " + puan2);
        
        if (puan1 > puan2) {
            System.out.println("Kazanan 1. oyuncu.");
        }
        else if (puan1 < puan2) {
            System.out.println("Kazanan 2. oyuncu.");
        }
        else {
            System.out.println("Berabere.");
        }
    }
}
