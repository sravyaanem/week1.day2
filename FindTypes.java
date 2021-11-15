package week1.day2;


	public class FindTypes {
		
		public static void main(String[] args) {
			// Here is the input
			String test = "$$ Welcome to 2nd Class of Automation $$ ";
            String let="";
            String numb="";
            String special="";
			// Here is what the count you need to find
			int  letter = 0, space = 0, num = 0, specialChar = 0;
			char[] chartest=test.toCharArray();
			for(int i=0;i<chartest.length;i++) {
				if(Character.isLetter(chartest[i])) {
					letter+=1;
					let+=chartest[i];
				}
				else if(Character.isDigit(chartest[i])) {
					num+=1;
					numb+=chartest[i];
				}
				else if(Character.isSpace(chartest[i])) {
					space+=1;
				}
				else {
					specialChar+=1;
					special+=chartest[i];
				}
			}
			System.out.println("letter: " + letter+" " + let);
			System.out.println("space: " + space);
			System.out.println("number: " + num +" "  +numb);
			System.out.println("specialCharcter: " + specialChar +" "+ special);

}
	}
