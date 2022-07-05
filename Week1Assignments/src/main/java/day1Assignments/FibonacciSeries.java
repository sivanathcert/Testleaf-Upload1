package day1Assignments;

public class FibonacciSeries {

	public static void main(String[] args) {	
	
		int range = 8, firstNum = 0, secNum=1, sum;
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i = 2; i < range; i++) {	 					
			sum = firstNum + secNum;			
			firstNum=secNum;
			secNum=sum;
			System.out.println(sum);	
		}
	}
}
