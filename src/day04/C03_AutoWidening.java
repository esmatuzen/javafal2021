package day04;

public class C03_AutoWidening {

	public static void main(String[] args) {
		
		
		byte sayi1 = 44;
		
		short sayi2= sayi1;
		
		System.out.println("sayi2:"+ sayi2);
		
		
		//eşitliğin sol tarafı short, sag tarafı byte 
		// iki data türü farklı oldugu halde java itiraz etmiyor 
		// bunun nedeni ise atama yapılan variablein data türü (short) 
		//atanan degerin veri turunden (byte) büyük oldugundan sorun olmuyor
		
		  
		
		
		int sayi3= 55;
		
		double sayi4= sayi3;
		
		System.out.println("sayi4:"+ sayi4);
		
		// atanan degerin data türü deger atanan variable data türünden kücükse 
		//atanan deger sayi3 buna int deneri 
		// deger atatnan variable ise double
		// int double dan kücük oldugu için deger içine atama yapoar bu işleme
		// auto widening denir.
		
		
		
		
		
		
	}

}
