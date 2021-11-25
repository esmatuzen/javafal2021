package day04;

public class C07_PreFecrementPostDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int sayi =10;
	
	sayi--;
	
	System.out.println(sayi);//9
		
   int a= sayi--;// 2 işlem vardır assingment var sonra deger atma yer alıyor 
   
   
   System.out.println(a);//9
   System.out.println(sayi);//8 
	
   System.out.println(--a);//8
	
	
	}

}
