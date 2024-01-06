package com.mycompany.java_temelleri;

public abstract class Emp implements Inter {
    
    public String name;
    public int id;
    
    public Emp(String n, int i){
        name = n; id = i;
    }
    
    public int GetId() {return id;}
    
    public String GetName() {return name;}
    
    public String toString() {
        return String.format("%s %d\n", GetName(), GetId());
    }
}
