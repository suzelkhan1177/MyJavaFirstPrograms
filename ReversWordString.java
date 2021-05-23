package questions2;
import java.util.Scanner;
public class ReversWordString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tha word");
		String s = sc.nextLine();
	
		// Logic 1
		
		String[] words = s.split(" ");
		
		String reversString = "";
		
		for(String w : words) {
			
		   String reversword ="";
		   
		   for(int i= w.length()-1; i>=0; i--) {
			   
			   reversword = reversword + w.charAt(i);
		   }
		   
		   reversString = reversString + reversword + " ";
		}
		
		System.out.println("Reverse of Word :"+ reversString);
		
		// Logic 2
//		
//		String[] words= s.split("\\s");
//		
//		String reversword = "";
//		
//		for(String w : words) {
//			
//			StringBuffer sb = new StringBuffer(w);
//			sb.reverse();
//			
//			reversword = reversword + sb.toString() + " ";
//		}
//		
//		System.out.println("Reverse of Word :"+ reversword);
	}
	
}

