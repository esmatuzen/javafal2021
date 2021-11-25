package day08_IfElseStaitment;

import java.util.Scanner;

public class C07_IFELSEIF {

	public static void main(String[] args) {
		//SORU8 KULLANICIDAN MAAS İCİN BİR TEKLİF İSTEYİN  
		// VE ASAGIDAKİ DEGERLERE GORE CEVAP YAZDIRIN . TEKLİF 80.000 INN UZERŞNDE İSSE KABUL EDİYORUM 
		// 60-80 BİN ARASINDAYDA KONUSABİLİRİZ 
		//60BİNİN ALTINDAYSA MALESEF KABUL EDEMEM YAZDIRIN 
		
	    Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen maas icin bir teklif giriniz");
		 
         double teklif= scan.nextDouble();	
		
		 if (teklif> 80000 ) {
			 System.out.println("Teklifi kabul ediyorum");
			 
		 } else if(teklif>60000) {
			 
			
			 System.out.println("Teklifi konusabiliriz");
			 
		 }else {
			
			
			 System.out.println("Teklifi kabuledemem");
		 }
			 
			 
		
		
		
		
		
		
		
	}

}
