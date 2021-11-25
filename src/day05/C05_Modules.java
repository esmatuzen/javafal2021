package day05;

import java.util.Scanner;

public class C05_Modules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//6 basamaklı bir sayı için 
	
	
Scanner scan= new Scanner(System.in);
		
		System.out.println("lütfen 6 basamaklı bir sayı giriniz: ");
		
		int sayi= scan.nextInt();
		
		int rakamlarToplami=0;
		
		int rakam= sayi%10;// bana birler basamagını verir
		
	rakamlarToplami+=rakam;
	
	System.out.println(sayi);

	sayi/=10;
	
	System.out.println(sayi);
	
	
	 rakam=sayi%10;  
     rakamlarToplami+=rakam; 
     sayi/=10;
     
     rakam=sayi%10;  
     rakamlarToplami+=rakam; 
     sayi/=10;
     
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
