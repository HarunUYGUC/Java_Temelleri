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
    
    public String toString() {
        return String.format("%s, %s Hired: %s Birthday: %s", lastName, firstName, hireDate, birthDate);
    }
}
