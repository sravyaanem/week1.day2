package week1.day2;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
	String str1="";
	String str2="";
	
	String text1="stops";
	String text2="potss";
	char[] char1=text1.toCharArray();
	char[] char2=text2.toCharArray();
	Arrays.sort(char1);
	Arrays.sort(char2);
	for(int i=0;i<char1.length;i++) {
		str1+=char1[i];
	}
	for(int j=0;j<char2.length;j++) {
		str2+=char2[j];
	}
	
	if(str1.equalsIgnoreCase(str2)) {
		System.out.println(" same values :"+" "+str1+" "+str2);
	}
	else
		System.out.println("diff values"+" "+str1+" "+str2);
	
	}
}
