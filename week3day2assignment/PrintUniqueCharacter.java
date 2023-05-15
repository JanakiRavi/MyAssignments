package week3day2assignment;

import java.util.*;

public class PrintUniqueCharacter {

	public static void main(String[] args) {

		String input="Janaki";
		String res="";
		
		//Print unique characters
		//output:J n k i  (any order)
  
		
		//Convert String to Character array
		char[] charArray = input.toCharArray();
		//Create a new Set -> HashSet
		
		Set<Character> unique=new HashSet<Character>();
		
		for (int i = 0; i < charArray.length; i++) {
			 boolean add=unique.add(charArray[i]);
			if(add)
			res=res+charArray[i];
			else
				unique.remove(charArray[i]);
				
			
		}
		System.out.println(unique);
		
	}

}
