package com.mycompany.java_temelleri;

import java.util.*;

public class Zaman_Islemleri {
    
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int sure;
        int zaman[] = new int[3];
        
        System.out.println("Saniye Cinsinden Süreyi Giriniz: ");
        sure = inp.nextInt();
        
        zaman = zaman_cevir(zaman, sure);
        
        System.out.println("Saat = " + zaman[0]);
        System.out.println("Dakika = " + zaman[1]);
        System.out.println("Saniye = " + zaman[2]);
    }
    
    public static int[] zaman_cevir(int zaman[], int sure) {
        
        for (int i = 0; i < zaman.length; i++) {
            switch (i) {
                case 0: zaman[i] = sure / 3600; break;
                case 1: zaman[i] = (sure - (zaman[0]*3600)) / 60; break;
                case 2: zaman[i] = sure - (zaman[0]*3600 + zaman[1]*60); break;
            }
        }
        
        return zaman;
    }
}
