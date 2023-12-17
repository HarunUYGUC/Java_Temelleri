package com.mycompany.java_temelleri;

public class Finally {
    
    public static void main(String[] args) {
        
        // Try - Catch yapısında Finally bloğu exception olsa da olmasa da çalışır.
        
        // Hatayı yakaladık sonra da finally bloğu çalıştı.
        try {
            String s = null;
            
            System.out.println(s.hashCode()); // NullPointerException
        }
        catch (NullPointerException e) {
            System.out.println("Null Referans Hatası!!!");
        }
        finally {
            System.out.println("Finally bloğu çalışıyor.");
        }
        
        System.out.println("------------");
        
        // Hata yok ama finally bloğu yine de çalıştı.
        try {
            String s = "Harun";
            
            System.out.println(s.hashCode());
        }
        catch (NullPointerException e) {
            System.out.println("Null Referans Hatası!!!");
        }
        finally {
            System.out.println("Finally bloğu çalışıyor.");
        }
        
        System.out.println("------------");
        
        // Hata var ama hatayı yakalamadık. finally bloğu yine de çalıştı.
        // finally bloğundan sonra program sonlanır çünkü hatayı yakalamaık.
        try {
            int a = 30 / 0;
        }
        catch (NullPointerException e) {
            System.out.println("Null Referans Hatası!!!");
        }
        finally {
            System.out.println("Finally bloğu çalışıyor.");
        }
    }
}
