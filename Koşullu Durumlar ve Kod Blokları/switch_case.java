package com.mycompany.java_temelleri;

import java.util.Scanner;

public class switch_case {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bir sayı giriniz: ");
        int islem = scanner.nextInt();
        
        // switch-case yapısında gerçekleşen case, break görene kadar 
        // çalışmaya devam eder. Mesela case 1 sağlandı fakat break, default
        // da var ise default'a kadar bütün case'ler çalışır.
        
        // Çalışan case'in altındaki bütün durumlar çalışırken üstündeki
        // durumlar doğal olarak çalışmaz.
        
        switch(islem){
            case 1:
                System.out.println("1. işlem");
                break;
            case 2:
                System.out.println("2. işlem");
                break;
            case 3:
                System.out.println("3. işlem");
                break;
            default:
                System.out.println("Geçersiz işlem...");
                break;
        }
        
        switch(islem){
            case 1: {
                System.out.println("1. işlem");
                break;                
            }
            case 2: {
                System.out.println("2. işlem");
                break;                
            }
            case 3: {
                System.out.println("3. işlem");
                break;                
            }
            default: {
                System.out.println("Geçersiz işlem...");
                break;                
            }
        }
        
    }
}
