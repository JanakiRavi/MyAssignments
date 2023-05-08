package javacodechallenge;

public class HappyNumber {

	public int getSum(int num){

		int unit=0,sum=0;
		
	
		while(num>0) {


			unit=num%10;
			sum=sum+unit*unit;
			num=num/10;

		}

		return sum;

	}


	public static void main(String[] args) {

		int num=19;
		int result=num;


		HappyNumber number=new HappyNumber();
		
		//System.out.println(number.getSum(num));
		
		while(result!=1 && result!=4) {
			result= number.getSum(result);
		}
		
      if(result==1)
    	  System.out.println("Happy Number");
      else
    	  System.out.println("Not a Happy Number");

	}

}
