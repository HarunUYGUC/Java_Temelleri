package com.mycompany.java_temelleri;

public class ABS_Test {
    
    public static void main(String[] args) {
        
        Maasli c1 = new Maasli("Ali", 20, 20);
        Yuzdeli c2 = new Yuzdeli("Ahmet", 20, 30, 2);
        Patron c3 = new Patron("PTR", 30, 20, 100);
        
        System.out.printf("Ben bir %s'im, %s Toplam Ücret = %d", 
                c1.getClass().getName(), c1.toString(), c1.hesapla());
        
        System.out.printf("\nBen bir %s'im %s Toplam Ücret = %d",
                c2.getClass().getName(), c2.toString(), c2.hesapla());
        
        System.out.printf("\nBen bir %s'im %s Toplam Ücret = %d\n",
                c3.getClass().getName(), c3.toString(), c3.hesapla());
        
        // Maasli Calisan'ın ücretine zam yaptık.
        c1.set_ucret(30);
        System.out.print("----------------------");
        
        System.out.printf("\nBen bir %s'im, %s Toplam Ücret = %d", 
                c1.getClass().getName(), c1.toString(), c1.hesapla());
        
        System.out.printf("\nBen bir %s'im %s Toplam Ücret = %d",
                c2.getClass().getName(), c2.toString(), c2.hesapla());
        
        System.out.printf("\nBen bir %s'im %s Toplam Ücret = %d\n",
                c3.getClass().getName(), c3.toString(), c3.hesapla());
        
        // Tüm çalışanların ücretine zam yapmak için static anahtar kelimesini kullanmıştık.
        // Şimdi tüm çalışanların ücretine zam yaptık.
        c1.set_ucret(45);
        System.out.print("----------------------");

        System.out.printf("\nBen bir %s'im, %s Toplam Ücret = %d", 
                c1.getClass().getName(), c1.toString(), c1.hesapla());
        
        System.out.printf("\nBen bir %s'im %s Toplam Ücret = %d",
                c2.getClass().getName(), c2.toString(), c2.hesapla());
        
        System.out.printf("\nBen bir %s'im %s Toplam Ücret = %d\n",
                c3.getClass().getName(), c3.toString(), c3.hesapla());
    }
}
