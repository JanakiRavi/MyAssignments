package javacodechallenge;



public class SingleElement {

	public static void main(String[] args) {

		int[] arr= {4,1,2,1,2};

		int result=arr[0];

		for(int i=1;i<arr.length;i++) {
			result=result^arr[i];
		}

		System.out.println("Single Element in an array is: "+result);


	}

}
