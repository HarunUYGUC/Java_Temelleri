package com.mycompany.java_temelleri;

public class veri_tipleri_2 {

    public static void main(String[] args) {
        double a = 5.25;
        double b = 4.0;
        double c = 4d;
        double d = 4.25d;
        System.out.println(c);
        System.out.println(d);
        
        float e = (float)5.0;
        float f = 5f;
        float g = 5.2f;
        
        int h = 22 / 7;
        float i = 22f / 7f;
        double j = 22d / 7d;
        System.out.println("h: " + h);
        System.out.println("i: " + i);
        System.out.println("j: " + j);
        
        int k = 5;
        float l = k;
        System.out.println("k: " + k);
        System.out.println("l: " + l);

        double m = 3.52;
        float n = (float)m;
        System.out.println("m: " + m);
        System.out.println("n: " + n);
        
        double sayi1 = 70.25;
        double sayi2 = 60d;
        double sayi3 = 80.2;
        System.out.println("Ortalama Float: " + (sayi1 + sayi2 + sayi3) / 3);

        float sayii1 = 70.25f;
        float sayii2 = 60f;
        float sayii3 = 80.2f;
        System.out.println("Ortalama Double: " + (sayii1 + sayii2 + sayii3) / 3);
    }
}
