package week3day2assignment;

import java.util.*;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		String[] str = text.split(" ");
		String res="";
		
		
		
		Set<String> uniquewords=new LinkedHashSet<String>();
		
		for (int i = 0; i < str.length; i++) {
			
			boolean add = uniquewords.add(str[i]);
			if(add)
				res=res+str[i]+" ";
		}
		System.out.println(res);

	}

}
