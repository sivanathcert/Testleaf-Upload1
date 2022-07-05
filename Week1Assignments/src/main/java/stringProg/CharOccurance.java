package stringProg;

public class CharOccurance {

	
	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count=0;
		int strLen = str.length();
		char search = 'e';
		char [] strArr = str.toCharArray();		
		for (int i=0;i<strLen;i++)
		{
			if(search==strArr[i])
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
