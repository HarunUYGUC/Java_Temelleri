package com.mycompany.java_temelleri;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("İdman Programında Hoşgeldiniz...");

        Scanner scanner = new Scanner(System.in);        
        
        String idmanlar = "Geçerli Hareketler... \n"
                        + "Burpee \n"
                        + "Pushup \n"
                        + "Situp \n"
                        + "Squat";

        System.out.println(idmanlar);        
        System.out.println("Bir idman oluşturun...");
        
        System.out.println("Burpee Sayısı: ");
        int burpee = scanner.nextInt();

        System.out.println("Pushup Sayısı: ");
        int pushup = scanner.nextInt();
        
        System.out.println("Situp Sayısı: ");
        int situp = scanner.nextInt();
        
        System.out.println("Squat Sayısı: ");
        int squat = scanner.nextInt();
        
        scanner.nextLine(); // Hatayı önlemek için yaptık.
        Idman idman = new Idman(burpee, pushup, situp, squat);
        System.out.println("İdmanınız Başlıyor...");
        
        while (idman.idman_bitti_mi() == false) {
            System.out.print("Hareket Türü (Burpee, Pushup, Situp, Squat): ");
            String tur = scanner.nextLine();
            
            System.out.print("Bu hareketten kaç tane yapacaksınız?: ");
            int sayi = scanner.nextInt();
            scanner.nextLine(); /* String ve int veri girişini arka arkaya yapınca bir
            hata alıyorduk. O hatanın önüne geçmek için bu kod satırını yazdık. */
            
            idman.hareket_yap(tur, sayi);
        }
        
        System.out.println("İdmanını başarıyla bitirdin.");
    }
}
