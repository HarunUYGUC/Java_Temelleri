package com.mycompany.java_temelleri;

import java.util.Scanner;

public class Dizide_Bul_Kaydir {
    
    public static int[] DiziBulKaydır(int sayi) {
        int dizi[] = {1, 2, 3, 4, 5};
        int i;
        int tutucu;
        boolean bayrak = false;
        
        // Elemanı ve indisi buluyoruz.
        for (i = 0; i < dizi.length; i++) {
            if (dizi[i] == sayi) {
                bayrak = true;
                break;
            }
        }
        
	// Eleman varsa:
        if (bayrak == true) {

            // Bulunan elemanı dizinin sonuna doğru ilerletiyoruz.
            for (int j = i; j < dizi.length - 1; j++) {
                tutucu = dizi[j];
                dizi[j] = dizi[j + 1];
                dizi[j + 1] = tutucu;
            }
            
            // Bulunan elemanı tur sayısı (i) kadar sağa kaydırıyoruz.
            int elemanSayisi = dizi.length - 1;
            while (i > 0) {   
                
                tutucu = dizi[elemanSayisi]; // Son indisteki elemanı tutuyoruz.
                
                // Sondan başa doğru, önceki indisteki elemanı sonraki indisteki elemanın yerine koyuyoruz.
                for (int k = elemanSayisi; k > 0; k--) {
                    dizi[k] = dizi[k - 1];
                }
                
                dizi[0] = tutucu; // Son inisteki tuttuğumuz elemanı baştaki indisin yerine koyuyoruz.
                i--; // Tur sayısını azaltıyoruz.
            }
        }
        
        return dizi;
    }
    
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int sayi;
	int yeniDizi[];
        
        System.out.print("Hangi elemanı aramak istiyorsunuz?: ");
        sayi = inp.nextInt();
        
        yeniDizi = DiziBulKaydır(sayi);
        
        System.out.println("Yeni Dizinin Elemanları: ");
        for (int i = 0; i < yeniDizi.length; i++) {
            System.out.print(yeniDizi[i] + ", ");
        }
    }
}
