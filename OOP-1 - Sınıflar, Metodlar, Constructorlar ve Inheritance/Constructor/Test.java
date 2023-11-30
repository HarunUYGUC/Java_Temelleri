package com.mycompany.java_temelleri;

public class Test {
    
    public static void main(String[] args) {
        
        // Nesne oluşturduğumuz zaman bütün özelliklere tek tek veri girmek 
        // çok sıkıntılı. Bu yüzden nesneyi oluşturduğumuz zaman bu verileri 
        // direkt girebiliriz. Bunun için özel bir metod var. Bunlara Yapıcı Metod
        // (Constructor) denir.
        
        Account account1 = new Account();
        
        account1.setHesapNo("123456");
        account1.setBakiye(1000.0);
        account1.setIsim("Harun 12345");
        account1.setEmail("12345.6789@hotmail.com");
        account1.setTelefonNo("908075");
        
        System.out.println("Bakiye1 = " + account1.getBakiye());
        
        System.out.println("---------------------");
        
        // Constructor
        
        // Bu alttaki satırda Java'nın kendi Constructor'ı çalışır.
        // Biz, istersek kendimiz de Constructor yazabiliriz.
        // Account account1 = new Account();
        
        Account account2 = new Account("123123", 1000.0, "Harun 123", "123.456@hotmail.com", "3214546");
        
        account2.paraYatir(500);
        account2.paraCekme(700);
        account2.paraCekme(1750);
        
        System.out.println("Bakiye2 = " + account2.getBakiye());
        
    }
}
