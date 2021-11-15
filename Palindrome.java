package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		String nameactual="madam";
		String rev="";
		for(int i=nameactual.length()-1;i>=0;i--) {
			char ch=nameactual.charAt(i);
			rev=rev+ch;
		}
		if(nameactual.equalsIgnoreCase(rev)) {
			System.out.println("This string is palindrome: "+rev);
		}
		else {
			System.out.println("this is not palindrome: "+rev);
		}
	}

}
