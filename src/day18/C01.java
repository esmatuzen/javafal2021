package day18;

import java.util.Scanner;

import day16_forLoop.C01_ForLoop;

public class C01 {

	public static void main(String[] args) {
	//forLoop sorusu
		/* Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin 
		 * ve girilen rakama gore 
        asagidaki sekli cizdirin
        *
        * *
        * * *
        * * * *
*/
		Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen pozitif bir rakam giriniz : ");
        int num=scan.nextInt();
        
        for (int i = 1; i <= num; i++) {
            
            for (int j = 1; j <= i; j++) {
                
                System.out.print("* ");
                
            }
            System.out.println("");
            scan.close();
        }
        
        
        
	
	}

}
