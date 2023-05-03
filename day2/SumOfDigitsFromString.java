package week1.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String text ="Tes12Le79af65";
		int i,sum=0;
		String string=text.replaceAll("\\D","");
		char[] str=string.toCharArray();
		System.out.println(str);
		
		for(i=0;i<str.length;i++) {
			
			int a=Character.getNumericValue(str[i]);
			sum=sum+a;
		}
         System.out.println(sum);
	}

}
