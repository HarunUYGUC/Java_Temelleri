package com.mycompany.java_temelleri;

public class Obje_Referanslari {
    
    public static void main(String[] args) {
        
        Account account1 = new Account("Harun 1234", "1234.456@hotmail.com", "456466");

        Account account2 = account1;
        
        Account account3 = new Account();
        
        if (account1 == account2) {
            System.out.println("Aynı objeyi gösteriyorlar.");
        }
        
        if (account1 == account3) {
            System.out.println("Aynı objeyi gösteriyorlar.");
        }
        else {
            System.out.println("Aynı objeyi göstermiyorlar.");
        }
        
        // Burada Nese oluşturuyoruz ama Nesne'yi referansa atamıyoruz. 
        // Sınıf'a verileri gönderip tek seferlik bu çıktıyı kullanabiliyoruz.
        // Fonksiyonlarda buna benzer bir kullanım yapıyorduk, onun gibi.
        new Account("Kyle Crane", "kyle.crane@hotmail.com", "4456").bilgileriGoster(); 
    }
}
