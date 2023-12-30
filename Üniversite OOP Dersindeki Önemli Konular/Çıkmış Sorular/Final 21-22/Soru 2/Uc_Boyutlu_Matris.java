package com.mycompany.java_temelleri;

public class Uc_Boyutlu_Matris {
    
    public static void main(String[] args) {
        
        int a[][][] = {{{1, 2, 3},{4, 5}, {5, 6}, {8, 9}},
            {{12, 13, 14}, {5, 3}, {9, 11}, {20, 22}}};
        
        int top = 0;
        
        /* a[1][0] = {12, 13, 14} => a[1][0].lenght = 3
        i < 3 - 1 => i < 2 */
        for (int i = 0; i < a[1][0].length - 1; i++) {
            
            /* a[0][0] = {1, 2, 3} => a[0][0].lenght = 3
            j < 3 */
            /* a[1][0] = {12, 13, 14} => a[1][0].lenght = 3
            j < 3 */
            for (int j = 0; j < a[i][0].length; j++) {
                
                /* a[0][0] = {1, 2, 3} => a[0][0].lenght = 3
                k = 3 */
                /* a[0][1] = {4, 5} => a[0][1].lenght = 2
                k = 2 */
                /* a[0][2] = {5, 6} => a[0][2].lenght = 2
                k = 2 */
                /* a[1][0] = {12, 13, 14} => a[1][0].lenght = 3
                k = 3 */
                /* a[1][1] = {5, 3} => a[1][1].lenght = 2
                k = 2 */
                /* a[1][2] = {9, 11} => a[1][2].lenght = 2
                k = 2 */
                for (int k = 0; k < a[i][j].length; k++) {
                    
                    /* Yazacak değerler ve toplanacak değerler sırasıyla 
                    bu yukarıdaki dizilerdeki elemanlardır. */
                    top += a[i][j][k];
                    System.out.println(" " + a[i][j][k]); 
                    // Çıktı aşağıdaki gibi olur. 
                    // Sadece virgülden sonra alt satırda olduğunu düşün.
                    // 1, 2, ..., 5, 5, 6, ...., 9, 11
                }
            }
        }
        
        System.out.println("top = " + top); // top = 93
    }
}
