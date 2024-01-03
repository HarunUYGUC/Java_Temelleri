package com.mycompany.java_temelleri;

public class Takim_Lideri extends Muhendis {
    
    private int projeSayisi;
    
    public Takim_Lideri(String n, String sn, Time bd, int id,
            int m, int cs, int ps) {
        super(n, sn, bd, id, m, cs);
        projeSayisi = ps;
    }
    
    public void ben_kimim() {
        System.out.println("Ben bir TAKIM_LIDERI'yim. Adim = " + name + 
                ", Dogum gunum = " + bDay.GetDay() + "/" + bDay.GetMonth() + 
                "/" + bDay.GetYear() + ", Maasim = " + maas);
    }
    
    public int maas_hesapla() {
        return maas * calismaSaati * projeSayisi;
    }
    
    public void mtd() {
        System.out.println("TK metodu");
    }
}
