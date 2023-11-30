package com.mycompany.java_temelleri;

import java.util.*;

public class Istenen_Dizi_Elemanini_Degistir {
    
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int a[] = {1, 2, 3, 4};
        int el;
        
        System.out.println("Hangi eleman değiştirilecek?: ");
        el = inp.nextInt();
        
        System.out.println("Elemanın önceki hali: " + a[el]);
        a[el] = degistir(a[el]);
        System.out.println("Elemanın sonraki hali: " + a[el]);
    }
    
    public static int degistir(int a) {
        return a*2;
    }
}
