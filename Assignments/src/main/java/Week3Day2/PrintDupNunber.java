package Week3Day2;

import java.util.ArrayList;
import java.util.List;

public class PrintDupNunber {

	public static void main(String[] args) {

		//Adding values into ArrayList evenList

		List<Integer> evenList = new ArrayList<Integer>();
		evenList.add(10);
		evenList.add(101);
		evenList.add(25);
		evenList.add(11);
		evenList.add(86);
		evenList.add(52);
		evenList.add(1055);
		evenList.add(77);
		evenList.add(43);
		evenList.add(38);
		evenList.add(77);
		evenList.add(12);
		evenList.add(388);
		evenList.add(101);
		evenList.add(1055);

		//Print duplicate
		
		int count=0;
		for(int i=0;i<evenList.size()-1;i++) {
			for(int j=i+1;j<evenList.size()-1;j++) {

				if(evenList.get(i)==evenList.get(j))
				{

					System.out.print(evenList.get(j) +" " );	
				}
			}

		}
	}
}

