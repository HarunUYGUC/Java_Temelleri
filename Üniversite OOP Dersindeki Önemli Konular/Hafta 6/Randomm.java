package com.mycompany.java_temelleri;

import java.util.Random;

public class Randomm {
    
    public static void main(String[] args) {
        
        Random r = new Random(); //random sınıfı
        
        int a = r.nextInt(10);
        System.out.println(a);
    }
}
