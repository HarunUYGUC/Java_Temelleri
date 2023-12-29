package com.mycompany.java_temelleri;

public class Main {
    
    public static void main(String[] args) {
        
        /* 
        => final anahtar kelimesiyle tanımlanan bir özelliğin değeri sadece
        bir defa verilebilir. Yani o özelliğe değer verdiğimiz zaman başka bir yerde
        bu özelliğin değeri değiştirilemez. 
        => O özelliğin bu değeri ya tanımlanırken ya da nesne oluştururken yani
        Constructor'ın içerisinde verilebilir. Başka bir fonskiyonda vb. değer verilemez. 
        => Bir özelliğin değerinin değiştirilmesini istemiyorsak kullanılabilir. 
        */
        
        Final f1 = new Final("Obje1");
        Final f2 = new Final("Obje2");
        
        System.out.println("Obje Sayısı: " + f1.obje_sayisi);
        System.out.println("Obje Sayısı: " + f2.obje_sayisi);
        
        // Math kütüphanesindeki Pİ sayısına bu şekilde ulaşabiliriz.
        // Math kütüphanesindeki bu Pİ sayısı şu şekilde tanımlanmıştır:
        // public static final double PI = 3.141592653589793
        System.out.println(Math.PI);
        
        System.out.println("Database İsmi: " + Database.databaseIsmi);
        System.out.println("Username: " + Database.userName);
        System.out.println("Password: " + Database.password);
    }
}
