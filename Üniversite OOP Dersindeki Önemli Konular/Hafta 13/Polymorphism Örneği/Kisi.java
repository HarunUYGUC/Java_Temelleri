package com.mycompany.java_temelleri;

public class Kisi {
    
    protected String name, sname;
    Time bDay;
    
    public Kisi(String n, String sn, Time bd) {
        name = n; sname = sn; bDay = bd;
    }
    
    public void ben_kimim() {
        System.out.println("Ben bir KISI'yim. Adim = " + name + 
                ", Dogum gunum = " + bDay.GetDay() + "/" + bDay.GetMonth() + 
                "/" + bDay.GetYear());
    }
}
