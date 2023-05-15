package week3day2assignment;



import java.util.*;

public class SortingUsingCollection {

	public static void main(String[] args) {


		// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)	
		String[] arr= {"HCL","Wipro",  "Aspire Systems", "CTS"};
		

		// get the length of the array		
		int length=arr.length;
		
		// sort the array
		Arrays.sort(arr);
		// Iterate it in the reverse order
		
		
		
		for (int i = length-1; i >=0 ; i--) {
			System.out.print(arr[i]+", ");
			
			
		}

		
			
		// Required Output: Wipro, HCL , CTS, Aspire Systems

	}

}
