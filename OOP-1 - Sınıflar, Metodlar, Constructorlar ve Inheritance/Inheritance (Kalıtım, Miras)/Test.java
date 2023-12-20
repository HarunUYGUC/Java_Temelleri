package com.mycompany.java_temelleri;

public class Test {
    
    public static void main(String[] args) {
        
        Yonetici yonetici1 = new Yonetici("Harun Uyguç", 2500, "IT", 10);
        
        yonetici1.bilgileri_goster();
        yonetici1.zam_yap(200);
    }
}
