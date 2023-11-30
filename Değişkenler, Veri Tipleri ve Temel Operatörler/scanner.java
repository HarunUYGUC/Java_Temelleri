package com.mycompany.java_temelleri;

import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lütfen bir yazı giriniz: ");
        String yazi = scanner.nextLine();  
        System.out.println("Yazı: " + yazi);
        
        // if bloğu bende çalışmıyor ama hocada çalışıyor!
        if (scanner.hasNextInt()){
            int sayi2 = scanner.nextInt();
            System.out.println("Sayı2: " + sayi2);
        }
        else{
            System.out.println("Lütfen bir sayı giriniz!!!");
        }
        
        System.out.print("Lütfen yaşınızı giriniz: ");
        int yas = scanner.nextInt();
        System.out.println("Yaşınız: " + yas);
        
        System.out.print("Ondalıklı bir sayı giriniz: ");
        double sayi = scanner.nextDouble();
        System.out.println("Sayı: " + sayi);
        
    }
}
