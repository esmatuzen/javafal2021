package day15_methodCreation;

public class C03_MethodCreation {

	public static void main(String[] args) {
		
 // java da aynı isimde birden fazla method olur mu?
		// evet olur 
		// aynı isimde birden fazla method olursa java hangisin, calıstıracagına nasıl karar verir?
		// 
	
		
		

	
	topla(2, 4);
	
	}

	private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
		System.out.println("uc sayının tolamı:"+(sayi1+sayi2+sayi3+sayi4));
		
	}

	private static void topla(int sayi1, int sayi2, int sayi3) {
		 System.out.println("uc sayının tolamı:"+(sayi1+sayi2+sayi3));
		
	}

	private static void topla(int sayi1, int sayi2) {
	 System.out.println("iki sayinin toplami:"+(sayi1+sayi2));
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
