package day05;

import java.util.Scanner;

public class C04_Modules {

	public static void main(String[] args) {
		// kullanıcıdan 4 basamaklı bir sayı alıp rakamlar toplamını yazdırın 
		
Scanner scan= new Scanner(System.in);
		
		System.out.println("lütfen 3 basamaklı bir sayı giriniz: ");
		
		int sayi= scan.nextInt();
		
		int rakamlarToplami=0;
		
		int rakam= sayi%10;// bana birler basamagını verir
		
	rakamlarToplami+=rakam;
	
	System.out.println(sayi);

	sayi/=10;
	
	System.out.println(sayi);
	// bu işlemi basamak sayısı kadar tekrar edersek rakamlar toplamını veriri
	rakam=sayi%10;  
    rakamlarToplami+=rakam; 
    sayi/=10;
    
    rakam=sayi%10;  
    rakamlarToplami+=rakam; 
    sayi/=10;
    
    rakam=sayi%10;  
    rakamlarToplami+=rakam; 
    sayi/=10;
    
    
    System.out.println("Girdiginiz sayinin rakamlar toplami : " + rakamlarToplami);
    
	}

}
