package javacodechallenge;

import java.util.Arrays;

public class ClosestCharacterDistance {

	public static void main(String[] args) {
		String s = "aaab";
        char c = 'b';
        
        int answer[]=new int[s.length()];
        
        int prev = Integer.MAX_VALUE;       
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            answer[i] = Math.abs(i - prev);
        }
        prev = Integer.MAX_VALUE;

        // Traverse from right to left
        for (int i =s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            answer[i] = Math.min(answer[i], Math.abs(i - prev));
        }
        String result=Arrays.toString(answer);
        System.out.println(result);
	}

}
