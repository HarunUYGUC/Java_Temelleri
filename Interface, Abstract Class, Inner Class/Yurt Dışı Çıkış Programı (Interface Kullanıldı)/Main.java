package com.mycompany.java_temelleri;

public class Main {
    
            
    /* "throws InterruptedException" yazmamızın sebebi: 
    "Thread.sleep(3000);" kodunu yazınca hata veriyor. Bu hatanın önüne geçmek için */
    
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Sabiha Gökçen Havalimanı'na Hoşgeldiniz!!!");
        
        String sartlar = "Yurtdışı Çıkış Kuralları...\n"
                       + "Herhangi bir siyasi yasağınız bulunmaması gerekiyor...\n"
                       + "15 TL harç bedelini tam olarak yatırmanız gerekiyor...\n"
                       + "Gideceğiniz ülkeye vizenizin bulunması gerekiyor...";
        
        String message = "Yurtdışı şartlarından hepsini sağlamanız gerekiyor.";
        
        while (true) {
            System.out.println("********************************");
            System.out.println(sartlar);
            System.out.println("********************************");
            
            Yolcu yolcu = new Yolcu();
            
            System.out.println("Harç Bedeli Kontrol Ediliyor...");
            
            /* Aşağıdaki kodu yazınca hata veriyor. Bu hatanın önüne geçmek için
            main'e "throws InterruptedException" yazdık. */
            Thread.sleep(3000); 
            /* Üstteki işlemden sonra programın 
            çalışmasını 3 saniye bekletiyoruz. */
            
            if (yolcu.yurtDisiHarciKontrol() == false) {
                System.out.println(message);
                continue;
            }
            
            System.out.println("Siyasi Yasak Kontrol Ediliyor...");
            Thread.sleep(3000); 
            
            if (yolcu.siyasiYasakKontrol() == false) {
                System.out.println(message);
                continue;
            }

            System.out.println("Vize Durumu Kontrol Ediliyor...");
            Thread.sleep(3000); 
            
            if (yolcu.vizeDurumuKontrol() == false) {
                System.out.println(message);
                continue;
            }
            
            System.out.println("İşlemleriniz Tamam: Yurtdışına Çıkabilirsiniz...");
            break;
        }
    }
}
