package day08_IfElseStaitment;

import java.util.Scanner;

import com.sun.tools.javac.Main;

public class C08_Nestedeıf {

	public static void main(String[] args) {
		// eger calısan kadın ise 60 yasından sonra emekli olabilirsin 
		// calısan erkek ise 65 yasından sonra emekli olabilirsın 
		
		
		Scanner scan = new Scanner(System.in);
	System.out.println("Lütfen cinsiyetiniz giriniz\nErkek icin E, KAdin icin K" );
	char cinsiyet = scan.next().toUpperCase().charAt(0);
	

	System.out.println("Lutfen yasinizi giriniz");
	double yas = scan.nextDouble();
		
	if (cinsiyet == 'E')	{
		if (yas>=65) {
		
		System.out.println("emekli olabilirsin");
		
		}else {
		
		System.out.println("emekli olamazsın");
		
		}	
	}else if (cinsiyet== 'K') {
		
		
		if(yas>=60) {
		   System.out.println("emekli olabilirsin"); 
		                                             
		 }else { 
			System.out.println("emekli olamazsın");   
	
	

	       
	
		 }
	
	}

	}}
