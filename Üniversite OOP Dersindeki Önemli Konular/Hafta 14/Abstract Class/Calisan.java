package com.mycompany.java_temelleri;

public abstract class Calisan {
    
    private String ad;
    
    // Tüm çalışanların ücretine zam yapmak için static anahtar kelimesini kullandık.
    // set_ucret() metotu da tüm çalışanlara zam yapmak için bulunmalı.
    // protected static int saatlikUcret; 
    
    protected int saatlikUcret;
    protected int calismaSaati;
    
    public Calisan(String a, int ucret, int cs) {
        ad = a; saatlikUcret = ucret;
        calismaSaati = cs;
    }
    
    public abstract int hesapla();
    
    // Belirli bir çalışanın ücretine zam yapmak için bu metotu oluşturduk.
    public void set_ucret(int ucret) {
        saatlikUcret = ucret;
    }
    
    public String toString() {
        return String.format("Saatlik Ücret = %d, Çalışma Saati = %d", saatlikUcret, calismaSaati);
    }
}
