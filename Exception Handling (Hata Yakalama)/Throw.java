package com.mycompany.java_temelleri;

import java.util.Scanner;

public class Throw {
    
    // Throw anahtar kelimesi ile istediğimiz zaman istediğimiz hatayı oluşturabiliriz.
    
    public static void mekan_kontrol(int yas) {
        
        if (yas < 18) {
            // Hata fırlattık fakat hatayı yakalamadığımız için program direkt olarak sonlanır.
            throw new ArithmeticException();
        }
        else {
            System.out.println("Mekana hoşgeldiniz...");
        }
    }
    
    public static void main(String[] args) {
                
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas = scanner.nextInt();
        
        // Hata fırlattık fakat hatayı yakalamadığımız için program direkt olarak sonlanır.
        // mekan_kontrol(yas);
        
        // Burada ise fırlattığımız hatayı yakalıyoruz.
        try {
            mekan_kontrol(yas);        
        }
        catch (ArithmeticException e) {
            System.out.println("18 yaşından küçükler mekana giremez!!!");
        }
    }
}
