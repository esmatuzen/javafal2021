package day07_IfStatements;

import java.util.Scanner;

public class C04_BasitIfCumleleri {

	public static void main(String[] args) {
		
//4.soru kullanıcıdan dikdörtgenin kenar uzunluklarını isteyin 
		// ve dikdortgenin kare olup olmadıgını yazdırın 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen dikdortgenin bir kenar uzunlugunu girin");
		
		double kenar1=scan.nextDouble();
		
		System.out.println("Lutfen dikdortgenin bir kenar uzunlugunu girin");
		
		double kenar2 =scan.nextDouble();
		
		if (kenar1==kenar2) {System.out.println("girilen dikdörtgen kare");
		
		}
if (kenar1!=kenar2) {System.out.println("girilen dikdörtgen kare degil");
		
		}
	scan.close();
	
	}

}
