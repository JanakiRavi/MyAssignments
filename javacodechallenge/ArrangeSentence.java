package javacodechallenge;

public class ArrangeSentence {

	public static void main(String[] args) {
		 String s = "is2 sentence4 This1 a3";
		 String[] arr=s.split(" ");
		 int len=arr.length;
		 String[] result=new String[len];//to store output
		 int index;
		 
		 for(String each:arr){
	            index = Character.getNumericValue(each.charAt(each.length()-1));
	            result[index-1] = each.substring(0,each.length()-1);
	        }
			    
		 for (int i = 0; i < result.length; i++) {
			 System.out.print(result[i]+ " ");
		 }
	}

}
