package day02;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {
		// kullanıcan isim ve soyisimini ayrı ayrı isteyi
		//girilen ismi asagıdaki gibi yazdırınız 
		
		// girilen isim: Mehmet Bulutluoz
		
		Scanner scan= new Scanner (System.in);
		
		System.out.println("Lutfen isminizi giriniz..");
		
		String isim= scan.next();
		
		System.out.println("lütfen soyisminizi yaziniz...");
		
		String soyisim= scan.next();
		
		System.out.println("girilen isim : " + isim +" " + soyisim);
		
		

	}

}
