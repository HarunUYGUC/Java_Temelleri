package com.mycompany.java_temelleri;

public class veri_tipleri {

    public static void main(String[] args) {
        int a = 4;
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        byte b = 100;
        
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        short c = 100;
        
        System.out.println(Short.MAX_VALUE);  
        System.out.println(Short.MIN_VALUE);  
        
        long d = 100;
        System.out.println(Long.MAX_VALUE);  
        System.out.println(Long.MIN_VALUE);  
 
        /*
        Soldan sağa doğru veri tiplerinin kapladıkları 
        alanlarının büyüklüklerinin karşılaştırılması.
        */
        // byte --> short --> int --> long
        
        /*
        byte veri tipinde saklanabilen her değer int 
        veri tipinde de saklanabilir ama tersi geçerli değildir.
        Tersinde bizim dönüşüm yapmamız gerekirken diğerinde Java
        otomatik dönüşüm yapar.
        */
        
        short j = 1000;
        int i = (j / 2);
        int k = j;
        
        byte x = 100;
        // byte y = (a / 2); hata verecektir.
        byte y = (byte)(x / 2);
        System.out.println(y);
        
        short h = 100;
        byte z = 2;
        int t = 4;
        long l = h + z + t;
        
        /*
        Çok büyük projeler yapmadığımız için short, byte veri tiplerini kullanmak yerine
        hep int veri tipini kullanabiliriz. Çünkü bellek sıkıntısı yaşamayacağız.
        Büyük projelerde ise bellekte daha az yer kaplamak için yerine göre short,
        byte veri tiplerini de kullanmalıyız.
        */
    }
}
