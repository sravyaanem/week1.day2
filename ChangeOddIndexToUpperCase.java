package week1.day2;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
	String normalString="welcome";
	for(int i=0;i<normalString.length();i++) {
			if(i%2!=0) {
				char upper=normalString.charAt(i);
				upper=Character.toUpperCase(upper);
				System.out.print(upper);
				
			}
			else
				System.out.print(normalString.charAt(i));
		}
	
	String str="iknownothing";
	char[] tochar=str.toCharArray();
	System.out.println("");
	for(int i=0;i<tochar.length;i++) {
		if(i%2!=0) {
		tochar[i]=Character.toUpperCase(tochar[i]);
		System.out.print(tochar[i]);
		}
		else{
			System.out.print(tochar[i]);
		}
	}
	}

}
