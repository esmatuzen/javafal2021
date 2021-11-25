package day19;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		// for loop ile yapalım 
	
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen rakamlar toplamını bulabilmek icin pozitif bir tam sayi giriniz");
		int sayi =scan.nextInt();
		
		int rakamlarToplami=0;
		int rakam=0;

		 rakamlarToplami =0;
		 String sayiStr= ""+sayi; 
		 // 345 data turu artık string olmustr
		 // sayiyi string yapabilmekl iicin basına bosluk yapmalıyız
		 // int olarak verilen bir sayının basamak sayısını bulamk istersek 
		 // kısa yoldan o sayıyı String e cevirip str.length() methodu kullana bilirz
		// ******* bir sayının basamak uzunlugunu string sayiStr=""+sayi;
		 
		 for (int i = 0; i <sayiStr.length(); i++) {
			 rakam=sayi%10;
				rakamlarToplami+=rakam;
				sayi/=10;
				
		} System.out.println("girdiginiz sayının rakamlar toplamı:" + rakamlarToplami);
		
	scan.close();
	
	
	
	
	}

}
