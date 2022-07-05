package day2Assignments;

import java.util.Arrays;

public class MissingElementsArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,10,6,8,5};
		Arrays.sort(arr);
		int length1=arr.length;
		
		for(int i=1;i<=length1;i++) {
			if (i!=arr[i-1]) {
				System.out.println(i);
				break;
			}
		}
}
}
