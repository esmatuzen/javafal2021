package day02;

import java.util.Scanner;

public class C07_Odev {

	public static void main(String[] args) {
		// soru 1 kullanıcıdan iki tam sayı alıp bu sayıların toplam fark ve carpımlarını yazdırın 
		
		//kullanıcıdan 
		 Scanner scan= new Scanner(System.in); 
		 // new yeni bir object oluşturuluyor demektir 
		                                       
		 System.out.println("Karenin bir kenarının uzunlugunu girin");
		  // 3. adım kullanıcının konsola girdiği degeri programımıza alacagız
		 // kullanıcıdan bir kenar uzunluğu istediği için hem tam hemde virgüşşü olabilir
		
		 
		double kenar=scan.nextDouble();
 
		System.out.println("girdiğiniz kenar uzunluğuna sahip karenin alanı=  "+kenar*kenar);
		
		
		//kullanıcıdan yarıcap isteyip  cemberin cevresini ve dairenin alanını hesaplayıp yazdırın 
		
		Scanner scan1= new Scanner(System.in);
		
		System.out.println("Lutfen cemberin yaricapini giriniz");
		
		double yaricap=scan1.nextDouble();
		
		double cevre= 2*3.14*yaricap;
		
		double alan= 3.14*yaricap; // alan= pi*yaricap*yarıcap
		// cemberin cevresi: 25.7
		// dairenin :26.31
		 System.out.println("cemberin cevresi :"+ cevre);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
	}

}
