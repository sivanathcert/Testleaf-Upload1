package day1Assignments;
public class PrimeNumber {
	public static void main(String[] args) {
		int inputNum = 13;
		boolean flag=false;
		for (int i = 2; i <= inputNum/2; i++) {
			if (inputNum % i == 0)
			{
			flag=true;
			break;
		}
		}
			if (flag==false)
			{
				System.out.println("Prime Number");
			}
			else
			{
				System.out.println("Not a Prime Number");
			}
		
}
}
