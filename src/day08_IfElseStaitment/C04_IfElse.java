 package day08_IfElseStaitment;

import java.util.Scanner;

public class C04_IfElse {
	
public static void main(String[] args) {


//soru 4 kullanıcıdan bir ucgenin uc kenar uzunlugunu alın eger uc kenar uzunlugu birbirine esit ise ''eskenar ucgen''  yazdırın

// diger durumlarda ekrana "eskanar ucgen degil yazdırn"
	
	




	
Scanner scan = new Scanner(System.in);
	
	System.out.println("Lutfen ucgenin kenar uzunlugunu giriniz:\n"+"Lutfen ucgenin kenar uzunlugunu giriniz:\n"+"Lutfen ucgenin kenar uzunlugunu giriniz: ");
	 double kenar1= scan.nextDouble();
	 double kenar2= scan.nextDouble();
	 double kenar3= scan.nextDouble();


if( kenar1==kenar2 && kenar2==kenar3) {
	
	System.out.println("eskenar ucgen");
}else {
	
	System.out.println("eskenar ucgen degil");
	
}




}




}
