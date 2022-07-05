package week2Day1;

public class Palindrome {

	public static void main(String[] args) {
		String palin="malaYAlam";
		String rev="";
		char [] palinArray= palin.toCharArray();
		int palinLen = palin.length();
		for (int i=palinLen-1;i>=0;i--) {
			rev = rev + palin.charAt(i);
		}
if (palin.equalsIgnoreCase(rev)) {
	System.out.println("String is Palindrom");
}
	else {
		System.out.println("String is not a Palindrom");
	}
	}

}
