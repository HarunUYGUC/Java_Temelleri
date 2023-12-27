package com.mycompany.java_temelleri;

// Bir dosya içerisinde birden fazla sınıf tanımlanabilir.
/* Bunun için "public class dosya_adi" şeklinde değil de "class ad" şeklinde 
bir tanımlama yapmalıyız. public kelimesini kullanırsak dosya_adi ile sınıfın
adı aynı olması gerektiğinden ve aynı dosyada birden fazla aynı sınıf oluşacağı için
böyle bir şey olamaz. */

// Inheritance (Miras)
// Superclass
class Hayvan {
    
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public String konus() {
        return "Hayvan konuşuyor...";
    }
}

// Subclass
class Kedi extends Hayvan {

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " miyavlıyor...";
    } 
}

// Subclass
class Kopek extends Hayvan {

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " havlıyor...";
    } 
}

// Subclass
class At extends Hayvan {

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " kişniyor...";
    }
}

// Test Class
public class Main {
    
    /* Hayvan türünde değişken alacağını belirtip Kedi, Kopek, At türünde
    değişkenleri de üst sınıfları olan Hayvan sınıfını kullanarak bu fonksiyona
    parametre olarak atayabildik. Polymorphism sayesinde. */
    public static void konustur(Hayvan hayvan) {
        System.out.println(hayvan.konus());
    }
    
    public static void main(String[] args) {
        
        // Polymorphism => Bir tane referans birden farklı nesne gibi davranıyor. 
        /* İkinci örnekte Hayvan referansımız var fakat buna Kedi referansını 
        atadık ve sorun çıkmadı. */
        /* Alt sınıfların referansları üst sınıfların referanslarına eşitlenebilir.
        Polymorphism'de yaptığımız tam olarak budur. */
        /* Override aslında Polymorphism için kullanılıyor denilebilir.
        Aynı amaçtaki fonksiyonu o alt sınıf için özelleştiriyoruz. */
        /* Inheritance yapısında Polymorphism kullanılabilir. */
        Hayvan hayvan1 = new Hayvan("Limon");
        System.out.println(hayvan1.konus());
        
        Hayvan hayvan2 = new Kedi("Tekir");
        System.out.println(hayvan2.konus());
        
        Hayvan hayvan3 = new Kopek("Karabaş");
        System.out.println(hayvan3.konus());
        
        Hayvan hayvan4 = new At("Şahbatur");
        System.out.println(hayvan4.konus());
        
        // Alt sınıfta override işlemi yapmadıysak üst sınıftaki fonksiyon çağrılır.
        
        System.out.println("-------------------");
        
        konustur(new Hayvan("Limon"));
        konustur(new Kedi("Tekir"));
        konustur(new Kopek("Karabaş"));
        konustur(new At("Şahbatur"));
    }
}
