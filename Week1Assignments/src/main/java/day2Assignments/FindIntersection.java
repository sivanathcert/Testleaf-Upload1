package day2Assignments;

public class FindIntersection {
	public static void main(String[] args) {
		int[] arr1 = {3,2,11,4,6,7,8};
		int[] arr2 = {1,2,8,4,9,7,11};
		int arrLen1=arr1.length;
		int arrLen2=arr1.length;
		for(int i=0;i<arrLen1;i++) {
			for (int j=0;j<arrLen2;j++) {
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
				}
			}
		}
	}
}