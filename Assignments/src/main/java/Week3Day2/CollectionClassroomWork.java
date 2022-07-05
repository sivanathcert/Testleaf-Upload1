package Week3Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClassroomWork {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Pinapple");
		fruits.add("Mozambi");
		fruits.add("Pomo");
		fruits.add("Grape");
		fruits.add("Grape");
		fruits.add("Litchi");

		//Adding Fruits list

		System.out.println("Adding Fruits list -->" + fruits);

		//Adding Fruit name in Index 0 & 5 in ArrayList
		fruits.add(0, "Banana");
		fruits.add(5, "Banana");

		System.out.println("\nAdding Fruits in index 0 & 5 -->" + fruits);

		// Removing 0 index value Banana

		fruits.remove(0);

		System.out.println("\nRemoving Fruit (Banana) from index 0  -->" + fruits);

		//Finding Size of Fruits ArrayList

		int size = fruits.size();
		System.out.println("\nSize of Fruits ArrayList is: " + size);

		//Listing ArrayList value by iteration

		System.out.println("\nListing ArrayList value by iteration: ");

		for (int i=0; i < fruits.size();i++)
		{
			String string1 = fruits.get(i);
			System.out.println(string1);
		}


		// Sorting ArrayList

		Collections.sort(fruits);
		System.out.println("\nAfter Sorting into Ascending order : " + fruits);

		// To clear fruits ArrayList : fruits.clear();

		// To check whether ArrayList is empty or not?
		System.out.println("\nIs fruits ArrayLisy Empty? " + fruits.isEmpty());

		// Checking particular element is available in list or not

		System.out.println("\nIs fruits ArrayLisy Empty? " + fruits.contains("Banana"));

		//Foreach loop method

		System.out.println("\nListing each fruits element : ");
		for (String fruitList:fruits) {
			System.out.println(fruitList);
		}

		//Reverse the ArrayList - fruits
		System.out.println("\n\nReverse the fruits ArrayList elements: ");
		for (int i=size-1; i>=0 ;i--)
		{
			String string2 = fruits.get(i);
			System.out.println(string2);
		}
	}

}
