package Week3Day2;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbersInList {

	public static void main(String[] args) {

		List<Integer> evenList = new ArrayList<Integer>();
		evenList.add(10);
		evenList.add(101);
		evenList.add(25);
		evenList.add(11);
		evenList.add(86);
		evenList.add(52);
		evenList.add(10055);
		evenList.add(77);
		evenList.add(43);
		evenList.add(38);
		evenList.add(77);
		evenList.add(12);
		evenList.add(388);
		evenList.add(101);

		//Print List of Arraylist integer elements
		System.out.println(evenList);

		//Finding Even numbers from ArrayList

		System.out.println("\nEven Numbers are: ");
		for (int i=0;i<evenList.size();i++) {
			if(evenList.get(i)%2==0)
				System.out.println(evenList.get(i));			
		}
	}

}
