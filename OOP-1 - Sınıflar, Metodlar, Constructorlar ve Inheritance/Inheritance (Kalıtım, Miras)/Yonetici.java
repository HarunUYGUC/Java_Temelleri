package com.mycompany.java_temelleri;

// Subclass (Alt Sınıf).
public class Yonetici extends Calisan {
    
    private int sorumluKisi; // Ekstra özellik.
    
    public Yonetici(String isim, int maas, String departman, int sorumluKisi) {
        /* Miras aldığımız sınıfın constructor'ını kullanmak için super() anahtar kelimesini 
        kullanmalıyız. Bu özellikleri Calisan sınıfında tanımladığımız için
        o sınıfın constructor'ını çağırıp tekrar tanımlama yapmamıza gerek kalmaz. */ 
        
        super(isim, maas, departman);

        this.sorumluKisi = sorumluKisi;
    }
    
    public void zam_yap(int zamMiktari) {
        System.out.println("Çalışanlara " + zamMiktari + " TL zam yapıldı.");
    }
    
    /* Overriding => Miras aldığımız metotları aynı isimle kendi sınıfımızda 
    da tanımlarsak bu metotu çağırdığımızda artık miras aldığımız metot değil 
    kendi metotumuz çağırılacaktır. 
    Yani overriding yaparak superclass'daki metotu iptal etmiş oluyoruz. */
    
    // @Override yazmamızı söylüyor NetBeans ama yazmasak da program doğru çalışıyor.
    public void bilgileri_goster() {
        /* Aşağıdaki şekilde yazarsak superclass'daki bilgileri_goster() fonksiyonu
        artık iptal olur. Fakat biz o fonksiyonu da kullanmak istiyorsak yorum bloğundan
        sonraki gibi yazmalıyız. */
        
        /*
        System.out.println("İsim : " + getIsim());
        System.out.println("Maaş : " + getMaas());
        System.out.println("Departman : " + getDepartman());
        
        System.out.println("Sorumlu kişi sayısı : " + sorumluKisi);
        */
        
        // Yani super anahtar kelimesi sayesinde üst sınıftaki özellikleri kullanabiliyoruz.
        
        super.bilgileri_goster();
        
        System.out.println("Sorumlu kişi sayısı : " + sorumluKisi);
    }
}
