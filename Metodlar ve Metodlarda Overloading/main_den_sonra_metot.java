package com.mycompany.java_temelleri;

import java.util.Scanner;

public class main_den_sonra_metot {
    
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int s1, s2, s3, sonuc;
        
        System.out.println("1. Sayıyı giriniz: ");
        s1 = inp.nextInt();

        System.out.println("2. Sayıyı giriniz: ");
        s2 = inp.nextInt();

        System.out.println("3. Sayıyı giriniz: ");
        s3 = inp.nextInt();

        // Bu bildiğimiz şekilde de çalışıyor.
        // sonuc = EnBuyuk(s1, s2, s3);
        // Bu şekilde çalışması için tanımladığımız fonksiyonun main()
        // fonksiyonundan önce tanımlanması gerekiyor diye biliyordum ama çalıştı.
        
        sonuc = main_den_sonra_metot.EnBuyuk(s1, s2, s3);
        System.out.println("En Büyük Sayı: " + sonuc);
    }
    
    public static int EnBuyuk(int s1, int s2, int s3) {
        
        int eb;
        eb = s1;
        
        if ( s2 > eb)
            eb = s2;
        if (s3 > eb)
            eb = s3;
        
        return eb;
    }
}
