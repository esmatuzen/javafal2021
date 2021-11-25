package day15_methodCreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
		//kullanıcıdan ismini ve soy ismini isteyiniz 
		// iki farklı method  olusturun methodlardan biri girilen kelimeleri birlestirsin 
		//ilk harf büyük diğerleri kucuk olacak sekilde birlestirsin 
		// ikinci method isim ve soyisimlri ilk harfleri buyuk harf geriye kalan harfler yıldız sekl,nde birlestirsin 
		// kullanıcıya isimini acık olarak yazdırılması veya gizlenmesi tercihi sorun 
		// ve programın kalan kısmında isim ve soyisimi kullanıcın istedigi seklinde kullanın 
		
		
Scanner scan = new Scanner(System.in);
        
        System.out.println("Lutfen isim ve soyisminizi girin \nisimden sonra enter'a basin");
        
        String isim=scan.next();
        String soyisim=scan.next();
        
        System.out.println("Isminizin acik sekilde yazilmasini istiyorsani 1 "
                + "\nIlk harf haric gizli yazilmasini istiyorsaniz 2'e basin");
        int tercih=scan.nextInt();
        
        String birlesmisIsim=null; // Emrah Saglam , E**** S*****
    
        if (tercih==1) {
            birlesmisIsim= acikIsim(isim,soyisim);
        } else if(tercih==2){
            birlesmisIsim=isimGizle(isim,soyisim);
        }else {
            System.out.println("Lutfen 1 veya 2 secin");
        }
        
        // Bu satirdan itibaren kullanicinin isim ve soyismi kullanici tercihine bagli olarak
        // kaydedildi
        
        System.out.println("kullanicinin tercihi : " + birlesmisIsim);
    }
    
    
    
    public static String isimGizle(String isim, String soyisim) {
        isim=isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
        soyisim=soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");
        
        return isim+" "+soyisim;
    }
    public static String acikIsim(String isim, String soyisim) {
        
        isim=isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
        soyisim=soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
        
        return isim+" "+soyisim;
    }
}
