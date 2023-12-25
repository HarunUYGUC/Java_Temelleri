package com.mycompany.java_temelleri;

public class Patron extends Yuzdeli_Calisan {
    
    public Patron(String a, String s, int ID, double ucret, double saat, double yuz) {
        super(a, s, ID, ucret, saat, yuz);
    }
    
    public void mtd() {
        System.out.println("Patron Sinifi Saatlik Ucreti = " + ucret + " Superclass'ın saatlik ucreti = " + super.GetUcret());
    }
}
