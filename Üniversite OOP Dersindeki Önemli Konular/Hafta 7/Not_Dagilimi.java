package com.mycompany.java_temelleri;

public class Not_Dagilimi {
    
    public static void main(String[] args) {
        
        int a[] = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
        int c, s;
        
        // Dıştaki for döngüsü ile 00-09, 10-19 şeklinde tabloyu oluşturduk.

        for (c = 0; c < a.length; c++) {
            if (c == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", c*10, c*10 + 9);

            /* 00 ve 09 sonucunu almak için %d yerine %02d yazdık.
            %d yazsaydık 0 ve 9 sonucunu alırdık.
            Neden 5 ve 2 yazdığımızı ise anlamadım. */
            
            /* İçteki for döngüsü ile ise 00-09 şeklindeki tablonun yanına kaç tane yıldız
            geleceğini oluşturduk. */

            for (s = 0; s < a[c]; s++)
                System.out.print("*");
            
            // 60-69: * şeklinde bir satır tabloyu oluşturduktan sonra alt satıra geçtik.
            System.out.print("\n");
        }
    }
}
