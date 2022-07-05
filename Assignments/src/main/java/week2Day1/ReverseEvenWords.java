package week2Day1;
public class ReverseEvenWords {
	public static void main(String[] args) {
		String text = "I am a Software Developer";
		String [] split=text.split(" ");
		String revString="";
		for (int i=0;i<split.length;i++) {
			String word = split[i];
			String revText1="";
			for (int j=word.length()-1;j>=0;j--){
				revText1 = revText1 + word.charAt(j);
			}
			revString = revString + revText1 + " ";
		}
		System.out.println(text);
		System.out.println(revString);
	}
}