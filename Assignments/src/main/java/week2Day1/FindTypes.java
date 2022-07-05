package week2Day1;

public class FindTypes {

	public static void main(String[] args) {
String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? ee 25.33$#@";
int letter=0, space=0,num=0,specialChar=0;
char [] strArr = test.toCharArray();
for(int i=0;i<test.length();i++) {
	if(Character.isLetter(strArr[i])) {
		letter++;
	}
	else if(Character.isDigit(strArr[i])) {
		num++;
	}
	else if(Character.isWhitespace(strArr[i])) {
		space++;
	}
	else {
		specialChar++;
	}
	}
System.out.println("No of Letters : " + letter);
System.out.println("No of Numbers : " + num);
System.out.println("No of Spaces : " + space);
System.out.println("No of Special Characters : " + specialChar);
	}

}
