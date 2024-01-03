package com.mycompany.java_temelleri;

public class PC_Muhendisi implements Inter_Muhendis {

    private boolean askerlik;
    private boolean adliSicil;

    public PC_Muhendisi(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }
    
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
    public void is_tecrubesi(String array[]) {
        System.out.println("Bilgisayar Mühendisi olarak şu şirketlerde çalıştım...");
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
