package com.mycompany.java_temelleri;

import java.util.Scanner;

public class Cok_Boyutlu_Diziler {
    
    public static void main(String[] args) {
     
        int[] dizi = {1, 2, 3, 4, 5, 6};
        
        int[][] dizi2 = new int[2][2];
        
        dizi2[0][0] = 10;
        dizi2[0][1] = 20;
        dizi2[1][0] = 30;
        dizi2[1][1] = 40;
        
        System.out.println(dizi2[0][1]);
        
        int[][] dizi3 = {{10, 20}, {30, 40}};
        System.out.println(dizi3[0][1]);
        
        int[][] dizi4 = new int[2][2];
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Değer giriniz: ");
                dizi4[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("*************");
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(dizi4[i][j] + " ");
            }
            
            System.out.println("");
        }
    }    
}
