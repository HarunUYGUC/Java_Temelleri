package com.mycompany.java_temelleri;

public class Kart {
   
    private String kartNo, kartTuru;
    
    public Kart(String no, String tur) {
        kartNo = no;
        kartTuru = tur;
    }
    
    public String to_string() {
        return kartTuru + " " + kartNo;
    }
}
