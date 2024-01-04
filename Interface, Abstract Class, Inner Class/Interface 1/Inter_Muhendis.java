package com.mycompany.java_temelleri;

/*
Bu Interface dosyasını oluşturmak için Java Class yerine 
Java Interface dosyasını seçmeliyiz.
*/

public interface Inter_Muhendis {
    
    /* Interface'den nesne üretemediğimiz için 
    metotları tanımlarken Erişim Belirleyici koymamıza gerek yok. */
    
    /* Fonksiyonları tanımlarız ama içlerini doldurmayız. 
    Bir sınıfa bu Interface dosyasını implement edersek (extends'de yaptığımız mantık)
    bu metotların hepsini o sınıf içerisinde yazıp içlerini doldurmalıyız. 
    Zaten bu Interface'in amacı da bu. Farklı sınıf dosyalarında aynı fonksiyonları 
    kullanmak zorundaysak burada hepsini belirtmiş oluyoruz ve aynı isimde ama 
    içerikleri farklı şekilde dolduruyoruz. Override etmiş oluyoruz.*/
    
    void askerlik_durumu_sorgula();
    String mezuniyet_ortalamasi(double derece);
    void adli_sicil_sorgula();
    void is_tecrubesi(String array[]);
}
