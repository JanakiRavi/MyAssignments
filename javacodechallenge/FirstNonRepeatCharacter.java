package javacodechallenge;



public class FirstNonRepeatCharacter {
	
	
	
	public int nonrepeat(String input) {
		char[] arr = input.toCharArray();
		int count=0;
		 for(int i = 0; i < arr.length; i++) {
			 count=0;
			for (int j = 0; j < arr.length; j++) {
				
				if(arr[i]==arr[j]&& i!=j)
				
					count++;
		
			}
			if(count==0)
				return i;
		}
		return -1;

	}
	
	
	

	public static void main(String[] args) {
		
		String input="aabb";
		
		FirstNonRepeatCharacter rep=new FirstNonRepeatCharacter();
		System.out.println(rep.nonrepeat(input));
		
		
	}

}
