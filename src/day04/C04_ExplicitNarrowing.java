package day04;

public class C04_ExplicitNarrowing {
	
	public static void main(String[] args) {
		
		// eger buyuk data turundeki bir veriyi daha kucuk data turundeki //
		//variables atamak istesek java bunu otomotik olarak yapmaz
		
		int sayi1 =300;
		
		short sayi2= (short) sayi1;
		// eşitliğin sagı ile solundaki veri türleri farkli oldugundan 
		//java mismatch hatasi verir.
		
		
	
	
	// hatayı gidermek için buyuk data turundeki degerin onune manule onayımızı gostren 
		// (short) yazılır
		
		
		System.out.println("sayi2:"+ sayi2);
		
		byte sayi3=(byte) sayi2;
		
		System.out.println("sayi3:"+ sayi3);
		
		// deger bytein sinirlarından buyuk oldugu için java int 300 kendi yontemine gore 
		// bytea donusturur ve bu arada bizim datamız degisir
		double sayi4= 87.3;
		int sayi5= (int) sayi4;
		
		System.out.println("sayi5:"+ sayi5);
		// deger virgullu oldugundan ve int da ondalıklı kısmın olmadıgından
		// java ondalıklı kısmı keser dolayısıyla data kaybı olusur 
		
		int sayi6= 27;
		int sayi7= 4;
		
		System.out.println(sayi6/sayi7 );
		// bolme işlemini yapılan ıkı sayı da int oldugu için java sonucu şnt olarak yazar 
		
		double sayi8 =4;
		System.out.println(sayi6 / sayi8);
		//6.75 işlem yapılan sayılardan daha grniş data turune sahip olan 
		// double oldugundan sonucu double olarak yazdırır.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}


