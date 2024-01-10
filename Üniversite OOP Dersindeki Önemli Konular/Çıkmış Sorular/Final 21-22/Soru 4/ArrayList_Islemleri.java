package com.mycompany.java_temelleri;

import java.util.ArrayList;

public class ArrayList_Islemleri {
    
    public static void KomsuSil(ArrayList <Integer> arr) {
        
        for (int i = 0; i < arr.size() - 1; i++) {            
            if (arr.get(i) > arr.get(i + 1)) {
                arr.remove(i);
                arr.remove(i);
                i--;
		/* ArrayList'ler dinamik olduğu için sildiğimiz indisteki değerin yerine
		hemen üst indisindeki değer gelecektir. Bu yüzden arr.remove(i) işlemini iki kere
		yapmalıyız. Daha sonra i-- yapmalıyız ki bu sayede sildiğimiz indis yerine gelen yeni 
		elemanı atlamayalım. */
            }            
        }
        
        if (arr.size() % 2 == 1) {
            arr.remove(arr.size() - 1);
        }
    }
    
    public static void main(String[] args) {
        
        ArrayList <Integer> arraylist = new ArrayList<>();
        
        arraylist.add(3);
        arraylist.add(7);
        arraylist.add(9);
        arraylist.add(2);
        arraylist.add(5);
        arraylist.add(5);
        arraylist.add(8);
        arraylist.add(5);
        arraylist.add(6);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(7);
        arraylist.add(3);
        arraylist.add(1);
        
        // arraylist.add(2); 
        /* Bunu eklersek listedeki eleman sayısı tek oluyor 
        ve sonda kalan 2 siliniyor. */

        System.out.println("İlk arraylist = " + arraylist);
        KomsuSil(arraylist);
        System.out.println("Son arraylist = " + arraylist);
    }
}
