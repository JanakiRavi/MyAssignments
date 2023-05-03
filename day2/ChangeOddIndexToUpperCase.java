
package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String input="changeme";
		
		char[] str=input.toCharArray();
		
		//System.out.println(str);
		
		for(int i=0;i<str.length;i++) {
			if(i%2!=0) {
				str[i]=Character.toUpperCase(str[i]);
			}
		}
		System.out.println(new String(str));
	}

}
