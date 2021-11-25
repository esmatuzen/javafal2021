package day05;

public class C06_Odev {

	public static void main(String[] args) {
		
	//	VARİABLES   // ISTENİLEN YAZILAR 
		
		
		String str1 ="Java";
		String str2 ="Guzel";
		int sayi1   =   5   ;
		int sayi2   =   4   ;
		
		// 1.soru verilen variableslarla istenilen sonucları yazdırın 
		 
		System.out.println(str1 +" "+ str2+" "+ sayi1+sayi2); // Java Guzel 54 
		
		// 2. soru 
		
		System.out.println(str1+" " +sayi1+" "+str2); // Java 5 Guzel
		
		// 3. soru
		
		System.out.println(str1+" "+ (sayi1+sayi2)+sayi2); // Java 94 
		
		// 4. soru 
		
		System.out.println(str1+" " + (sayi1-sayi2)+(sayi1+sayi2));// Java 19
		
		// 5.soru
		
		System.out.println(sayi1+""+sayi2 + " " +str2);// 54 Guzel
		
		//6.soru
		
		System.out.println(sayi1+""+sayi2+" "+str1);
		
		
		
		
		
		
	}

}
