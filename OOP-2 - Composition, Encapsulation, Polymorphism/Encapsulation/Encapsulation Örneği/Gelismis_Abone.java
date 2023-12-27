package com.mycompany.java_temelleri;

public class Gelismis_Abone {
    
    // Encapsulation'a uygun bir durum.
    // Public özellik yerine private özellik tanımladık.
    private String isim;
    /* Nesne üretilirken 0-120 arasından farklı değer girersek Constructor'da kontrol ettiğimiz
    gibi bu 120 değeri otomatik olarak o nesnenin bakiyesine atanacaktır. 0-120 arasında
    değer girersek ise Constructor'da kontrol ettiğimiz gibi 120 yerine artık nesnenin
    bakiyesi girdiğimiz değer olacaktır. */
    private int bakiye = 120;
    private String sehir;
    
    public Gelismis_Abone(String isim, int bakiye, String sehir) {
        this.isim = isim;
        this.sehir = sehir;
        
        if (bakiye >= 0 && bakiye <= 120) {
            this.bakiye = bakiye;
        }
    }
    
    public void dogalgaz_kullan(int miktar) {
        if ((this.bakiye - miktar) < 0) {
            System.out.println("Yeterli Bakiye Yok.");
        }
        else {
            this.bakiye -= miktar;
            
            if (this.bakiye <= 0) {
                System.out.println("Bakiyeniz bitmiştir. Lütfen en yakın abone "
                        + "merkezine giderek kredi yükleyiniz. Kredi Limiti = 120 TL");
            }
            else {
                System.out.println("Yeni Bakiye = " + bakiye);
            }
        }
    }
    
    public void bakiye_ogren() {
        System.out.println("Bakiye = " + bakiye);
    }
}
