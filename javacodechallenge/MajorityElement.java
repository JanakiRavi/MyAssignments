package javacodechallenge;

public class MajorityElement {

	public static void main(String[] args) {


		int[] arr= {2,2,1,1,1,2,2};
		int size=arr.length;
		
		int max=0,index=0;
		
		for(int i=0;i<size;i++) {
			int count=0;
			for(int j=0;j<size;j++) {
				
				if(arr[i]==arr[j])
					count++;
			
			}
			if(count>max)
				max=count;
			    index=i;
		}
		
if(max>size/2) 
	System.out.println("Majority Element:"+arr[index]);

else
	System.out.println("No  Majority Element");

	}

}
