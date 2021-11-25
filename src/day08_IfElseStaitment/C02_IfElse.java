package day08_IfElseStaitment;

import java.util.Scanner;

public class C02_IfElse {

	public static void main(String[] args) {
		

 //soru 2 kullanıcıdan bir karakter gırmesınız ısteyın ve gırılen karakterin harf olup olmadıgını yazdırın
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir karakter giriniz");
		
		char karakter= scan.next().charAt(0);
		
		
 if ((karakter>='A' && karakter <='Z')|| (karakter<='a'&& karakter <='z')) { 
	System.out.println("girdiginiz:" + karakter + " bir harftir");
	
 }else {
	 System.out.println("girdiginiz:" + karakter + "bir harf degildir");
	  
	scan.close(); 
	 
 }
	}

}
