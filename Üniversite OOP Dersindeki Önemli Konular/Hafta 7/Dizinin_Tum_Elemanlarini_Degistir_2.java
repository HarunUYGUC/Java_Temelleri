package com.mycompany.java_temelleri;

public class Dizinin_Tum_Elemanlarini_Degistir_2 {
    
    public static void main(String[] args) {
        
        int a[] = {1, 2, 3, 4};
        
        mtd(a);
        
        for (int i = 0; i < a.length; i++)
            System.out.printf("%d, ", a[i]);
    }
    
    public static void mtd(int x[]) {
         
        for (int i = 0; i < x.length; i++)
            x[i] = x[i]*3;
    }
}
