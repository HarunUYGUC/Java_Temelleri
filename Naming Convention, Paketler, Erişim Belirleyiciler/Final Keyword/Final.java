package com.mycompany.java_temelleri;

public class Final {
    
    // 1. Kullanım Şekli:
    /*
    public final int obje_sayisi = 4;

    public Final() {
    }
    */
    
    // 2. Kullanım Şekli:
    /*
    public final int obje_sayisi;

    public Final() {
        obje_sayisi = 4;
    }
    */
    
    public final int obje_sayisi;
    private static int say = 0;
    private final String isim;
    
    public Final(String isim) {
        this.isim = isim;
        say++;
        obje_sayisi = say;
    }

    // obje_sayisi ve isim özellikleri için Getters & Setters yazılmaz.
    // Çünkü değerleri değiştirilemiyor, gerek yok.
    
    public static int getSay() {
        return say;
    }

    public static void setSay(int say) {
        Final.say = say;
    }
    
}
