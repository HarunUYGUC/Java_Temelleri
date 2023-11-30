package com.mycompany.java_temelleri;

import java.util.*;

public class Zar_Frekansi {
    
    public static void main(String[] args) {
        
	/* C'de bildiğimiz gibi int a[] = {} şeklinde de dizi tanımlayabiliyormuşuz. 
	int[] a = {} şeklinde saçma bir kullanım yapmaya bence gerek yok. */

	/* int[] a = new int[10]; kullanımı için de aynısı geçerli. Bence bu şekilde saçma 
	bir kullanım yapmaya gerek yok. 
	int a[] = new int[10] yapabiliriz. */

	/* Fonksiyona da int[] dizi şeklinde saçma bir şekilde göndermek yerine
	int dizi[] şeklinde göndermek bence daha mantıklı. */

        int freq[] = {0, 0, 0, 0, 0, 0};
        int i;
        int zar;
        
        for (i = 0; i < 10; i++) {
            zar = zar_at();
            System.out.println("Gelen zar = " + zar);
            
            switch (zar) {
                case 1: freq[0]++;
                    break;
                case 2: freq[1]++;
                    break;
                case 3: freq[2]++;
                    break;
                case 4: freq[3]++;
                    break;
                case 5: freq[4]++;
                    break;
                case 6: freq[5]++;
                    break;
            }
        }
        
        System.out.println("FREKANSLAR");
        
        for (i = 0; i < freq.length; i++)
            System.out.printf("%d. rakamdan %d tane geldi. \n", i + 1, freq[i]);        
    }
    
    public static int zar_at() {
        Random rnd = new Random();
        return 1 + rnd.nextInt(6);
    }
}
