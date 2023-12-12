package com.mycompany.java_temelleri;

public class Matris_Toplami {
    
    public static void main(String[] args) {
        
        int matris1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int matris2[][] = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int sonucMatrisi[][];
        
        sonucMatrisi = topla(matris1, matris2);
        
        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris1[0].length; j++) {
                System.out.printf("%d ", sonucMatrisi[i][j]);
            }
            
            System.out.printf("\n");
        }
    }
    
    public static int[][] topla(int m1[][], int m2[][]) {
        
        int i, j;
        int sonuc[][] = new int[m1.length][m1[0].length];
        
        for (i = 0; i < m1.length; i++) {
            for (j = 0; j < m1[0].length; j++) {
                sonuc[i][j] = m1[i][j] + m2[i][j];
            }
        }
        
        return sonuc;
    }
}
