package javacodechallenge;
import java.util.Arrays;

public class DuplicateElement {

	public static void main(String[] args) {
		
		int[] arr= {1,1,1,3,3,4,3,2,4,2};
		boolean duplicate=false;
		Arrays.sort(arr);
		
		for(int i=1;i<arr.length;i++) {
			
		if(arr[i]==arr[i-1])
		{
			duplicate=true;
			break;
		}
	}
		
		System.out.println(duplicate);
}
}
