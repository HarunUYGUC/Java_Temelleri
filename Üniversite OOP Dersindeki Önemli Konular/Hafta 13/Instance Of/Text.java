package com.mycompany.java_temelleri;

public class Text {

    public static void Konustur(Object object){
        if (object instanceof Kopek) {
            System.out.println(((Kopek) object).Konus()); //Tür Dönüşümü 
        }
        else if (object instanceof Kedi) {
            System.out.println(((Kedi) object).Konus());                
        }
        else if (object instanceof Kus) {    
            System.out.println(((Kus) object).Konus());        
        }
        else if (object instanceof Hayvan) {
            System.out.println(((Hayvan) object).Konus());     
        }      
    }

    public static void main(String[] args) {
        
        Konustur(new Kopek("Karabaş"));
        Konustur(new Kedi("Tekir"));
        Konustur(new Kus("Boncuk"));     
    }        
}
