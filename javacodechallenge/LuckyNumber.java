package javacodechallenge;

import java.util.*;
import java.util.Map.Entry;

public class LuckyNumber {
public static void main(String[] args) {
	int[] arr= {2,2,3,3,4};
	
	Map<Integer, Integer> freq=new HashMap<>();
	for (int i=0;i<arr.length;i++) {
		freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
		
	}
	System.out.println(freq);
     int luckynum=-1;
	
	for (Entry<Integer, Integer> entry : freq.entrySet()) {
		if(entry.getKey()==entry.getValue())
			luckynum=Math.max(luckynum, entry.getKey());
	}
	System.out.println(luckynum);
}
}
