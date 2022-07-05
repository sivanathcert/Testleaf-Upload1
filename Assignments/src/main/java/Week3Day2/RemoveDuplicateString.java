package Week3Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateString {

	public static void main(String[] args) {

		/*Declaring string as sentence
		String sentence = "We learn Java basics basics as part of java sessions in java week1";
		int count=0;

		//Converting Sentence to Lowercase
		sentence = sentence.toLowerCase();

		//Split the string into array and iterate over it
		String[] str = sentence.split(" ");

		for(int i=0;i<str.length;i++) 
		{
			//Inner loop to check the word is there in the array

			for(int j=i+1;j<str.length;j++) 
			{
				//Replace found word with space
				
				if(str[i].equals(str[j])){
					str[j]="";
				}
			}
		}
		for(int i1=0;i1<str.length;i1++) {
			System.out.print(str[i1]+" ");
		}*/
		
		String input = "we learn java in java week session learn";
		String[] split = input.split(" ");
		Set<String>set=new LinkedHashSet<String>(Arrays.asList(split));
		List<String>lst=new ArrayList<String>(set);
		System.out.println(lst);
	}
}

