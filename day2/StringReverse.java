package week1.day2;

public class StringReverse {

	public static void main(String[] args) {
		String input="TestLeaf";
		char[] str=input.toCharArray();
		for(int i=str.length-1; i>=0; i--)  {
			System.out.print(str[i]);
		}
		
 
	}

}
