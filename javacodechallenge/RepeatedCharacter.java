package javacodechallenge;

import java.util.HashSet;
import java.util.Set;

public class RepeatedCharacter {

	public static void main(String[] args) {
		String s="abccbaacz";
		char result=' ';
		
		Set<Character> set=new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			
			
			if (!set.add(s.charAt(i)))
			{
				
				result=s.charAt(i);
				break;
			}
			
			
		}
		
System.out.println(result);

	}

}
