package day06;

public class C01_WrapperClass {

    public static void main(String[] args) {
   
    	int sayi1=10;
    	Integer sayi2=20;
    	
  // sayi1 yazdıgımızda hicbir method cıkmaz cunku sayi1 int dır cunku primitive data türüdür 
    
  // sayi 2 yazdıgımızda  ise bir cok method geliyor cunku sayı  Integer yani wraper  class  olmustur 
    	
  String tel1 = "5455106";
  String tel2 = "5325672";
  
  System.out.println(tel1+tel2);//54551065325672
  
  // bu telefon numaralarını toplamak ıstersek 
  
  System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));//10780778
  
  System.out.println(Integer.MIN_VALUE); //-2147483648
  
  System.out.println(Integer.MAX_VALUE);//2147483647
  
  System.out.println(Double.MAX_VALUE);//1.7976931348623157E308
  
  System.out.println(Short.MAX_VALUE); // 32767

  //String caddeNo= "B203";
  String caddeNo= "203";
  String  sokakNo="1564";
  
  System.out.println(Integer.valueOf(caddeNo)+Integer.valueOf(sokakNo));
  
  //Integer.valuOf.(String numerik ifade ) methodu string olarak kaydedikmis 
  //numerik ifadeleri sayıya cevirir
  //ancak String ifadede numerik olmayan bir karakter olursa 
  // java NumberFormatException hatası veriri ve calısmayı durdurr
  //stops execution 
  
  
  
  
  System.out.println("Hello World");
  
  
  
  
  
     	
    	
    	
    }
}
