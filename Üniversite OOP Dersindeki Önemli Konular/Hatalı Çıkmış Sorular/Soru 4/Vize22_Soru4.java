package com.mycompany.java_temelleri;

public class Vize22_Soru4 {
    
    private static int i = 2;
    private int no;
    
    public void Soru4() {
        no = i++;
    }
    
    public void Soru4(int i) {
        no = i;
    }
    
    public String geriVer() {
        return "no"+no;
    }
}
