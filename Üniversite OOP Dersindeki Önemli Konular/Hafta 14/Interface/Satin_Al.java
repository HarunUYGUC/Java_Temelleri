package com.mycompany.java_temelleri;

public class Satin_Al implements Inter {
    
    private String urun;
    private double fiyat, mik;
    
    public Satin_Al(String u, double f, double m) {
        urun = u;
        fiyat = f;
        mik = m;
    }
    
    public double Hesapla() {
        return fiyat * mik;
    }
    
    public String toString() {
        return String.format("Ürün = %s, Mik = %f, Fiyat = %f, Ödeme = %f", urun, mik, fiyat, Hesapla());
    }
}
