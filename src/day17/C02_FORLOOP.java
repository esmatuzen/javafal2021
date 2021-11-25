package day17;
import java.util.Scanner;

public class C02_FORLOOP {

	public static void main(String[] args) {
		 
		//Soru 7 ) Interview Question Kullanicidan bir 
		//String isteyin ve Stringi tersten yazdirin.
		
	Scanner scanner=new Scanner(System.in);
	
  	
	 Scanner scan = new Scanner(System.in);
     System.out.println("lutfen tersten yazdirmak icin bir yazi girin...");
     String str = scan.nextLine();
     
     // Fatih 
     
     
     
     for (int i = str.length()-1 ; i >=0 ; i--) {
         
         System.out.print(str.substring(i,i+1));
         
     }
	
	}

}
