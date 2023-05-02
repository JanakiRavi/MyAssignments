package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";	
		
		int i,j;
		int count = 0;
		String[] words=text.split(" ");
		
        for (i=0;i<words.length;i++) {
        	for(j=i+1;j<words.length;j++) {
        		
        		if(words[i].equalsIgnoreCase(words[j]))
        		{ 
        			count++;
        		    words[j]="";
        	    }
        	}
        }
        if(count>0) {
        	for(int k=0;k<words.length;k++)
			System.out.print(words[k]+ " ");
		}
	}
}
