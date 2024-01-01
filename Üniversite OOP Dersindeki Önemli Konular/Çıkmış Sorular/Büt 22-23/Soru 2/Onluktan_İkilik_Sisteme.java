package com.mycompany.java_temelleri;

import java.util.Scanner;

public class Onluktan_İkilik_Sisteme {
    
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int decimal; // onluk
        int binary[] = new int[50];
        int index = 0;
        
        System.out.print("10'luk sistemde bir sayı yazınız: ");
        decimal = inp.nextInt();
        
        // Onluk sayının 2 ile modundan kalanları diziye sırasıyla yazıyoruz.
        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal /= 2;
        }
        
        // Diziye yazdığımız kalanları tersten yazıyoruz. 
        // Çünkü ikilik sistem hesaplaması bu şekilde yapılıyordu.
        /* Diziye baştan sona yazmak kolay olduğu için başta öyle yaptık 
        ama şimdi diziyi tersten yazmamız gerekiyor. */
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}
