package com.mycompany.java_temelleri;

public class Try_Catch {
    
    public static void main(String[] args) {
        
        // Hatayı Ayıklamadıysak hata olan satırda program sonlanır.
        // Yani hatanın altındaki satırdaki kodlar çalışmaz.
        
        
        /* 
        try {
            // Exception Oluşturabilecek Kodlar
        }
        catch(Exception_Turu e){
            // Exception Durumunda Yapılacak İşlemler
        }
        */
        
        
        // int a = 30 / 0; // Unchecked Exception => ArithmeticException: / by zero
        
        // int a[] = {1, 2, 3, 4, 5};
        // System.out.println(a[6]); // Unchecked Exception => ArrayIndexOutOfBoundsException: 6
        
        
        try {
            int a = 30 / 0; // ArithmeticException
        }
        // Burada direkt hatanın türünü belirttik. Sadece belirttiğimiz türdeki hatada bu catch bloğu çalışacak.
        // Özellikle belirttiğimiz hata türleri Exception sınıfının alt sınıfıdır.
        catch (ArithmeticException e) {
            System.out.println("Bir sayı 0'a bölünemez!!!");
        }
        
        System.out.println("---------------");
        
        try {
            int a = 30 / 0; // ArithmeticException
        }
        // Burada ise hatanın türünü belirtmedik. Herhangi bir hatada bu catch bloğu çalışacak.
        catch (Exception e) {
            System.out.println("Bir sayı 0'a bölünemez!!!");
        }
        
        
        System.out.println("---------------");
        
        try {
            int a[] = {1, 2, 3, 4, 5};

            System.out.println(a[6]); // ArrayIndexOutOfBoundsException
        }
        // IndexOutOfBoundsException'ın alt sınıfı.
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dizinin boyunu aştınız!!!");
        }
        
        System.out.println("---------------");
        
        try {
            int a[] = {1, 2, 3, 4, 5};

            System.out.println(a[6]); // ArrayIndexOutOfBoundsException
        }
        // RuntimeException'ın alt sınıfı.
        catch (IndexOutOfBoundsException e) {
            System.out.println("Dizinin boyunu aştınız!!!");
        }
        
        System.out.println("---------------");
        
        try {
            int a[] = {1, 2, 3, 4, 5};

            System.out.println(a[6]); // ArrayIndexOutOfBoundsException
        }
        // Exception'ın alt sınıfı.
        catch (RuntimeException e) {
            System.out.println("Dizinin boyunu aştınız!!!");
        }
        
        System.out.println("---------------");
        
        try {
            int a[] = {1, 2, 3, 4, 5};

            System.out.println(a[6]); // ArrayIndexOutOfBoundsException
        }
        catch (Exception e) {
            System.out.println("Dizinin boyunu aştınız!!!");
        }
        
        
        System.out.println("---------------");
        
        try {
            int a[] = {1, 2, 3, 4, 5};

            System.out.println(a[6]); // ArrayIndexOutOfBoundsException
        }
        catch (Exception e) {
            e.printStackTrace(); 
            // Ne tür bir hata aldığımızı aşağıdaki gibi bize söyler.
            // java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
        }
        
        
        System.out.println("---------------");
        
        try {
            int a[] = {1, 2, 3, 4, 5};

            System.out.println(a[6]); // ArrayIndexOutOfBoundsException
            
            int b = 30 / 0; // ArithmeticException
        }
        // İki farklı hata aldık fakat ne tür bir hata olduğunu önemsemedik.
        // İlk hatayı aldığımız anda catch bloğu çalışacaktır.
        // Alt satırdaki kodlar çalışmayacağı için diğer hata oluşmayacak.
        catch (Exception e) {
            System.out.println("Bir hata oluştu!!!");
            e.printStackTrace();
            // Bu  yüzden sadece bu mesajı alacağız.
            // java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
        }
        
        
        System.out.println("---------------");
        
        // Farklı hataları ayrı ayrı ele almak için 1'den fazla catch bloğu kullandık.
        // Bir catch bloğu çalışınca diğer catch blokları çalışmaz.
        try {
            int b = 30 / 0; // ArithmeticException

            int a[] = {1, 2, 3, 4, 5};

            System.out.println(a[6]); // ArrayIndexOutOfBoundsException
        }
        catch (ArithmeticException e) {
            System.out.println("Bir sayı 0'a bölünemez!!!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dizinin boyunu aştınız!!!");
        }
        // Üst sınıf olan Exception burada yaptığımız gibi diğer alt sınıflardan sonra yazılmalı.
        catch (Exception e) {
            System.out.println("Bir hata oluştu!!!");
            e.printStackTrace();
        }
    }
}
