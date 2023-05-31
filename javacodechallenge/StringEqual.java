package javacodechallenge;

public class StringEqual {

	public static void main(String[] args) {
		String [] word1 = {"ab", "c"};
		String[] word2 = {"a", "bc"};
		String str1="";
		String str2="";
		
		for (int i = 0; i < word1.length; i++) {
			str1=str1+word1[i];
		}
		for(int j=0;j<word2.length;j++) {
			str2=str2+word2[j];
		}
		if(str1.equalsIgnoreCase(str2))
			System.out.println("True");
		else
			System.out.println("False");
	}

}
