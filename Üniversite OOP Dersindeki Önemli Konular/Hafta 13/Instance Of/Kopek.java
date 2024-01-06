package com.mycompany.java_temelleri;

class Kopek extends Hayvan {

    public Kopek(String isim) {
        super(isim);  
    }

    @Override
    public String Konus() {   
        return this.getIsim() + " Havlıyor..";
    } 
}
