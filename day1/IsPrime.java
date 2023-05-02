package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int number=13,flag=0;
		
		for(int i=2;i<number-1;i++) {
			if(number%i==0)
				flag=1;
			break;
		}
		if(flag==1)
			System.out.println("The number is non-prime" );
		else 
		  System.out.println("The number is Prime");

	}

}
