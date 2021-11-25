package day04;

import javax.annotation.processing.SupportedAnnotationTypes;

public class C05_IncrementDecremwnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sayi1=10;
		
		System.out.println(sayi1+=5);//15
		// bu işlem sayi1in degerini 5 artirip  sayi1 e assing ediyor
		// dolayısıyla sayi1in degeri kalıcı olarak degişiyor
		
		System.out.println(sayi1+12); //sayi 1 in yeni degeri 15 oldugu için sonuc 27 olacaktır.
		
		System.out.println(sayi1);// sonuc yıne 15
		
		sayi1++; 
		
		// her ne kadar = işareti gorunmesede sayi1++ işleminde assing vardır 
		
		
		System.out.println(sayi1);//16
		
	//ÖZET	//**** atama işlemi olursa sayının degeri kalıcı olarak degisir
		// atama işlemi olmadan yapılan toplama cıkarma vs işkemler sadece o satırda kalır 
		// sayının degeri kalıcı olarak degısmez
		  
		
		
		
		     
		

	}

}
