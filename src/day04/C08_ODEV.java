package day04;

public class C08_ODEV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1.SORU BYTE VERİ TİPİNDE BİR DEĞİŞKEN OLUSTURUN ,SHORT,İNT,FLOATVE DOUBLE DATA TİPİNDE BİRER DEĞİŞKEN OLUSTURUP ADIM ADIM WİDENİNG YAPIN VE YAZDIRIN 
		
		
		byte x= 125;
		short a= x;
		int b= x;
		float c= x;
		double d= x;
		
		System.out.println(" x: "+x+ " a: "+a+ " b: "+b+ "c: "+c+" d: "+d); 
		
		// 2.SORU İNT VERİ TÜRÜNDE BİR DEĞİŞKEN OLUSTURUN VE ADIM ADIM NARROWİNG YAPIN VE YAZDIRIN 
		
		int sayi1= 400;
		short sayi2= (short) sayi1;
		byte sayi3= (byte) sayi1;
		System.out.println("sayi1: "+sayi1+" sayi2: "+sayi2+" sayi3:"+sayi3); 
		
	///NOT : Narrowing Casting bazi dataları kaybetmezize yol acar bazende sayıyı kendi sınırları içinde kalan baska sayıya dönüştürür
		
		
		//3.SORU FLOAT DATA TÜRÜNDE BİR VARİABLE OLUSTURUN VE YAZDIRIN 
		
		float sayi4= 3.456778f;
		
		System.out.println("sayi4:"+sayi4);
		
		//4.SORU DOUBLE 255.36 SAYISININ İNT A VE SONRADA OLUSTURDUGUNUZ İNT SAYIYI BYTE A CEVİRİP YAZDIRIN 
		 
		double sayi5= 255.36;
		
		int sayi6= (int) sayi5;
		
		byte sayi7= (byte) sayi5;
		 
		System.out.println("sayi5: " + sayi5+ " sayi6 : " + sayi6  + " sayi7: " + sayi7);
		
		
		//5.SORU İNT 2 SAYİYİ BİRBİRİNE BOLDURUN VE SONUCU YAZDIRIN 
		
		int sayi8= 2 ;
		 
		System.out.println("bölme isleminin sonucu:" + sayi8/sayi8);
	
		//6.SORU İNT BİR SAYIYI DOUBLE BİR SAYIYA BOLUN VE SONUCU YAZDIRIN 
		
		int sayi9= 100;
		double sayi10=2.5;
		 
		System.out.println("bölme isleminin sonucu:"+ sayi9 / sayi10);
		
		// 7.SORU FARKLI DATA TİPLERİ İLE İŞLEM YAPIP SONUCLARI YAZDIRALIM
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
	}

}
