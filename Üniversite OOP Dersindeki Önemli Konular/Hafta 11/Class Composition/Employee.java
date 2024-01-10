package com.mycompany.java_temelleri;

public class Employee {
    
    private String firstName;
    private String lastName;
    private Date birthDate; // Diğer sınıftan üretilen Instance Variable Nesnesi.
    private Date hireDate; // Diğer sınıftan üretilen Instance Variable Nesnesi.
    
    // Sınıfın Constructor'ı parametre olarak diğer sınıftan üretilen Instance Variable Nesnesi'ni aldı.
    public Employee(String first, String last, Date dateOfBirth, Date dateOfHire) {
        firstName = first;
        lastName = last;
        birthDate = dateOfBirth;
        hireDate = dateOfHire;
    }

   /* Sınıftan ürettiğimiz nesneyi yazdırdığımızda "Blue, Bob Hired: 3/12/1988 Birthday: 7/24/1949"
    metnini otomatik olarak bu özel fonksiyonu çağırarak yazdırır. */    
    public String toString() {
        return String.format("%s, %s Hired: %s Birthday: %s", lastName, firstName, hireDate, birthDate);
    }
}
