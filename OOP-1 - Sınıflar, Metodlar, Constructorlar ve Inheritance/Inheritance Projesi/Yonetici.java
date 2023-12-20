package com.mycompany.java_temelleri;

// Alt Sınıf
public class Yonetici extends Calisan {
    
    private int sorumluKisiSayisi;

    public Yonetici(String ad, String soyad, int id, int sorumluKisiSayisi) {
        super(ad, soyad, id);
        this.sorumluKisiSayisi = sorumluKisiSayisi;
    }

    @Override
    public void bilgileri_goster() {
        super.bilgileri_goster();
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı : " + sorumluKisiSayisi);
    }
    
    public void zam_yap(int zamMiktari) {
        System.out.println(getAd() + " çalışanlara " + zamMiktari + " kadar zam yapıyor...");
    }
}
