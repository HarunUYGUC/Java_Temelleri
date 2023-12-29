package com.mycompany.java_temelleri;

public class Database {
    
    // Final Parametre
    /*
    public void baglanti_kur(final String username, final String password) {
        // Fonksiyona parametre olarak username değerini gönderdik ama yanlışlıkla
        // fonksiyon içerisinde de aşağıdaki şekilde değişiklik yaptık diyelim. Bu durumda
        // ekrana yazacak değer değiştirdikten sonra ki yeni değer olacaktır. Bunun
        // olmaması için fonksiyona gelecek parametreyi tanımlarken final anahtar kelimesini
        // kullanmamız gerekiyor.
        // username = "root2";
        
        System.out.println(username);
        System.out.println(password);
    }
    */
    
    // Final Metod
    /*
    public final void baglanti_kur(String username, String password) {
        // Bu sınıf başka bir sınıfın üst sınıfı olduğunda o sınıfta bu fonksiyonu
        // override etmek istersek metodu bu sınıfta final olarak tanımladığımız için
        // alt sınıfta override işlemini yapamayız.
        
        System.out.println(username);
        System.out.println(password);
    }
    */
}
