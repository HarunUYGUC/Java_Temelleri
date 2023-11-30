package com.mycompany.java_temelleri;

/* Bu program "Dizinin_Tum_Elemanlarini_Degistir_2"deki gibi void fonksiyonu
kullanılarak da yapılabilir. Çünkü zaten fonksiyona diziyi gönderince adresini
göndermiş oluyoruz. Değer döndürmemden de bu program o şekilde yapılabilir. */ 

public class Dizinin_Tum_Elemanlarini_Degistir {
    
    public static void main(String[] args) {
        
        int a[] = {1, 2, 3, 4};
        
        a = mtd(a);
        
        for (int i = 0; i < a.length; i++)
            System.out.printf("%d, ", a[i]);
    }
    
    public static int[] mtd(int x[]) {
         
        for (int i = 0; i < x.length; i++)
            x[i] = x[i]*3;
        
        return x;
    }
}
