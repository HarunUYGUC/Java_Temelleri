package com.mycompany.java_temelleri;

class Kus extends Hayvan {

    public Kus(String isim) {
        super(isim); 
    }

    @Override
    public String Konus() {
        return this.getIsim() + " Ötüyor..";
    }
}
