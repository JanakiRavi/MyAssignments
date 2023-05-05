package week2.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester"; 
	
		String[] arr=test.split(" ");
		String rev="";
		
		for(int i=0;i<arr.length;i++) {
			if(i%2!=0) {
	
		char[] words=arr[i].toCharArray();
		
		for(int j=words.length-1;j>=0;j--) {
			rev=rev+words[j];
		}
				System.out.print(rev+" ");
			}
			else {
				System.out.print(arr[i]+" ");
			}
			
		}

		
	}

}
