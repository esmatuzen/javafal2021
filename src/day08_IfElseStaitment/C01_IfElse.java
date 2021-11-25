package day08_IfElseStaitment;

import java.util.Scanner;

public class C01_IfElse {

	public static void main(String[] args) {
		//soru 1 kullanıcıdan dıkdortgenin kenar uzunluklarını ısteyın ve dikdortgenin kare olup olmadıgını yazdırın 
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen dikdortgenin bir kenar uzunlugunu girin");
		
		double kenar1=scan.nextDouble();
		
		System.out.println("Lutfen dikdortgenin bir kenar uzunlugunu girin");
		
		double kenar2 =scan.nextDouble(); 

	if(kenar1==kenar2) { 
		System.out.println("girilen olculer karedir ");
	} else { System.out.println("girilen olculer kare degildir");

		
	}
	scan.close();	
		
	}

}
