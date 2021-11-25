package day02;

public class C02_SwapVariables {

	public static void main(String[] args) {
		
		//*
        // * 1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
        //Orn : sayi1=10 ve sayi2=20;
        //   kod calistiktan sonra
        // sayi1=20 ve sayi2=10
		
		int sayi1=10;
		int sayi2= 20;
		
		// baslangıcta sayi1=10 ve sayi2= 20
		
	System.out.println("baslangıctaki sayi1="+sayi1+" ve sayi2="+sayi2);
		
		
		
		//1.adım ilk önce bos bir variable olusturalım
	int bos;
	
	// 2.adım sayi2 yi bos variable  a atayalım 
	
	bos = sayi2;
	//3.adım sayi2 variable ina sayi1 degerini atayalım
	
	sayi2= sayi1;
	 
	
// 4. adım bos variable daki degeri sayi 1 e atayalım 
	
	sayi1= bos;
	
	System.out.println("sonucta sayi1= " + sayi1+" ve sayi2= "+ sayi2);
	
		
		
	}

}
