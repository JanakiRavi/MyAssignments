package javacodechallenge;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String s1="Hello World";
		String s2 ="luffy is still joyboy";
		
		String s3="   fly me   to   the moon  "; // not getting correct output for this input
		
		String lastword1=s1.substring(s1.lastIndexOf(" ")+1);
		String lastword2=s2.substring(s2.lastIndexOf(" ")+1);
		
		int input1=lastword1.length();
		System.out.println(lastword1  + ":" +input1);
		
		int input2=lastword2.length();
		System.out.println(lastword2  + ":" +input2);

	}

}
