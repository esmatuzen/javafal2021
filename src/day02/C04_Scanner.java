package day02;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
		//   kullanıcıdan deger almak icin 3 adım takip edilir 
		// 1. adım scanner objesi olusturmak 

		 Scanner scan = new Scanner (System.in);
		 
// ikinci adım kullanıcıya ne istedigimizi soylemek  mesaj yazın 
		 
		 
		 System.out.println("Lutfen isminiz yaziniz ");
		 
		 
		 String isim= scan.next();
		 
		 System.out.println("isminiz....:"  + isim);
		 
		 // scan bir scanner objesidir
		 // isim olarak farklı bir isim yazsakda calısır ama biz scan demeyi tercih ederiz 
		 //scan bir obje oldugu icin data turu non primitive
		 // primitive data türleri sadece deger icerirken 
		 // non primitive data türleri degerin yanında methodlar barındırır
		 // scan. dediğimizde kullanabilecegimiz bu methodları gorebiliriz
		 
		
	}

}
