package week1.day2;

public class CharOccurance {
	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count=0;
		char[] charr=str.toCharArray();
		for(int i=0;i<charr.length;i++) {
			if(charr[i]=='e') {
				count=count+1;
			}
		}
		System.out.println("count of e's :"+count);
	}

}
