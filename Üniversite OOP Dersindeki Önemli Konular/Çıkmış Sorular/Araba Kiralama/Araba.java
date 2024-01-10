package com.mycompany.java_temelleri;

public class Araba {
    
    private String model;
    private int basKm, bitisKm, ucret;
    
    public Araba(String m) {
        model = m;
        
        if (model == "Model1")
            ucret = 100;
        else
            ucret = 150;
    }

    public void setBasKm(int basKm) {
        this.basKm = basKm;
    }

    public void setBitisKm(int bitisKm) {
        this.bitisKm = bitisKm;
    }
    
    public int ucret_hesapla(Araba a) {  
        int son;
        son = a.bitisKm - a.basKm;
        return son * a.ucret;
    } 

    /* Nesne üzerinden çağırdığımız metota parametre olarak tekrar kendisini göndermek
    aslında çok saçma ama soruda bu şekilde söylenmiş. Yukarıdaki kod yerine aşağıdaki 
    kodu yazmamız aslında yeterli. Araba_Test dosyasında da a1.ucret_hesapla() şeklinde
    bu metodu kullanmalıyız. */

    */
    public int ucret_hesapla() {  
        int son;
        son = bitisKm - basKm;
        return son * ucret;
    } 
    */
}
