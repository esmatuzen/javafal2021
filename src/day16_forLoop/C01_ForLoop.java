package day16_forLoop;

public class C01_ForLoop {

	public static void main(String[] args) {

		for (int i = 0; i <10; i++) { 
			// System.out.println(i); boylede yazabılırız tercihe baglı
			System.out.print(i +" " );
			
		}
		// 1. DURUM REGULER LOOP DURUMU
        // for loop baslangic ve bitis sarti bir sayinin degerine baglı olan 
		// durumlarda tercih edilir
		

/*	for (int i = 0; i < 10; i--) {
	*	System.out.println(i+" ");
	*/	
		// 2. DURUM SONSUZ LOPP DURUMU
		//eger baslangıc sayisi artıs / azalıs ile bitis degerine yaklasmıyor uzaklasıyor ise loop hıc bir zaman durmaz
		
		// lbu duruma sonsuz looop deriz ve bu durum gerceklesmesini istemeyiz
			
	
	for (int i = 0; i >10; i++) {
		System.out.println(i+"acaba calısır mı?");
	
	} //3.BROKEN HİC SONUC VERMEME DURUMU
	// eger ilk deger icin bitis sart true olmazsa
	// daha ilk adımda loop broken olur 
	// dolayısıyla loop body hıc calısmadan loop un sınrasına gecilir
	// loop Calısır ama hıc bi işlem yapmaz 

	
	
	
	
	
	
	
	
	}
	

}

