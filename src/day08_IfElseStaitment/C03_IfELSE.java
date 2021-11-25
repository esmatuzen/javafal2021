package day08_IfElseStaitment;

import java.util.Scanner;

public class C03_IfELSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//SORU3 KULLANICIya yasını sorun ege yası 65den kucuk ise '' emekli olamazsın  calısmalısın 
		// 65e esit veya buyukse emekli olabilirsin yazdın
		
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen yaşınızı giriniz: ");
		
	 int age= scan.nextInt();
		

	if( age< 65){
		System.out.println(" Emekli olamazsınıznız, calısmalısınız");
	
		
	} else { 
	
	System.out.println("Emekli olabilirsiniz");

		
	}
	
	
	scan.close();
	
	
	
	
	
	}

}
