package day09;

import java.util.Scanner;

public class C01_NestetIfElse {

	public static void main(String[] args) {
		// soru11) Nested if kullanarak asagıdaki soruyu cozen kodu yazınız
		// kullanıcıdan bir sıfre girmesini isteyiniz 
		// efer ilk harf buyuk ise 
		//"A" olup olmadıgını kontrol edin 
		// ilk harf A ise " Gecerli Sifre " degil ise "Gecersiz Sifre "yazdırın.
		// ilk harf kucuk ise "z" olup lmadıgını kontrol edin 
		 //ılk harf z ise " Gecerli sifre" degil ise "Gecersiz Sifre" yazdırn
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sifre giriniz" );
		char ilkKarakter = scan.next().toUpperCase().charAt(0);
		
		if (ilkKarakter>='A'&& ilkKarakter<='Z') { // buyuk harfleri secmis olacak 
			
		if (ilkKarakter=='A') {
			System.out.println("Gecerli Sifre Girdiniz");
		} else {
           System.out.println("Gecersiz sifre girdiniz");
		}	
			
		} else if (ilkKarakter>='a'&& ilkKarakter<='z'){// kucuk harfleri secer

			if (ilkKarakter=='z') {
				System.out.println("Gecerli Sifre Girdiniz");	
			} else {
				  System.out.println("Gecersiz sifre girdiniz");
			}
			
		}else { //geriye kalan tum karakter ne buyuk ner kucuk
			System.out.println("Gecerli sifre olması icin harf ile baslayınız");
			
		}
		
		
		scan.close();
		
		
		
		
		
		
	}

}
