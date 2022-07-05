package week2Day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="listen";
		String text2 = "silent";
if(text1.length()==text2.length())
{
	char [] text3 = text1.toLowerCase().toCharArray();
	char [] text4 = text2.toLowerCase().toCharArray();
	Arrays.sort(text3);
	Arrays.sort(text4);

boolean status = Arrays.equals(text3, text4);
if(status) {
	System.out.println("Anagram Words");
}
else {
	System.out.println("Not Anagram Words");
}
	}
else {
	System.out.println("Words are not Anagram");;
}
	}
}
