package com.mycompany.java_temelleri;

public class Test {
    
    public static void main(String[] args) {
        
        Account account1 = new Account();
        System.out.println(account1.getEmail());
        
        System.out.println("---------------");
        
        Account account2 = new Account("Harun 123", "example@hotmail.com", "789455645");
        System.out.println(account2.getEmail());
        System.out.println(account2.getBakiye());

        System.out.println("---------------");

        account2.bilgileriGoster();
        
    }
}
 