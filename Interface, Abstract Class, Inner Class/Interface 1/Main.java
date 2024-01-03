package com.mycompany.java_temelleri;

public class Main {
    
    public static void main(String[] args) {

        /* Inter_Muhendis muhendis1 = new Inter_Muhendis();
        şeklinde bir tanımlama yapamayız diye zaten demiştik. */
        
        /* Inter_Muhendis muhendis1 = new PC_Muhendisi(false, false);
        şeklinde ise tanımlama yapılabilir. Üst Sınıf, Alt Sınıf mantığı. */
        
        PC_Muhendisi muhendis1 = new PC_Muhendisi(false, false);
        
        muhendis1.askerlik_durumu_sorgula();
        muhendis1.adli_sicil_sorgula();
        System.out.println(muhendis1.mezuniyet_ortalamasi(3.07));

        String tecrube[] = {"Vestel", "Havelsan", "Turksat"};
        muhendis1.is_tecrubesi(tecrube);
    }
}
