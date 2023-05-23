package javacodechallenge;

import java.util.Map;
import java.util.*;
import java.util.TreeMap;

public class OccurenceUnique {

	public static void main(String[] args) {
	int[] arr = {1,2,2,1,3,3};
	
	Map<Integer, Integer> map=new TreeMap<>();
	
	for (int i = 0; i < arr.length; i++) {
		map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
	}
  
	Set<Integer> set=new LinkedHashSet<>(map.values());
	
	if(map.size()==set.size())
		System.out.println("True");
	else
		System.out.println("False");
	
	}

}
