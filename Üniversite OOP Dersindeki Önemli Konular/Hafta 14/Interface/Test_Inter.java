package com.mycompany.java_temelleri;

public class Test_Inter {
    
    public static void main(String[] args) {
        
        // Tüm ödeme alanları.
        // Tek bir dizide tutmak istiyorum.
        Inter dizi[] = new Inter[4];
        
        dizi[0] = new Satin_Al("u1", 10, 100);
        dizi[1] = new Satin_Al("u2", 5, 10);
        dizi[2] = new Sal_Emp("Ali", 1234, 2500);
        dizi[3] = new P_Emp("Veli", 200, 2500, 1.5, 10);
        
        for (int i = 0; i < dizi.length; i++) {
            System.out.printf("\n%s", dizi[i].toString());
        }
    }
}
