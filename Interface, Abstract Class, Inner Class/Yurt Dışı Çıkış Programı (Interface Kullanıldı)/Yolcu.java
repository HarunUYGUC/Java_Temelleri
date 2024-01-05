package com.mycompany.java_temelleri;

import java.util.Scanner;

public class Yolcu implements Yurt_Disi_Kurallari {
    
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Yatırdığınız harç bedeli: ");
        this.harc = scanner.nextInt();
        scanner.nextLine(); /* Scanner'da int veri girişinden sonra hata
        alınabiliyordu. Bu hatanın önüne geçmek için böyle bir şey yapıyorduk. */
        
        System.out.print("Herhangi bir siyasi yasağınız bulunuyor mu? (evet / hayır): ");
        String cevap = scanner.nextLine();
        
        if (cevap.equals("evet")) {
            this.siyasiYasak = true;
        }
        else {
            this.siyasiYasak = false;
        }
        
        System.out.print("Vizenin bulunuyor mu? (evet / hayır): ");
        String cevap2 = scanner.nextLine();
        
        if (cevap2.equals("evet")) {
            this.vizeDurumu = true;
        }
        else {
            this.vizeDurumu = false;
        }
    }
    
    @Override
    public boolean yurtDisiHarciKontrol() {
        if (this.harc < 15) {
            System.out.println("Lütfen yurtdışı çıkış harcını tam yatırınız.");
            return false;
        }
        else {
            System.out.println("Yurtdışı harcı tamam!");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if (this.siyasiYasak == true) {
            System.out.println("Siyasi yasağınız bulunuyor! Yurtdışına çıkamazsınız!");
            return false;
        }
        else {
            System.out.println("Siyasi yasağınız bulunmuyor.");
            return true;
        }
    }

    @Override
    public boolean vizeDurumuKontrol() {
        if (this.vizeDurumu == true) {
            System.out.println("Vize işlemleri tamam.");
            return true;
        }
        else {
            System.out.println("Vizeniz gideceğiniz ülkeye bulunmamaktadır!");
            return false;
        }
    }
}
