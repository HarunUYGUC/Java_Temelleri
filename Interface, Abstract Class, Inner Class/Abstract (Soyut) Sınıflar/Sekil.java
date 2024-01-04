package com.mycompany.java_temelleri;

// Abstract Sınıf bu şekilde tanımlanır.
// Abstract Sınıf'dan tıpkı Interface'ler gibi nesne üretilemez.
// Hem gövdeli hem gövdesiz metot bulunabilir.
// Özellik eklenebilir.
// Bir tane Abstract Metot bulunmalıdır.

public abstract class Sekil {
    
    // Özellik
    private String isim;

    // Constructor
    public Sekil(String isim) {
        this.isim = isim;
    }
    
    // Abstract Olmayan Metot
    public void ismini_soyle() {
        System.out.println("Bu obje " + isim + " objesidir.");
    }
    
    // Abstract Metot
    // Alt sınıflar bu metotu mutlaka kendi sınıfı içerisinde doldurmalıdır.
    abstract void alan_hesapla();

    // Getters & Setters
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    } 
}
