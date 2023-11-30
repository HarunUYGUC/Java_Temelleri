package com.mycompany.java_temelleri;

import java.util.Scanner;

public class for_döngüsü {

    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }
        
        
        int j;
        
        for (j = 0; j < 5; j++) {
            System.out.println("j = " + j);
        }        
        
        // Bu alttaki kullanım C'den farklı ve çok ilginç.
        int k = 0;
        
        for (; k < 5; k++) {
            System.out.println("k = " + k);
        }        
        
        //Bu kullanım da bir ilginç.
        int l = 0;
        int m = 10;
        
        for (; (l < 10) && (m > 0); l++, m--) {
            System.out.println("l = " + l);
            System.out.println("m = " + m);
        }
        
        // Farklı bir kullanım daha.
        for (int n = 2; n < 100; n *= 2) {
            System.out.println("n = " + n);
        }
        
    }
}
