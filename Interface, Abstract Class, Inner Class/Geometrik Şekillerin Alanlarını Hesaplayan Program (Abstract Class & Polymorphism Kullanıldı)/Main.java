package com.mycompany.java_temelleri;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "İşlemler...\n"
                        + "1. Karenin Alanını Hesapla...\n"
                        + "2. Üçgenin Alanını Hesapla...\n"
                        + "3. Dairenin Alanını Hesapla...\n"
                        + "Çıkış: q";
        
        while (true) {
            System.out.println(islemler);
            System.out.print("Hangi şeklin alanını hesaplamak istiyorsunuz?: ");
            String sekilTuru = scanner.nextLine();
            
            Sekil sekil = null; // Polymorphism için hazırlık.
            
            if (sekilTuru.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if (sekilTuru.equals("1")) {
                System.out.print("Karenin Kenarı: ");
                int kenar = scanner.nextInt(); // Scanner sorununu önlemek için.
                scanner.nextLine();
                
                sekil = new Kare("Kare1", kenar);
                sekil.alan_hesapla(); // Polymorphism
            }
            else if (sekilTuru.equals("2")) {
                System.out.print("Kenar 1: ");
                int kenar1 = scanner.nextInt();

                System.out.print("Kenar 2: ");
                int kenar2 = scanner.nextInt();
                
                System.out.print("Kenar 3: ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine(); // Scanner sorununu önlemek için.
                
                sekil = new Ucgen("Üçgen1", kenar1, kenar2, kenar3);
                sekil.alan_hesapla();
            }
            else if (sekilTuru.equals("3")) {
                System.out.print("Dairenin Yarıçapı: ");
                int yariCap = scanner.nextInt();
                scanner.nextLine(); // Scanner sorununu önlemek için.
                
                sekil = new Daire("Daire1", yariCap);
                sekil.alan_hesapla();
            }
            else {
                System.out.println("Geçersiz İşlem...");
            }
        }
    }
}
