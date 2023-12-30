package com.mycompany.java_temelleri;

public class Test {
    
    public static void main(String[] args) {
        
        /* Bu örnek anladığım kadarıyla 
        "Polymorphism (Çok Biçimlilik)" örneği. */
        
        Sinif1 s2;
        Sinif2 s3, s4;
        Sinif3 s5, s6;
        
        s2 = new Sinif2();
        s3 = new Sinif2();
        s4 = new Sinif3();
        s5 = new Sinif3();
        
        s2.mtd(); // Sinif2
        s4.mtd(); // Sinif3
        
        /* Bu aşağıdaki kod hata verir. Çünkü Sinif1'den üretilen s2 nesnesi
        Sinif2'nin referansına sahip ve Sinif2'deki mtd1() metodunu 
        kullanmaya çalışıyor fakat Sinif1'de mtd1() adında bir metot
        olmadığı için hata verecektir. 
        Sinif1'de de o metot olsaydı Sinif2 o metodu override yapmış 
        olacaktı ve o zaman hatasız çalışacaktı. */
        // s2.mtd1();
        
        s5.mtd1(); // BBB
    }
}
