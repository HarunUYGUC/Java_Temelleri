package com.mycompany.java_temelleri;

public class Account {
    
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo;

    // Constructor (Yapıcı Metod)
    // Constructor'ın ismi class'ın ismiyle aynı olmalıdır.
    // Bizim yazdığımız bu Constructor'dan sonra obje oluşturduğumuzda çalışan
    // Java'nın kendi Constructor'ı artık çalışmaz, bizim Constructor çalışır.
    // Aslında Constructor'lar nesneler oluşturulurken çağrılan ilk fonksiyonlardır.
    // Account account1 = new Account(); satırında bu Constructor çağırılır.
    public Account() {
        
        System.out.println("Kendi Yazdığımız Constructor...");
    }
    
    // Account account2 = new Account("123123", 1000.0, "Harun 123", "123.456@hotmail.com", "3214546"); satırında bu Constructor çağırılır.
    public Account(String hesapNo, double bakiye, String isim, String email, String telefonNo) {
        
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;
    }
    
    public void paraYatir(double miktar) {
        
        bakiye += miktar;
        
        System.out.println("Yeni bakiye = " + bakiye);
    }
    
    public void paraCekme(double miktar) {
        
        if (miktar > 1500) {
            System.out.println("Bir günde 1500 TL'den fazla para çekemezsiniz.");
        }
        if ((bakiye - miktar) < 0) {
            System.out.println("Yeterli bakiye yok. Bakiye = " + bakiye);
        }
        else {
            bakiye -= miktar;
            System.out.println("Yeni bakiye = " + bakiye);
        }
    }
    
    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefonNo
     */
    public String getTelefonNo() {
        return telefonNo;
    }

    /**
     * @param telefonNo the telefonNo to set
     */
    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
    
}
