package javacodechallenge;

public class PharsePalindrome {

	public static void main(String[] args) {
		
		String str ="A man, a plan, a canal: Panama";

		String word=str.toLowerCase().replaceAll("[^a-z]", "");

		System.out.println(word);
		
		String rev="";
		
		char[] ch=word.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		
		System.out.println(rev);
		
       if(word.equals(rev))
		System.out.println("Palindrome");
       else
    	 System.out.println("Not Palindrome");
		
	}

}
