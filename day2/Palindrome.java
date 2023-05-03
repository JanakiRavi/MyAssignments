package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String input="madam";
		String rev="";
		
		for (int i=input.length()-1;i>=0;i--) {
			rev=rev+input.charAt(i);
		}
       if(input.equals(rev))
    	   System.out.println("Palindrome");
       else
    	   System.out.println("Not Palindrome");
	}

}
