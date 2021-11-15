package week1.day2;

public class SecondOccuranceString {
	public static void main(String[] args) {
		String strSec="Have a Good Apple";
		System.out.println(strSec.indexOf('G'));
		int[] arrSec=new int[args.length];
		String sh="";
		int j=0;
		for(int i=0;i<strSec.length();i++) {
			char ch=strSec.charAt(i);
			if(ch=='a' ) {
			int b=strSec.indexOf('a',i);
//		System.out.println(b);
			sh=sh+b;
			}
		}
	System.out.println(sh);
		System.out.println(sh.substring(1,2));
	}
}
		
		    
		

		
		
		
	

