package com.mycompany.java_temelleri;

public class veri_tipleri_4 {

    public static void main(String[] args) {
        
        String a = "Merhaba";
        
        System.out.println(a + ", Hoşgeldiniz.");
        
        String b = "Java ";
        String c = "Programlama ";
        String d = "Dili";
        String toplam = b + c + d;
        
        System.out.println("Toplam: " + toplam);
        
        String e = "Merhaba";
        int f = 35;
        String g = e + f;
        
        System.out.println(g);
        
        String h = "Merhaba";
        double i = 3.52;
        byte j = 10;
        h = h + i + j;
        
        System.out.println(h);
        
        char k = '?';
        String l = "Merhaba Nasılsın " + k;
        
        System.out.println(l);
        
        // Bu şekilde yapmak yerine
        String m = "Java " + "Programlama " + "Dili"; 
        // Bu iki artının yerlerinin farklı olacağı şekilde de yapabiliriz.
        String n = "Java " +
                "Programlama "
                + "Dili";
        
        System.out.println(n);
        
        String o = "Java\tProgramlama\tDili";
        System.out.println(o);
        
        String p = "Java\t Programlama\t Dili"; 
        System.out.println(p);
        // \t den önce boşluk bıraksak sorun olmuyor fakat sonradan boşluk 
        // bırakırsak bir boşluk fazladan oluşuyor.

        String r = "Java\nProgramlama\nDili"; 
        System.out.println(r);
    }
}
