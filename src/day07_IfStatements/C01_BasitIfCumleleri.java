package day07_IfStatements;

import java.util.Scanner;

public class C01_BasitIfCumleleri {

	public static void main(String[] args) {
		
	/*
	 * soru2) kullanıcıdan gun isimlerinden birinin ilk harfini isteyin 
	 * ve o harfle baslayan gun isimlerini yazdırın 
	 * ornek: ilkHarf=P output="Pazar,Pazatesi, veya Persembe "
	 * ilkHarf=S output "Sali"
	 * *** Buyuk kucuk harf problem olmaması icin toUpperCase mrthodunu kullanın 
	 * 	
	 */
		
	 	Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen gun isimlerinden birinin ilk harfini yazizniz");
		// Kullanicinin girdigi verinşn tamammını kucuk harf veya buyuk harf yapabiliriz 
		//scan.next(ten sonra toUpperCase yazarsak kelimeyi buyuk harfle
		//toLowerCase yazarsak kelimenin tamamını kucuk harfle cevirmiş oluruz
		
		char ilkHarf= scan.next().toUpperCase().charAt(0);
		
		System.out.println(ilkHarf);
		
	if( ilkHarf=='P') {
		System.out.println("Pazartesi, Persembe ve Pazar ");
			
}
	
	if( ilkHarf=='S') {
		System.out.println("Salı");
		
}
	
	if( ilkHarf=='C') {
		System.out.println("Carsamba ve Cuma ");
	
		
}
	
	
	if(ilkHarf!= 'C'&& ilkHarf!='P' && ilkHarf!='S') { 
		System.out.println("Gecersiz harf girdiniz ! Lutfen gun isimlerinden birinin bas harflerini yaziniz");
	
	}	
		
	// KULLANICI KARAKTERLERİ DEGİŞTİREREK CESİTLİ BUYUKLU KUCUKLU YAZDIRABİLİR 
	
	scan.close();
	
			}

}
