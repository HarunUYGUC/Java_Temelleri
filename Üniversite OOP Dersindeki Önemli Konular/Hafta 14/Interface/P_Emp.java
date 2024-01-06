package com.mycompany.java_temelleri;

public class P_Emp extends Sal_Emp {
    
    private double oran, satis;
    
    public P_Emp(String n, int i, double m, double o, double s) {
        super(n, i, m);
        oran = o; satis = s;
    }
    
    public double GetSatis() {return satis;}
    
    public double GetOran() {return oran;}
    
    public double Hesapla() {
        return GetMaas() + (GetOran() * GetSatis());
    }
    
    public String toString() {
        return String.format("%s", super.toString());
    }
}
