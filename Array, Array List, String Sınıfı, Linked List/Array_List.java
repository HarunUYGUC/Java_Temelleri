package com.mycompany.java_temelleri;

import java.util.ArrayList;

public class Array_List {
    
    public static void yazdir(ArrayList <String> a) {
        
        for (int i = 0; i < a.size(); i++) {
            System.out.println((i + 1)+ ". eleman = " + a.get(i));
        }
    }
    
    public static void main(String[] args) {
        
        ArrayList <String> arraylist = new ArrayList<String>();
        
        arraylist.add("Metalica");
        arraylist.add("Guns's n Roses");
        arraylist.add("Black Sabbath");
        arraylist.add("Iron Maiden");
        arraylist.add("Metalica");
        
        System.out.println(arraylist.get(0));
        System.out.println(arraylist.get(3));
        
        System.out.println("arraylist'in eleman sayısı = " + arraylist.size());
        
        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }
        
        System.out.println("***********");
        
        arraylist.remove(1);
        
        arraylist.remove("Metalica"); /* Birden fazla aynı elemandan olursa
        ilk eleman silinir. */
        
        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }

        System.out.println("***********");
        arraylist.add("Metalica");
        
        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }
        
        System.out.println(arraylist.indexOf("Metalica")); /* Birden fazla 
        aynı elemandan olursa ilk elemanın indeksini verir. */

        System.out.println(arraylist.lastIndexOf("Metalica")); /* Birden fazla 
        aynı elemandan olursa son elemanın indeksini verir. */
        
        System.out.println(arraylist.indexOf("Dream Theater")); /* Bulunmayan
        elemanı aradığımız zaman sonuç -1 olur. */

        System.out.println("***********");
        arraylist.set(2, "Megadeath"); /* Belirtilen indeksteki
        elemanı belirttiğimiz eleman yaparız. */

        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }
        
        System.out.println("***********");
        yazdir(arraylist);
    }
}
