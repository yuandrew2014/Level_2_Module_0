package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> str = new ArrayList<String>();
		//2. Add five Strings to your list
		str.add("john");
		str.add("john salty");
		str.add("john selty and");
		str.add("john salty and big");
		str.add("john selty and big!!!");
		//3. Print all the Strings using a standard for-loop
		//for (int i = 0; i < str.size(); i++) {
		//	System.out.println(str.get(i));
		//}
		//4. Print all the Strings using a for-each loop
		//for(String big : str) {
			//System.out.println(big);
			
		//for (int i = 0; i < str.size(); i++) {
			//if (i % 2 == 0) {
			//	System.out.println(str.get(i));
			//}
		
		//}
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		for (int i = str.size()-1; i >= 0; i--) {
		boolean e =	(str.get(i).contains("e"));
			if(e == true) {
				System.out.println(str.get(i));
				
			}
		}
		//7. Print only the Strings that have the letter 'e' in them.
		
	}
}
