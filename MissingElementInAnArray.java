package week1.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for(int j=1;j<=arr.length;j++) {
			if(j!=arr[j-1]) {
				System.out.println(j);
				break;
			
		}
		
	}

}
}

