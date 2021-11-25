package day09;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class C02_Nextedıfelse {

	public static void main(String[] args) {
		//soru12) kullanıcıdan 4 basamaklı bir sayı girmesini isteyin.
		// girdigi sayi 5 e bölünüyorsa son rakamıni kontrol edin 
		//son rakamı 0 ise ekrana "5 e bölünen tek sayı" yazdırın 
		// son rakamı 0 degil ise " 5 e bölunen tek sayı yazdırın .
		// girdiği pasword 5 e bolunmuyorsa erkrana "Tekrar dneyin yazdırın 
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 4 basamaklı bir sayı giriniz" );
		int sayi=scan.nextInt(); 
		
		if (sayi<1000 || sayi>9999) {
			System.out.println(" 4 basamaklı bir sayi girmelisiniz");
		} else {// 4 basamaklı sayıları yakalayacak
			
			
		         if (sayi%5==0) {// bese bolunemeyenler
			            
		        	 System.out.println("bese tam  bolunen  cift sayi");
		        	 
		        	 if (sayi%10==0) {// son rakam 0 demek
				
		        		 System.out.println("bese bolunen tek sayi");
			}          else {// son rakam 5

			}
			
		}     else {
			
			System.out.println("Lutfen tekrar deneyiniz");
		}
  
	
		
		}
		
		
		
		
		
		
		
	}

}
