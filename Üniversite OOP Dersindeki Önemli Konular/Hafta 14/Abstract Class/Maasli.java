package com.mycompany.java_temelleri;

public class Maasli extends Calisan {
    
    public Maasli(String a, int ucret, int calismaSaati) {
        super(a, ucret, calismaSaati);
    }
    
    public int hesapla() {
        return saatlikUcret * calismaSaati;
    }
}
