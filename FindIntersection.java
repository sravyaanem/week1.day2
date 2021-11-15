package week1.day2;

public class FindIntersection {
public static void main(String[] args) {
	int[] firArr={3,2,11,4,6,7};	 
	 int[] secArr={1,2,8,4,9,7};
	 int[] fin=new int[args.length];
	 for(int i=0;i<firArr.length;i++) {
		 for(int j=0;j<secArr.length;j++) {
			 if(firArr[i]==secArr[j]) {
				 System.out.println(firArr[i]);
			 }
			
		 }
	 }
}
}
