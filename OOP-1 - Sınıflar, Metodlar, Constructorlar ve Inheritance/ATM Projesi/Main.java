package com.mycompany.java_temelleri;

public class Main {
    
    public static void main(String[] args) {
        
        ATM atm = new ATM();
        Hesap hesap = new Hesap("Harun 12314", "5465486", 2000);
        
        
        atm.calis(hesap);
        System.out.println("Programdan Çıkılıyor...");
    }
}
