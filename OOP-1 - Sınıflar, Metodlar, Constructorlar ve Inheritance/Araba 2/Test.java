package com.mycompany.java_temelleri;

public class Test {
    
    public static void main(String[] args) {
        
        // Araba sınıfından araba1 nesnesini ürettik.
        Araba araba1 = new Araba();
        
        araba1.setModel("Renault");
        System.out.println("Arabanın modeli: " + araba1.getModel());
        
        araba1.setKapilar(-4);
        
        
        Araba araba2 = null;
        
    }
}
