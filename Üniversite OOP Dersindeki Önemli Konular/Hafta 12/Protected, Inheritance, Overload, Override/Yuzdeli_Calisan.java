package com.mycompany.java_temelleri;

public class Yuzdeli_Calisan extends Calisan {
    
    private double yuzde;
    
    public Yuzdeli_Calisan(String a, String s, int ID, double ucret, double saat, double yuz) {
        super(a, s, ID, ucret, saat);
        yuzde = yuz;
    }
    
    @Override
    public double Kazanc() {
        double fazla; // Normal değişken.
        
        if (saat > 20) {
            fazla = super.saat - 20; // saat
            return (fazla * yuzde * ucret) + (20 * ucret); // super.ucret
        }
        else {
            return super.Kazanc();
        }
    }
    
    public void mtd() {
        System.out.println("Yuzdeli Calisan Sinifi Saatlik Ucreti = " + ucret + " Superclass'ın saatlik ucreti = " + super.GetUcret());
    }
}
