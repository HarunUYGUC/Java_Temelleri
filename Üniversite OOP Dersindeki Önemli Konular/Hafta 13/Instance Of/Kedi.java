package com.mycompany.java_temelleri;

class Kedi extends Hayvan {

    public Kedi(String isim) {
        super(isim); 
    }

    @Override
    public String Konus() {
        return this.getIsim() + " Miyavlıyor..";
    }  
}
