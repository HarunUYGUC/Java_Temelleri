package com.mycompany.java_temelleri;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        /*
        Çalışanlar Programı
        
        Çalışan sınıfı şeklinde bir üst sınıf.
        
        Çalışan sınıfından türeyen yazılımcı adında bir alt sınıf.
        Çalışan sınıfından türeyen yönetici adında bir alt sınıf.
        
        */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Çalışanlar Programına hoşgeldiniz...");
        
        String islemler = "İşlemler... \n"
                        + "1. Yazılımcı İşlemleri \n"
                        + "2. Yönetici İşlemleri \n"
                        + "Çıkış için q'ya basınız.";
        
        System.out.println("***********************");
        System.out.println(islemler);
        System.out.println("***********************");

        while (true) {
            System.out.print("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("Harun", "Uyguç", 123, "Python, C, C++");
               
                String yazilimciIslem = "1. Format At \n"
                                      + "2. Bilgileri Göster \n"
                                      + "Çıkış için q'ya basınız.";
                
                System.out.println(yazilimciIslem);
                
                while (true) {
                    System.out.print("İşlemi seçiniz: ");
                    String yIslem = scanner.nextLine();
                    
                    if (yIslem.equals("q")) {
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor.");
                        break;
                    }
                    else if (yIslem.equals("1")) {
                        System.out.print("İşletim sistemi : ");
                        String isletimSistemi = scanner.nextLine();
                        
                        yazilimci.format_at(isletimSistemi);
                    }
                    else if (yIslem.equals("2")) {
                        yazilimci.bilgileri_goster();
                    }
                    else {
                        System.out.println("Geçersiz yazılımcı işlemi...");
                    }
                }
            }
            else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici("Harun", "Uyguç", 123, 10);
                
                String yoneticiIslem = "Yönetici İşlemleri \n"
                                     + "1. Zam Yap \n"
                                     + "2. Bilgileri Göster \n"
                                     + "Çıkış için q'ya basınız.";
                
                System.out.println(yoneticiIslem);
                
                while (true) {
                    System.out.print("İşlem seçiniz : ");
                    String yIslem = scanner.nextLine();
                    
                    if (yIslem.equals("q")) {
                        System.out.println("Yönetici işlemlerinden çıkılıyor...");
                        break;
                    }
                    else if (yIslem.equals("1")) {
                        System.out.print("Yöneticinin ne kadar zam yapmasını istiyorsunuz : ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine(); // Scanner hatasının önüne geçmek için.
                        yonetici.zam_yap(zamMiktari);
                    }
                    else if (yIslem.equals("2")) {
                        yonetici.bilgileri_goster();
                    }
                    else {
                        System.out.println("Geçersiz yönetici işlemi...");
                    }
                }
            }
            else {
                System.out.println("Geçersiz İşlem!!!");
            }
        }
    }
}
