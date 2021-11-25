package day05;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {
		// kullanıcıdan 3 basamaklı bir sayı alıp rakamlar toplamını yazdıran bir program yazınız
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("lütfen 3 basamaklı bir sayı giriniz: ");
		
		int sayi= scan.nextInt();
		
		// sayı 573 olsun 
		
		int rakamlarToplami=0;
		
		int rakam= sayi%10;// bana birler basamagını verir
		
	rakamlarToplami+=rakam;
	// RAKAMLAR TOPLAMI 3 OLDU 
	
		
	System.out.println(sayi);
	
		
		
	//sayımız hala 573 degısmedi
// 3 ten kurtulmak istiyorum cunku 3ile işimiz bitti
	
	sayi/=10;
	
		

	System.out.println(sayi);// sayımız ARTIK 57
	
	rakam= sayi%10;
	

	System.out.println(rakam);// 7 
	
	
	rakamlarToplami+= rakam;

	System.out.println(rakamlarToplami);//10
	
	// 7 dende kurtulalım
	
	//sayi hala 57 
	
	sayi/=10;
	

	System.out.println(sayi);
	
	rakamlarToplami+=sayi;
	

	System.out.println("girdiginiz sayının rakamlar toplamı:" + rakamlarToplami);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	}

}
