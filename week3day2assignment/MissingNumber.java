package week3day2assignment;

import java.util.*;

public class MissingNumber {

	public static void main(String[] args) {

		int[] input= {2,5,6,4,1,8,3,2,5,10,8,9};

		// find missing number 
		// output:7

		Set<Integer>  unique= new TreeSet<Integer>();

		for (int i = 0; i < input.length; i++) {

			unique.add(input[i]);

		}
		System.out.println("Elements in Set:"+unique);

		int i=1,missing=0;
		for (Integer ele : unique) {

			if(ele != i) {
				missing = i;
				break;
			}
			i++;

		}

		System.out.println("Missing Element:"+missing);

	}

}
