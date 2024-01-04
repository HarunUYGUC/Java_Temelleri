package com.mycompany.java_temelleri;

public class Daire extends Sekil {

    private int yaricap;
    
    public Daire(String isim, int yaricap) {
        super(isim);
        this.yaricap = yaricap;
    }
    
    /* Abstract Sınıf sayesinde hem alan_hesapla metotunu override ettik
    hem de getIsım() metotunu kullanabildik. 
    alan_hesapla() metotu Abstract metot iken getIsım() metotu Abstract olmayan metot. */
    
    @Override
    void alan_hesapla() {
        System.out.println(getIsim() + " alanı " + (Math.PI * yaricap * yaricap));
    }
}
