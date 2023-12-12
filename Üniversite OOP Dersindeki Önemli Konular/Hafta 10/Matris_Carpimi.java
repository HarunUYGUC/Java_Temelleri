package com.mycompany.java_temelleri;

public class Matris_Carpimi {
    
    public static void main(String[] args) {
        
        int a[][] = {{1, 2}, {3, 4}};
        int b[][] = {{10, 20}, {30, 40}};
        carp(a, b);
    }
    
    public static void carp(int a[][], int b[][]) {
        
        int i, j, k;
        int sonuc[][] = new int[2][2];
        
        for (i = 0; i < 2; i++) {
            for (k = 0; k < 2; k++) {
                for (j = 0; j < 2; j++) {
                    sonuc[i][k] += a[i][j] * b[j][k];
                }
            }
        }
        
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.printf("%d ", sonuc[i][j]);
            }
            
            System.out.printf("\n");
        }
    }
}
