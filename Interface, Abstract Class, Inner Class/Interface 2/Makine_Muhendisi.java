package com.mycompany.java_temelleri;

// İki farklı Interface bir sınıfa bu şekilde implement edilebilir.
public class Makine_Muhendisi implements Inter_Muhendis, Inter_Calisma {

    private boolean askerlik;
    private boolean adliSicil;

    public Makine_Muhendisi(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }
    
    // Sağ tık -> Insert Code -> Implement Method
    
    @Override
    public void askerlik_durumu_sorgula() {
        if (askerlik) {
            System.out.println("Askerliğimi yaptım.");
        }
        else {
            System.out.println("Askerliğimi henüz yapmadım.");
        }
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        return "Ortalamam = " + derece;
    }

    @Override
    public void adli_sicil_sorgula() { 
        if (adliSicil) {
            System.out.println("Adli sicil kaydım bulunuyor.");
        }
        else {
            System.out.println("Herhangi bir adli sicil kaydım bulunmuyor.");
        }
    }

    @Override
    public void is_tecrubesi(String[] array) {
        if (array.length == 0) {
            System.out.println("Herhangi bir iş tecrübem bulunmuyor.");
        }
        else {
            System.out.println("Makine Mühendisi olarak şu şirketlerde çalıştım...");
            
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }

    // Inter_Calisma Interface'ine ait metot. 
    // Yukarıdaki metotlar ise Inter_Muhendis'e ait.
    @Override
    public void calis() {
        System.out.println("Makine Mühendisi çalışıyor...");
    }
    
    // Interface'de olmayan metot tanımladık.
    public void referans_getir(String array[]) {
        if (array.length == 0) {
            System.out.println("Herhangi bir referansım bulunmuyor...");
        }
        else {
            System.out.println("Referanslarım...");
            
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }
}
