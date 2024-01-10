package com.mycompany.java_temelleri;

public class Employee_Test {
    
    public static void main(String[] args) {
        
        Date birth = new Date(7, 24, 1949);
        Date hire = new Date(3, 12, 1988);
        // Diğer sınıflardan türettiğimiz nesneleri bu sınıfa parametre olarak gönderdik.
        Employee employee = new Employee("Bob", "Blue", birth, hire);
        
        /* Sınıftan ürettiğimiz nesneyi yazdırdığımızda "Blue, Bob Hired: 3/12/1988 Birthday: 7/24/1949"
        metnini otomatik olarak bu özel fonksiyonu çağırarak yazdırır. */
        System.out.println(employee);
    }
}
