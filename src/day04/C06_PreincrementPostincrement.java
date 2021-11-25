package day04;

public class C06_PreincrementPostincrement {

	public static void main(String[] args) {
		//preincrement ve postincrement sadece sayi++ ve sayi-- yazımı şçşn gecerlidir
		
	int sayi=10;
	
	sayi++;
	sayi++;
	sayi++;
	
	System.out.println(sayi);//13 snuc
	
	System.out.println(sayi++);// 13 olur bu satırda iki işlem var
	                           // bir artırma bir de yazdırma 
	
	
	//önce artırmak sonra yazdırmak istiyorsak ++sayi
	// sonce yazdırma sonra artırmak istiyorsak sayi++
		

	System.out.println(sayi); // 16 satırda ilk önce 13 ü yazdırdıgı için bu satırda artırma işlemi olmasada 16 da oldugu için en son artırılan sonuc yazdırılmıs oldu 
	
	System.out.println(++sayi);// 15
	
	
	}
}
		
