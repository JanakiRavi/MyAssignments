package javacodechallenge;

public class SquareRoot {

	public static void main(String[] args) {
		// using math.sqrt
		int number=64;
		int answer=(int) Math.sqrt(number);
		
		System.out.println(answer);
		
		// without built-in function
		
		int n=100;
		for(int i=1;i<=n;i++) {
			if(i*i>n) {
				System.out.println(i-1);
				break;
			}
		}
		
	}

}
