package com.mycompany.java_temelleri;

public class Exception_Propagation {
    
    // İç içe fonksiyonlarda hata yakalamaya Exception Propagation denir.
    
    // Yukarıdan aşağıya doğru bu fonksiyonların sırasında bir stack oluşur.
    // Hata en üstte oluştuğu için en üstten en alta kadar ilk başta oluşan hata yakalanmaya çalışılır.
    // Main'e geldiğimizde hala yakalanamadıysa program hata vererek sonlanır.
    public static void ucuncu_fonksiyon() {
        
        try {
            int a = 12 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Bir sayı 0'a bölünemez!!!");
        }
    }
    
    public static void ikinci_fonksiyon() {
        
        ucuncu_fonksiyon();
        
        // Stack'in en üsttündeki fonksiyonda hatayı yakalamak yerine burada veya daha
        // alt kısımda da bu hatayı yakalayabiliriz.
        /*
        try {
            ucuncu_fonksiyon();
        }
        catch (ArithmeticException e) {
            System.out.println("Bir sayı 0'a bölünemez!!!");
        }
        */
    }
    
    public static void birinci_fonksiyon() {
        
        ikinci_fonksiyon();
    }
    
    public static void main(String[] args) {
        
        birinci_fonksiyon();
    }
}
