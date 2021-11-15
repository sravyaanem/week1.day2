package week1.day2;

import java.util.Arrays;

public class ArrayFindLargest {
	public static void main(String[] args) {
		int arr[]= {34,5,78,1,90};
		int len=arr.length;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println(len);
		
		System.out.println(arr[len-2]);
		System.out.println(arr[1]);
		
		
	}

}
