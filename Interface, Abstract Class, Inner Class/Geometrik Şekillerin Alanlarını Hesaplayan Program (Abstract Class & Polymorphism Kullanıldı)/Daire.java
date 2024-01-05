package com.mycompany.java_temelleri;

public class Daire extends Sekil {

    private int yariCap;
    
    public Daire(String isim, int yariCap) {
        super(isim);
        this.yariCap = yariCap;
    }

    @Override
    public void alan_hesapla() {
        System.out.println(getIsim() + "'ın alanı = " + (Math.PI * yariCap * yariCap));
    }
}
