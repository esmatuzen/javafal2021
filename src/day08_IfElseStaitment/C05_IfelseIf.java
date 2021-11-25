package day08_IfElseStaitment;

import java.util.Scanner;

public class C05_IfelseIf {

	public static void main(String[] args) {
		// soru 6 kullanıcıdan ıkı sayı isteyin 
		// sayıların ıkısıde pozıtıf ise sayıların toplamını yazdırın 
		// sayıların ıkısıde negatıf ise carpımını yazdırın 
		// sayıların ıkısıde farklı ıse " farklı ısarerlerde işlem yapamazsınız" yazdrın 
	    // sayılardan sıfıra esit olan varsa " sıfır carpmaya gore yutan elamandır" yazdırın 
		
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen iki sayı  giriniz:\nilk sayıdan sonra diger sayı için entera basınız");
		 
		 double sayi1= scan.nextDouble();
		 double sayi2= scan.nextDouble();
		
if(sayi1>0 && sayi2>0) {
	
	System.out.println("sayilarin toplami:" + (sayi1 + sayi2));
	
} else if (sayi1<0&&sayi2<0) {
	
	System.out.println("sayiların carpımı:"+(sayi1*sayi2));
	
}else if(sayi1*sayi2<0){
	
	System.out.println("Farklı isaretlerde islem yapamazsiniz");
	

}else {
	System.out.println("sıfır carpmaya göre yutan elamandır");
	
	
}
	
	
	
	//else if(sayi1==0|| sayi2==0){

//System.out.println("sifir carpmaya gore yutan elemandır");

	
	
	
	
	
	
	}

}
