package com.mycompany.java_temelleri;

public class Vize22_Soru4_Main {
   
    public static void main(String[] args) {
        
        Vize22_Soru4 test[] = {new Vize22_Soru4(), new Vize22_Soru4(), new Vize22_Soru4(), new Vize22_Soru4(2)};
        
        for (int i = 0; i < test.length; i++) 
            System.out.println(test[i].geriVer());
    }
}
