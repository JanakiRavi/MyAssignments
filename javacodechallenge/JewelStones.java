package javacodechallenge;

public class JewelStones {

	public static void main(String[] args) {
		String jewels = "z", stones = "ZZ";
		
		char[] jewelArray = jewels.toCharArray();
		char[] stonesArray = stones.toCharArray();
		
		int count=0;
		for (int i = 0; i < jewelArray.length; i++) {
		
			 for (int j = 0; j < stonesArray.length; j++) {
				if(jewelArray[i]==stonesArray[j])
					count++;
			}
		}
		System.out.println(count);

	}

}
