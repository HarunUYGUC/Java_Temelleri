package com.mycompany.java_temelleri;

public class Not_Ortalamalari {
    
    public static void main(String[] args) {
        
        int notlar[][] = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}, {10, 20, 30}};
        float ort[] = new float[3];
        
        ort = AVG(notlar);
        
        for (int i = 0; i < ort.length; i++) {
            System.out.println((i + 1) + ". öğrencinin ortalaması = " + ort[i]);   
        }
    }
    
    public static float[] AVG(int n[][]) {
        
	float arr[] = new float[n.length];
        int i, j, top = 0;
        
        for (i = 0; i < n.length; i++) {
            for (j = 0; j < n[0].length; j++) {
                top += n[i][j];
            }
            
            arr[i] = top / j;
            top = 0;
        }
        
        return arr;
    }
}
