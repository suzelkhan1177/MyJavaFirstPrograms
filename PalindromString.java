package questions2;
import java.util.Scanner;
public class PalindromString {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter tha String");
	    String str = sc.next();
	    
	    String orginalnumber=str;
	    
	  String rev ="";
	  int len = str.length();
	  for(int i= len-1; i>=0; i--) {
		  
		  rev= rev +str.charAt(i);
	  }
	  if(orginalnumber.equals(rev)) {
	    System.out.println(rev+" is Palindrom Number");
	  }else {
		   System.out.println(rev+" is Not Palindrom Number");
	  }
	}

}
