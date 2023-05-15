package week3day2assignment;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
//		Declare a String as "PayPal India"
		String text= "PayPal India";
		
//		Convert it into a character array
		
		char[] array = text.toCharArray();

//		Declare a Set as charSet for Character

		Set<Character>  charSet=new LinkedHashSet<>();
		
//		Declare a Set as dupCharSet for duplicate Character
		
		Set<Character> dupCharSet=new LinkedHashSet<>();
		
//		Iterate character array and add it into charSet
		
		for (int i = 0; i < array.length; i++) {
			boolean add = charSet.add(array[i]);
			
//			if the character is already in the charSet then, add it to the dupCharSet
			if(!add)
				dupCharSet.add(array[i]);
			if(dupCharSet.contains(array[i])==charSet.contains(array[i]))
				charSet.remove(array[i]);
			
		}
//		Check the dupCharSet elements and remove those in the charSet
		
		
		System.out.println("Unique Characters:"+charSet);
		System.out.println("Duplicate Characters:"+dupCharSet);
		
		
	
	}

}
