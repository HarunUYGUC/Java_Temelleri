package com.mycompany.java_temelleri;

public class Employee_Test {
    
    public static void main(String[] args) {
        
        System.out.printf("Employees before instantiation: %d\n", Employee.getCount());

        Employee e1 = new Employee("Susan", "Baker");
        Employee e2 = new Employee("Bob", "Blue");
        
        System.out.println("\nEmployees after instantiation: ");
        /* Statik metod alt iki satırdaki gibi nesne üzerinden de çağırılabilir fakat
        sınıf üzerinden çağırmamız daha mantıklı olacaktır. Çünkü static kullanıyorsak 
        amacımız o olmalı. Bu yüzden IDE uyarı gösterir ama kodun çalışmasında bir
        sorun yoktur. */
        System.out.printf("via e1.getCount(): %d\n", e1.getCount());
        System.out.printf("via e2.getCount(): %d\n", e2.getCount());
        System.out.printf("via Employee.getCount(): %d\n", Employee.getCount());
        
        System.out.printf("\nEmployee 1: %s %s\nEmployee 2: %s %s\n", e1.getFirstName(), e1.getLastName(), e2.getFirstName(), e2.getLastName());
        
        e1 = null;
        e2 = null;
    }
}
