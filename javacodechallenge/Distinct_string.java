package javacodechallenge;

import java.util.*;
import java.util.Map.Entry;

public class Distinct_string {

	public static void main(String[] args) {
		String[] arr={"d","b","c","b","c","a"};
		//String[] arr= {"aaa","aa","a"};
		//String [] arr= {"a","b","a"};
		
		int k = 2;
		
		Map<String, Integer> occ=new LinkedHashMap<>();
		for (int i = 0; i < arr.length; i++) {
			occ.put(arr[i], occ.getOrDefault(arr[i], 0)+1);
		}
		System.out.println(occ);
		int count=0;
		String result="";
		for (Entry<String,Integer>entry : occ.entrySet()) {
			if(entry.getValue()==1)
				{count++;
			if(count==k) {
				result = entry.getKey();
				break;
			}
				}
	
		}

System.out.println(result);
	}

}
