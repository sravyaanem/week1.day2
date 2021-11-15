package week1.day2;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String test = "I am a software tester";
		String fin="";
		String[] splitted=test.split(" ");
		for(int i=0;i<splitted.length;i++) {
			if(i%2!=0) {
				String sh=splitted[i];
				char[] ch=sh.toCharArray();
				for(int k=ch.length-1;k>=0;k--) {
					fin+=ch[k];
					
				}
				fin+=" ";
			}
			else {
				fin+=splitted[i];
				fin+=" ";
			}
		}
		System.out.println(fin);
	}

}
