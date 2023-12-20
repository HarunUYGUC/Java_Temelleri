package com.mycompany.java_temelleri;

public class Kopek extends Hayvan {
    
    private int disSayisi;
    
    public Kopek(String isim, int kilo, int boy, int bacakSayisi, int disSayisi) {
        super(isim, kilo, boy, bacakSayisi);
        
        this.disSayisi = disSayisi;
    }
    
    public void harekete_gec(int hiz) {
        System.out.println("Köpek " + hiz + " m/sn ile hareket ediyor...");
    }
    
    public void kos(int hiz) {
        System.out.println("Köpek koşuyor...");
        
        // Üst sınıftaki harekete_gec() metotu çalışır.
        super.harekete_gec(hiz);
        
        // Bu sınıftaki harekete_gec() metotu çalışır.
        // Overrite yapmış oluruz.
        harekete_gec(hiz);
        
        /* Bu fonksiyonda harekete_gec() metotu olmasaydı
        harekete_gec(hiz); yazınca üst sınıftaki metot çalışır. 
        yani super kullanmadan da aynı görevi yapabiliriz. */
    }

    /**
     * @return the disSayisi
     */
    public int getDisSayisi() {
        return disSayisi;
    }

    /**
     * @param disSayisi the disSayisi to set
     */
    public void setDisSayisi(int disSayisi) {
        this.disSayisi = disSayisi;
    }
}
