package com.mycompany.java_temelleri;

import java.util.*;

public class Zar_Oyunu {
    
    private enum Durum {Devam, Kazan, Kaybet};
    public static void main(String[] args) {
        
        Random num = new Random();
        int puan = 0;
        Durum OyunDurumu;
        int zarToplami = zarAt(num);
        
        switch (zarToplami) {
            case 7:
            case 11: OyunDurumu = Durum.Kazan;
                     break;
            case 2:
            case 3:
            case 12: OyunDurumu = Durum.Kaybet;
                     break;
            default:
                OyunDurumu = Durum.Devam;
                puan = zarToplami;
                System.out.println("Puan = " + puan);
        }
        
        while (OyunDurumu == Durum.Devam) {
            zarToplami = zarAt(num);
            System.out.println("Toplam = " + zarToplami);
            
            if (zarToplami == puan)
                OyunDurumu = Durum.Kazan;
            else
                if (zarToplami == 7)
                    OyunDurumu = Durum.Kaybet;
        }
        
        if (OyunDurumu == Durum.Kazan)
            System.out.println("KAZANDINIZ");
        else
            System.out.println("KAYBETTİNİZ");
    } 
    
    public static int zarAt(Random n) {
        return (1 + n.nextInt(6)) + (1 + n.nextInt(6));
    }
}
