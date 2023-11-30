package com.mycompany.java_temelleri;

import java.util.Scanner;

public class scanner_sorunu {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Integer, double, ... gibi veri tiplerinden sonra 
        // sonra string veri girişi alamıyoruz.
        // Önce string veri tipinde daha sonra da diğer veri tiplerinde
        // giriş alarak da bu sorunu çözebiliriz.
        System.out.println("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();
        
        // Bunun önüne geçmek için bu şekilde bir kod yazmalıyız.
        scanner.nextLine(); // Dummy input aldık.
        
        System.out.println("İsminizi giriniz: ");
        String isim = scanner.nextLine();
        
        System.out.println("Yaş: " + yas);
        System.out.println("İsim: " + isim);
        
        
        // Enter ile değil de boşluk ile arka arkaya int veri tipinde
        // veri girişi alabiliriz.
        System.out.println("Yaş1: ");
        int yas1 = scanner.nextInt();
        System.out.println("Yaş2: ");
        int yas2 = scanner.nextInt();
        System.out.println("Yaş3: ");
        int yas3 = scanner.nextInt();
        
        System.out.println("Yas1: " + yas1 + " Yas2: " + yas2 + " Yas3: " + yas3);
    }
}
