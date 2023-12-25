package com.mycompany.java_temelleri;

public class Time1_Test {
    
    public static void main(String[] args) {
        
        Time1 time = new Time1();
        
        System.out.print("The inital universal time is: ");
        System.out.println(time.toUniversalString());
        System.out.print("The inital standard time is: ");
        System.out.println(time.toString());
        System.out.println(); // Bir satır boş bırakır.
        
        time.setTime(13, 27, 6);
        System.out.print("Universal time after setTime is: ");
        System.out.println(time.toUniversalString());
        System.out.print("Standard time after setTime is: ");
        System.out.println(time.toString());
        System.out.println();
        
        try {
            time.setTime(99, 99, 99);
        }
        catch (IllegalArgumentException e) {
            System.out.printf("Exception: %s\n\n", e.getMessage());
        }
        
        System.out.println("After attempting invalid settings: ");
        System.out.print("Universal time: ");
        System.out.println(time.toUniversalString());
        System.out.print("Standard tiime: ");
        System.out.println(time.toString());
    }
}
