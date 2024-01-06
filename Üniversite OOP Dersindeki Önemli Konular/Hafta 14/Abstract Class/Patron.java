package com.mycompany.java_temelleri;

public class Patron extends Calisan {
    
    protected int maas;
    
    public Patron(String a, int ucret, int cs, int maas) {
        super(a, ucret, cs);
        this.maas = maas;
    }
    
    public int hesapla() {
        return maas + (calismaSaati * saatlikUcret);
    }
    
    public String toString() {
        return String.format("%s Yuzde = %d", super.toString(), maas);
    }
}
