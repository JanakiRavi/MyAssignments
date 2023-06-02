package javacodechallenge;

import java.util.*;

public class UniqueElementSum {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5};
		  Map<Integer, Integer> frequencyMap = new HashMap<>();
	        
	        
	        for (int i=0;i<nums.length;i++) {
	            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i], 0) + 1);
	        }
	        System.out.println(frequencyMap);
	        
	        int sum = 0;
	        
	        for (int each : nums) {
	            if (frequencyMap.get(each) == 1) {
	                sum += each;
	            }
	        }
        System.out.println("Sum of unique Element in array:"+sum);
	}

}
