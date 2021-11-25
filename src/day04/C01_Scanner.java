package day04;

import java.util.Scanner;

public class C01_Scanner {

	public static void main(String[] args) {
		
		
		
		
	///////
			 // soru kullanıcıdan ismini alıp isminin bas harfini yazdırın 
			 
			 Scanner scan = new Scanner (System.in);
				System.out.println("Lutfen isminizi giriniz");
				 
				
				char ilkHarf= scan.next().charAt(0);
				 
				// isminizin ilk harfi :E
				
				System.out.println("isminizin ilk harfini yazınız:"+ ilkHarf);
			
			 
			 Scanner scan1 = new Scanner(System.in);
		 System.out.println("lütfen soyadinizi giriniz");
		 
		 char ilkHarf1= scan1.next().charAt(0);
		 
		 System.out.println("lütfen soyadinizin ilk harrfini yazınız:"+ ilkHarf1);
		 
		 
		
	}

}
