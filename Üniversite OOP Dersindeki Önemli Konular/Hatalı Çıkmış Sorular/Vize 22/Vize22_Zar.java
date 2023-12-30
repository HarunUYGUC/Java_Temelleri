package com.mycompany.java_temelleri;

import java.util.*;

public class Vize22_Zar {
    
    public static void main(String[] args) {
        
        int zar1, zar2;
        int freq[] = new int[11];
        
        while (true) {
            zar1 = zarAt();
            zar2 = zarAt();
            
            if (zar1 % 2 == 0 && zar1 == zar2) {
                System.out.println("Oyun Bitti!");
                break;
            }
            
            freq[zar1 + zar2 - 2]++;
        }
        
        for (int i = 0; i < freq.length; i++) {
            System.out.println("Freq " + (i + 2) + " : " + freq[i]);
        }
    }
    
    public static int zarAt() {
        
        Random ran = new Random();
        return 1 + ran.nextInt();
    }
}
