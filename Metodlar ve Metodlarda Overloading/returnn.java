package com.mycompany.java_temelleri;

public class returnn {
    
    public static int toplama(int a, int b, int c) {
        
        return (a + b + c);
    }
    
    public static int ikiyle_carp(int a) {
        
        return a*2;
    }
    
    public static int ikiyle_topla(int a) {
        
        return a + 2;
    }
    
    public static int dortle_carp(int a) {
        
        return a*4;
    }
    
    public static int deneme(int a) {
        
        System.out.println("Çıktı veriliyor...");
        
        return a*2;
    }
    
    public static void main(String[] args) {

        System.out.println("Çıktı değeri = " + toplama(1, 2, 3));

        System.out.println("Sonuç = " + dortle_carp(ikiyle_topla(ikiyle_carp(8))));
        
        System.out.println(deneme(4));
        
    }
}
