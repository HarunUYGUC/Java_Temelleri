package com.mycompany.java_temelleri;

public class Muhendis extends Kisi {
    
    private int id;
    protected int maas, calismaSaati;
    
    public Muhendis(String n, String sn, Time bd, int id, int m, int cs) {
        super(n, sn, bd);
        this.id = id;
        maas = m; calismaSaati = cs;
    }
    
    public int GetId() {return id;}
    
    public void ben_kimim() {
        System.out.println("Ben bir MUHENDIS'im. Adim = " + name + 
                ", Dogum gunum = " + bDay.GetDay() + "/" + bDay.GetMonth() + 
                "/" + bDay.GetYear() + ", Maasim = " + maas);
    }
    
    public int maas_hesapla() {
        return maas * calismaSaati;
    }
}
