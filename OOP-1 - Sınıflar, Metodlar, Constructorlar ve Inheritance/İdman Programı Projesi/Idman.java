package com.mycompany.java_temelleri;

public class Idman {
    
    // Özellikler
    private int burpeeSayisi;
    private int pushupSayisi;
    private int situpSayisi;
    private int squatSayisi;

    // Constructor
    public Idman(int burpeeSayisi, int pushupSayisi, int situpSayisi, int squatSayisi) {
        this.burpeeSayisi = burpeeSayisi;
        this.pushupSayisi = pushupSayisi;
        this.situpSayisi = situpSayisi;
        this.squatSayisi = squatSayisi;
    }

    // Getters & Setters
    public int getBurpeeSayisi() {
        return burpeeSayisi;
    }

    public void setBurpeeSayisi(int burpeeSayisi) {
        this.burpeeSayisi = burpeeSayisi;
    }

    public int getPushupSayisi() {
        return pushupSayisi;
    }

    public void setPushupSayisi(int pushupSayisi) {
        this.pushupSayisi = pushupSayisi;
    }

    public int getSitupSayisi() {
        return situpSayisi;
    }

    public void setSitupSayisi(int situpSayisi) {
        this.situpSayisi = situpSayisi;
    }

    public int getSquatSayisi() {
        return squatSayisi;
    }

    public void setSquatSayisi(int squatSayisi) {
        this.squatSayisi = squatSayisi;
    }
    
    // Metots
    public void hareket_yap(String hareketTuru, int sayi) {
        
        if (hareketTuru.equals("Burpee")) {
            burpee_yap(sayi);
        }
        else if (hareketTuru.equals("Pushup")) {
            pushup_yap(sayi);
        }
        else if (hareketTuru.equals("Situp")) {
            situp_yap(sayi);
        }
        else if (hareketTuru.equals("Squat")) {
            squat_yap(sayi);
        }
        else {
            System.out.println("Geçersiz Hareket...");
        }
    }
    
    public void burpee_yap(int sayi) {
        
        if (burpeeSayisi == 0) {
            System.out.println("Yapacak burpee kalmadı...");
        }
        
        if ((burpeeSayisi - sayi) < 0) {
            System.out.println("Hedeflediğin burpee sayısını geçtin. Tebrikler!");
            burpeeSayisi = 0;
            System.out.println("Kalan Burpee Sayısı: " + burpeeSayisi);
        }
        else {
            burpeeSayisi -= sayi;
            System.out.println("Kalan Burpee Sayısı: " + burpeeSayisi);
        }
    }

    public void pushup_yap(int sayi) {
        
        if (pushupSayisi == 0) {
            System.out.println("Yapacak pushup kalmadı...");
        }
        else if ((pushupSayisi - sayi) < 0) {
            System.out.println("Hedeflediğin pushup sayısını geçtin. Tebrikler!");
            pushupSayisi = 0;
            System.out.println("Kalan Pushup Sayısı: " + pushupSayisi);
        }
        else {
            pushupSayisi -= sayi;
            System.out.println("Kalan Pushup Sayısı: " + pushupSayisi);
        }
    }
    
    public void situp_yap(int sayi) {
        
        if (situpSayisi == 0) {
            System.out.println("Yapacak situp kalmadı...");
        }
        else if ((situpSayisi - sayi) < 0) {
            System.out.println("Hedeflediğin situp sayısını geçtin. Tebrikler!");
            situpSayisi = 0;
            System.out.println("Kalan Situp Sayısı: " + situpSayisi);
        }
        else {
            situpSayisi -= sayi;
            System.out.println("Kalan Situp Sayısı: " + situpSayisi);
        }
    }
    
    public void squat_yap(int sayi) {
        
        if (squatSayisi == 0) {
            System.out.println("Yapacak squat kalmadı...");
        }
        else if ((squatSayisi - sayi) < 0) {
            System.out.println("Hedeflediğin squat sayısını geçtin. Tebrikler!");
            squatSayisi = 0;
            System.out.println("Kalan Squat Sayısı: " + squatSayisi);
        }
        else {
            squatSayisi -= sayi;
            System.out.println("Kalan Squat Sayısı: " + squatSayisi);
        }
    }
    
    public boolean idman_bitti_mi() {
        
        return (burpeeSayisi == 0) && (pushupSayisi == 0) && (situpSayisi == 0) && (squatSayisi == 0);
    }
}
