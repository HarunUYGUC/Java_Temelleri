package com.mycompany.java_temelleri;

public class Hesap {
    
    private String kullanici_adi;
    private String parola;
    private int bakiye;
    
    /* Sırasıyla; Sağ Tık, Insert Code, Constructor adımlarını uyguladıktan sonra
    karşımıza gelen Generate Constructor ekranında az önce tanımladığımız özellikler
    gözükecek ve onları seçip Generate diyeceğiz. */
    
    // Constructor
    public Hesap(String kullanici_adi, String parola, int bakiye) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    /* Sırasıyla; Sağ Tık, Insert Code, Getter and Setter adımlarını uyguladıktan sonra
    karşımıza gelen Generate Getters and Setters ekranında az önce tanımladığımız özellikler
    gözükecek ve onları seçip Generate diyeceğiz. */
    
    // Getter and Setter Metots.
    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    // Kendi oluşturacağımız metotlar.
    
    public void paraYatir(int tutar) {
        
        bakiye += tutar;
        System.out.println("Yeni Bakiyeniz = " + bakiye);
    }
    
    public void paraCek(int tutar) {
        
        if ((bakiye - tutar) < 0) {
            System.out.println("Yeterli Bakiyeniz Yok...");
        }
        else {
            bakiye -= tutar;
            System.out.println("Yeni Bakiyeniz = " + bakiye);
        }
    }
}
