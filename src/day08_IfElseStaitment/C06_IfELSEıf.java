package day08_IfElseStaitment;

import java.util.Scanner;

public class C06_IfELSEıf {

	public static void main(String[] args) {
		// kullanıcıdan 100 uzerınden notunu ısteyin 
		// notu harf sıstrmine gore cevirip yazdırın 
		// 50 den kucukse "d" 
		//50 -60 arası c
		//60 80 arası B
		// 80 ve uzeri A
		

Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen notunuzu giriniz");
		 
		 double not= scan.nextDouble();	
		
		
	
		 if ( not <0 || not>100) {
			 System.out.println("lütfen bir gecerli not yazınız");
			 
			 
		 }else if(not<50) {
			 
			 System.out.println("Notunuz : D");
		 }else  if (not<60){
			 System.out.println("Notunuz : C");
		 }else if  (not<80){ 
			 System.out.println("Notunuz : B");
		 }else {
			 System.out.println("Notunuz : A");
		 }
		 
		 
		 
		 // IF LE BİTMEZ MUTLAKA ELSE İLE BİTMELİDİR
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
