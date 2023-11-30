package com.mycompany.java_temelleri;

import java.util.Scanner;

public class dizi {
    
    public static void diziyi_bastir(int[] dizi) {
        
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("Eleman " + (i + 1) + ": " + dizi[i]);
        }
    }
    
    public static double ortalama(int[] dizi) {
        
        int toplam = 0;
        
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }
        
        // Tam sayı bölü tam sayı yaparsak sonuç tam sayı çıkar.
        /* Bölme işleminde sonuç ondalıklı çıkabileceği için bu tam sayılardan birisini
        ondalıklı sayıya dönüştürmeliyiz. Böylece ondalıklı sayı bölü tam sayıdan sonuç
        ondalıklı sayı gelecektir. */
        return ((double)toplam / dizi.length);
    }
    
    public static void main(String[] args) {
        
        // Dizinin içerisi boş olacak şekilde böyle tanımlayabiliriz.
        int[] a = new int[10];
        
        a[5] = 32;
        a[9] = 50;
        
        // Dizinin içerisi dolu olacak şekilde böyle tanımlayabiliriz.
        int[] b = {30, 40, 50, 60 ,70};
        
        System.out.println(b[0]);
        System.out.println(b[2]);
        
        // Dizinin içerisini döngü yardımıyla doldurduk.
        int[] c = new int[5];
        
        for (int i = 0; i < 5; i++) {
            c[i] = i*4 + 2;
            System.out.println(c[i]);
        }
        
        // Dizinin içerisini kullanıcıdan aldığımız değerler ile doldurduk.
        int[] d = new int[5];
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". değeri gir.: ");
            a[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". değer = " + a[i]);
        }
        
        // Dizinin eleman sayısını veren metot'un, length, kullanımı.
        int[] e = {10, 20, 30, 40, 50, 60};
        System.out.println("Dizinin Eleman Sayısı = " + e.length);
        
        // Diziyi fonksiyona gönderdip fonksiyon ile yazdırdık.
        diziyi_bastir(e);
        
        // Diziyi fonksiyona gönderip dizinin elemanlarının toplamının ortalamasını
        // aldık. Ortalamayı da döndürdük.
        System.out.println("Ortalama = " + ortalama(e));
    }
}
