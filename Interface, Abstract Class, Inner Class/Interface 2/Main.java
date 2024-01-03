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
        
        
        System.out.println("------------");
        
        /* Inter_Muhendis muhendis2 = new Makine_Muhendisi(true, false);
        şeklinde bir tanımlama yapamayız. Çünkü Makine_Muhendisi sınıfında Interface'de
        olmayan referans_getir(String array[]) fonksiyonu var. Interface bu fonksiyonu
        göremeyeceği için "muhendis2.referans_getir(referans);" satırında hata alırız.
        Bu satırda hata almamak için şu şekilde bir kullanım yapabiliriz:
        ((Makine_Muhendisi)muhendis2).referans_getir(referans); */
        
        Makine_Muhendisi muhendis2 = new Makine_Muhendisi(true, false);
        
        String tecrube2[] = {};
        String referans[] = {"Harun Uyguç", "Kyle Crane"};
        
        muhendis2.adli_sicil_sorgula();
        muhendis2.askerlik_durumu_sorgula();
        System.out.println(muhendis2.mezuniyet_ortalamasi(2.31));
        
        muhendis2.is_tecrubesi(tecrube2);
        muhendis2.referans_getir(referans);
        
        // İkinci Interface'e ait metot.
        muhendis2.calis();
    }
}
