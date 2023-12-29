package com.mycompany.java_temelleri;

public class Kapsam_Sinifi {
    
    // Global değişken.
    private int privateDegisken = 30;

    public Kapsam_Sinifi() {
        System.out.println("privateDegisken = " + privateDegisken);
    }
    
        // Local değişken.
    public void onileCarp() {
        int privateDegisken = 10;
        
        for (int i = 0; i < 6; i++) {
            System.out.println("Local değişken yani i = 10 iken " + i + " * " + privateDegisken + " = " + (i * privateDegisken));
            // Sınıfa ait özelliği kullanmak için this anahtar kelimesi kullanılır.
            System.out.println("Global değişken yani i = 30 iken " + i + " * " + this.privateDegisken + " = " + (i * this.privateDegisken));
            System.out.println("---------------------------");
        }
    }
}
