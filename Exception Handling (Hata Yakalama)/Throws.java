package com.mycompany.java_temelleri;

import java.io.IOException;
import java.util.Scanner;

public class Throws {
    
    // Throws anahtar kelimesi ile throw arasındaki fark şudur:
    // Throw ile unchecked exceptionlar fırlatılırken throws ile checked exceptionlar fırlatılır.    
    // Aslında throw checked exception'da kullanılıyor ama ayrıca throws'u da kullanmak zorundayız.
    // Unchecked exception'da sadece throw kullanılır.
    
    public static void mekan_kontrol(int yas) throws IOException {
        
        if (yas < 18) {
            throw new IOException();
        }
        else {
            System.out.println("Mekana hoşgeldiniz...");
        }
    }
    
    public static void main(String[] args) {
                
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas = scanner.nextInt();
        
        try {
            mekan_kontrol(yas);
        }
        catch (IOException ex) {
            System.out.println("IOException oluştu!!!");
        }
        
        // Aşağıdaki şekilde yazarsak hata alırız. Bu hatayı çözmek için main'i bu şekilde yazmalıyız:
        // public static void main(String[] args) throws IOException {
        // mekan_kontrol(yas);
    }
}
