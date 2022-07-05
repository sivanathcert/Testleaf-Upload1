package day1Assignments;

public class Factorial {

	public static void main(String[] args) {
		int input=6;
		int fact = 1;
		for(int i=1;i<=input;i++) {
			fact = fact*i;
		}
System.out.println(fact);
	}

}
