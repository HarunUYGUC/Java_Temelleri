package com.mycompany.java_temelleri;

public class Yuzdeli extends Calisan {
    
    private int yuzde;
    
    public Yuzdeli(String a, int ucret, int cs, int y) {
        super(a, ucret, cs);
        yuzde = y;
    }
    
    public int hesapla() {
        if (calismaSaati > 20) {
            return saatlikUcret + ((calismaSaati - 20) * yuzde);
        }
        else {
            return saatlikUcret * calismaSaati;
        }
    }
    
    public String toString() {
        return String.format("%s Yuzde = %d", super.toString(), yuzde);
    }
}
