package com.mycompany.java_temelleri;

class Hayvan {
    
    private String isim;

    public Hayvan(String isim) {
        super();
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String Konus() {        
        return "Hayvan Konuşuyor..";
    } 
}
