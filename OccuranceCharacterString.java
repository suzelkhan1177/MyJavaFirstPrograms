package questions2;

public class OccuranceCharacterString {

	public static void main(String[] args) {
		
		String s =  "Java Programming Java oops";
		
        	  int count =   s.length();
		
		    int count_After = s.replaceAll("J","").length();
		    
		    int total_count = count - count_After;
		    System.out.println("Occurance Character of String :"+ total_count);

	}

}
