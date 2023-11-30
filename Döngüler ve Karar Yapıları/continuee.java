package com.mycompany.java_temelleri;

public class continuee {

    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            if ((i == 3) || (i == 5)) {
                continue;
                // i, 3'e veya 5'e eşit olduğunda 
                // continue'dan sonraki kodlar çalışmayacağı için sout satırı
                // çalışmaz. Yani 0'dan 9'a kadar olan rakamlar yazılır fakat 3 
                // ve 5 yazılmaz. Çünkü continue komutundan sonraki kodlar 
                // çalışmaz. Döngü devam eder ama o şarttaki işlemler yapılmaz.
            }
            
            System.out.println("i: " + i);
        }
        
    }
}
