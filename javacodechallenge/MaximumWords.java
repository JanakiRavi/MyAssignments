package javacodechallenge;

public class MaximumWords {

	public static void main(String[] args) {
		String[] input= {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		int maxcount=0,length=0;
		for (int i = 0; i < input.length; i++) {
			String[] split = input[i].split(" ");
			 length=split.length;
			 if(maxcount<length)
					maxcount=length;
		}
		System.out.println(maxcount);
		

	}

}
