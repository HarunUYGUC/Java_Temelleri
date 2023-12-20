package com.mycompany.java_temelleri;

// Alt Sınıf
public class Yazilimci extends Calisan {
    
    private String diller;
    
    public Yazilimci(String ad, String soyad, int id, String diller) {
        super(ad, soyad, id);
        this.diller = diller;
    }
    
    public void format_at(String isletimSistemi) {
        System.out.println(getAd() + " " + isletimSistemi + "'ni yüklüyor...");
    }

    /* Sağ tık -> Insert Code -> Override Metod ile kolay bir şekilde
    bu override işlemini yapabiliriz. Constructor, Getter ve Setter'lar için de 
    bu özelliği kullanıyorduk. */ 
    
    @Override
    public void bilgileri_goster() {
        super.bilgileri_goster();
        System.out.println("Yazılımcının bildiği diller : " + diller);
    }
}
