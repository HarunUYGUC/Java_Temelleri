package com.mycompany.java_temelleri;

public class Main {
    
    public static void main(String[] args) {
        
        Gelismis_Abone abone = new Gelismis_Abone("Harun Uyguç", 200, "Çanakkale");
        
        // Bakiyeyi 200 verdik ama 120 olarak istediğimiz gibi oluştu.
        abone.bakiye_ogren();
    }
}
