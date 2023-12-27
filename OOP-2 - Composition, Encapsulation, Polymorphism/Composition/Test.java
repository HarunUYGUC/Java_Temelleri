package com.mycompany.java_temelleri;

public class Test {
    
    public static void main(String[] args) {
        
        // Ürettiğimiz resolution nesnesini monitor nesnesini üretirken parametre olarak gönderdik.
        Resolution resolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor("VS197DE", "ASUS", "18.5", resolution);
        
        Kasa kasa = new Kasa("Shadow Blade", "Shadow", "Temperli Cam");
        
        Anakart anakart = new Anakart("B250-PRO", "ASUS", 10, "Windows 10");
        
        // Ürettiğimiz nesneleri pc nesnesini üretirken parametre olarak gönderdik.
        Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);
        
        // Ürettiğimiz pc nesnesi üzerinden diğer sınıflara ve onların özelliklerine o sınıflardan ürettiğimiz nesne üzerinden ulaştık.
        pc.getKasa().bilgisayari_ac();
        pc.getMonitor().monitoru_kapat();
        pc.getAnakart().isletim_sistemi_yukle("Ubuntu 16.04");
    }
}
