package com.mycompany.java_temelleri;

public class Enumeration {
    
    enum Durum {Gec, Kal};
    public static void main(String[] args) {
    
        Durum a;
        
        a = Durum.Gec;
        System.out.println(a); // Gec
        
        a = Durum.Kal;
        System.out.println(a); // Kal
    }
}
