package com.mycompany.java_temelleri;

public class For_Each_Dongusu {

    public static void main(String[] args) {
        
        String array[] = {"Elma", "Armut", "Kiraz"};
        int array2[] = {1, 2, 3, 4, 5, 6, 7};
        Deneme array3[] = {new Deneme("Harun Uyguç"), new Deneme("Kyle Crane"), new Deneme("Leon S. Kennedy")};
        
        // Normal For döngüsü.
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
        System.out.println("-------------------");
        
        // For Each döngüsü.
        for (String a : array) {
            System.out.println(a);
        }
        
        for (int i : array2) {
            System.out.println(i);
        }
        
        for (Deneme d : array3) {
            d.yaz();
        }
    }
}
