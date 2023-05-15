package javacodechallenge;

import java.util.*;

public class DistinctIndices {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		boolean flag = false;
		int k = 3;
		
		//Set<Integer> distinct=new HashSet<>();
		
		for (int i = 0; i < nums.length; i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j] && (Math.abs(i-j)<=k))
					{
					flag=true;
					break;
					}
			}
			
		}
		if(flag)
			System.out.println("true");
		else
			System.out.println("false");
 
	}

}
//[1,0,1,1], k = 1