package day19;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {
		// Soru 6 ) Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari 
		//ve toplam kac tane olduklarini ekranda yazdirin


	Scanner scan = new Scanner(System.in);
	System.out.println("Lütfen bölenleri bulabilmek icin pozitif bir tam sayi giriniz");
	int sayi =scan.nextInt();
	
	int sayac = 0;// kac tane bolenş var onu sayacagız
	int bolen =1;// loopun baslangıc degeri 20 den buyuk oldugu surece devaöm edecek 
	                
	while (bolen<=sayi) {// eger sayi bolene tam bolunuyorsa yazdırmalıyız 
        if	(sayi%bolen==0) {
        	System.out.print(bolen+" ");
        	sayac++;
        	
        } 
        bolen++; // bunu koymamızın sebebi sonsuza kadar kalanı vermemesi icin yazılan bolen variablesı ya attırmalı yada azaltmalıdır
	}
	System.out.println();
	System.out.println(sayi +" sayisinin "+ sayac +" adet tam böleni vardır");
	}

}
