package week3day2assignment;

import java.util.*;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		Set<Integer> setname=new TreeSet<Integer>();
		
		for (int i = 0; i < data.length; i++) {
			setname.add(data[i]);
		}
		System.out.println("Elements in Set:"+setname);
		
		
		//convert set to list
		List<Integer> list=new ArrayList<Integer>(setname);
		System.out.println("Elements in List:"+list);
		//get list size
		System.out.println(list.size());
		
		System.out.println("SecondLargest Number:"+ list.get(4));
		

	}

}
