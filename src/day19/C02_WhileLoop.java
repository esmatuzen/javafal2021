package day19;


import java.util.Scanner;


public class C02_WhileLoop {

	public static void main(String[] args) {
		// Soru 7 ) Kullanicidan bir sayi alin 
		//                 ve bu sayinin rakamlari toplamini yazdirin

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen rakamlar toplamını bulabilmek icin pozitif bir tam sayi giriniz");
		int sayi =scan.nextInt();
		
		int rakamlarToplami=0;
		int rakam=0;
		
		
	 while (sayi> 0) { //girilen pzitif Timestamp sayıTimestamp 10 boler kalanı verşe
		   rakam=sayi%10;
			rakamlarToplami+=rakam;
			sayi/=10;
			
	}
	 System.out.println("girdigimiz sayının rakamlar toplamı :" + rakamlarToplami);
	

	
	
	
	
	
	}

}
