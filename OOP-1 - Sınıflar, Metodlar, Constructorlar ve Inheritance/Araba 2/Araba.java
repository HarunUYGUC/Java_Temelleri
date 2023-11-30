package com.mycompany.java_temelleri;

public class Araba {
    
    // Private ile tanımladığımız özellik vb. durumlar başka bir Java dosyasından erişilemez.
    // Erişmek için Public olarak tanımlamalıyız.
    
    // Metodlar üzerinde yanlışlıkla değişiklik olmaması için private yaptık.
    // Private yaptık fakat bunlar üzerinde isteyerek değişiklik yapmak istersek
    // nasıl yapacağız?
    // Bunun için public metodlar oluşturacağız. 
    // Private özellikler ile metodumuz aynı dosya içerisinde olduğu için private
    // özellikleri bu metod içerisinde kullanabiliriz. Public metodda kullanabildiğimiz
    // bu özellikleri de başka dosyada çağıracağımız bu oluşturduğumuz public metodlar
    // ile ulaşabileceğiz.,
    // Bu yönteme Encapsulation denir.
    
    // Özellikler
    private String renk;
    private int kapilar;
    private int tekerlekler;
    private String motor;
    private String model;        
    
    // Metodlar
    
    // static kullanmayacağız çünkü artık bu metodlar nesnelere özel olacak.
    // static kullanırsak sınıflara özel olur.
    
    //Get ve set metotları: Get metodu private veri alanını elde etmek veya okumak için kullanılır.
    // Set metodu: Private veri alanına değer atamak için kullanılır.		
    // Get metodu return ile değer döndürür.
    // Set metodu ise, void türünden parametre alan bir metotdur.
    
    public void setModel(String model) {
        
        this.model = model;
        // Bunun yerine model = modelasd yapabiliriz.
        // ama set_model(String modelasd) olarak tanımlamalıyız o zaman.
        
    }
    
    public String getModel() {
        
        return this.model;
    }

    // Right Click, Refactor, Encapsulate Fields, Create Getter | Create Setter,
    // Refactor ile yukarıda yazdığımız public String get_model() gibi metodları otomatik
    // olarak oluştururuz. Aşağıdakiler otomatik olarak oluştu.
    
    /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @return the kapilar
     */
    public int getKapilar() {
        return kapilar;
    }

    /**
     * @param kapilar the kapilar to set
     */
    public void setKapilar(int kapilar) {
        
        if (kapilar < 0) {            
            System.out.println("Kapı sayısı 0'dan küçük olamaz!");
        }
        else {
            this.kapilar = kapilar;
        }
    }

    /**
     * @return the tekerlekler
     */
    public int getTekerlekler() {
        return tekerlekler;
    }

    /**
     * @param tekerlekler the tekerlekler to set
     */
    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }

    /**
     * @return the motor
     */
    public String getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }
    



    
}
