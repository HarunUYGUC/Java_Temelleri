package com.mycompany.java_temelleri;

import java.util.Arrays; // Arrays.metot_adi() kullanımlarını yapmak için. 
import java.util.Scanner;

public class Dizi_Islemleri {
    
    public static int[] diziyi_doldur(int sayi) {
        
        Scanner scanner = new Scanner(System.in);
        int[] cikti = new int[sayi];
        
        for (int i = 0; i < sayi; i++) {
            System.out.println("Değer giriniz: ");
            cikti[i] = scanner.nextInt();
        }
        
        return cikti;
    }
    
    public static void diziyi_bastir(int[] dizi) {
        
        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i + 1) + ". Eleman = " + +dizi[i]);
        }
    }
    
    // Diziyi küçükten büyüğe sıralayan fonksiyon.
    // Arrays.sort(dizi)
    
    public static void diziyi_sirala(int[] dizi) {
        
        Arrays.sort(dizi);
        diziyi_bastir(dizi);
    }
    
    public static void main(String[] args) {
        
        int[] a = diziyi_doldur(5);
        diziyi_bastir(a);
        
        System.out.println("Küçükten büyüğe sıralanmış dizi: ");
        diziyi_sirala(a);
        
        // Eşit değiller.
        /* Diziler referans (Adres) tipli saklandıkları için içerikleri aynı 
        olsa bile diziler eşit değildir. Çünkü farklı dizilerin adresleri farklıdır. */
        
        int[] a1 = {1, 2, 3, 4, 5, 6};
        int[] a2 = {1, 2, 3, 4, 5, 6};
        
        if (a1 == a2) {
            System.out.println("Eşitler");
        }
        else {
            System.out.println("Eşit değiller");
        }
        
        /* Dizilerin içeriklerinin aynı olup olmadığını merak ediyorsak
        Arrays.equals(dizi1, dizi2) metotunu kullanmamız gerekiyor. */
        
        if (Arrays.equals(a1, a2)) {
            System.out.println("Eşitler");
        }
        else {
            System.out.println("Eşit değiller");
        }
    }
}
