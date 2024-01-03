package com.mycompany.java_temelleri;

public class Poly_Test {
    
    public static void main(String[] args) {
        
        Time t1 = new Time(3, 3, 1973);
        Kisi i1 = new Kisi("Harun", "Uyguç", t1);
        Kisi i2;
        Muhendis i3, i4;
        Takim_Lideri i5;
        
        i2 = new Muhendis("A", "B", t1, 123, 300, 20);
        i3 = new Muhendis("ABC", "CBA", t1, 124, 300, 20);
        i4 = new Takim_Lideri("Lider", "XXX", t1, 125, 300, 20, 3);
        i5 = new Takim_Lideri("XYZ", "KLM", t1, 126, 300, 20, 6);
        
        i1.ben_kimim();
        i2.ben_kimim();
        i3.ben_kimim();
        i4.ben_kimim();
        i5.ben_kimim();
        
        System.out.println("------------------");
        
        // System.out.println("Ucret = " + i2.maas_hesapla()); // Calismaz.
        System.out.println("Ucret = " + i3.maas_hesapla());
        System.out.println("Ucret = " + i4.maas_hesapla());
        System.out.println("Ucret = " + i5.maas_hesapla());
        
        // i4.mtd(); // Calismaz.
 
	/* i4 nesnesine Takim_Lideri sınıfının referansını göndermiş olsak da 
	i4 nesnesi Muhendis sınıfından üretilen bir nesne ve Muhendis sınıfında mtd() metodu yok.
	Muhendis sınıfında bu metod olsaydı bu kod çalışırdı ve Takim_Lideri sınıfındaki mtd() metodunda
	yazan içerik ekranda yazardı. Çünkü Muhendis sınıfından üretilen nesneye alt sınıfı olan
	Takim_Lideri sınıfının referansını gönderdik. Takim_Lideri sınıfında mtd() metodu olmasaydı o zaman 
	üst sınıfları olan Muhendis sınıfındaki mtd() metodu çalışırdı. Yani bütün iş "override" mantığında yatıyor. */

        i5.mtd();
    }
}
