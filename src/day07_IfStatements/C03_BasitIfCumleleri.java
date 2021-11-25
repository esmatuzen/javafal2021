package day07_IfStatements;

import java.util.Scanner;

public class C03_BasitIfCumleleri {

	public static void main(String[] args) {
		
	/*
	 * soru3) Kullanıcıdan gun isimini alın ve
	 * haftaici veya hafta sonu oldugunu yazdırın 
	 * ornek gun=Pazar output = " hafta sonu"
	 *       gun= Sali output = "Hafta ici"
	 *       gun = Sali output = "hafta ici"
	 *       
	 ****** String icin equals method unu kullanın 	
	 */
		
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Lütfen gun isminizi yazınız");
	
	String gun= scan.next().toLowerCase();
	
	
	if(gun.equals("pazar") || gun.equals("cumarseti")){
		System.out.println("Hafta sonu ");}
	
	//String non primitve oldugu için == kullanılmaz bunun yerine equals () methodu kullanırız 
	
	Scanner scan1 = new Scanner(System.in);
	System.out.println("Lütfen gun isminizi yazınız");
	
	String gun1= scan.next().toLowerCase();
	

	if(gun1.equals("pazartesi") || gun1.equals("sali")|| gun1.equals("carsamba")
			|| gun1.equals("persembe")|| gun1.equals("cuma")){
		System.out.println("Hafta ici ");}
	
	
	
	scan.close(); 
	scan1.close();
	
		
	}

}
