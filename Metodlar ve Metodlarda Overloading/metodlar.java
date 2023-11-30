package com.mycompany.java_temelleri;

import java.util.Scanner;

public class metodlar {
    
    public static void selamlama() {
        
        System.out.println("Merhaba, nasılsınız? ");
        System.out.println("Selamlar...");
    }
    
    public static void faktoriyel() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        
        int faktoriyel = 1;
        
        while (sayi > 0) {
            
            faktoriyel *= sayi;
            sayi--;
        }
        
        System.out.println("Faktöriyel = " + faktoriyel);
    }
    
    public static void main(String[] args) {
        
        /*
        erişim_belirleyici(Opsiyonel) ekstra_özellikler dönüş_tipi fonksiyon_adı(parametreler) {
            // fonksiyon bloğu
            // fonksiyonun yapacağı işlemler
        }
        */
        
        selamlama();
        selamlama();

        faktoriyel();
        faktoriyel();

    }
}
