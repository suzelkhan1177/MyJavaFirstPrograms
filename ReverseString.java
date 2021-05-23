package questions2;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter tha String");
      String name = sc.nextLine();
 
      // Logic 1 use Loop
//      String rev = "";
//      int len = name.length();
//      for(int i= len-1; i>=0; i-- ) {
//    	  rev =rev + name.charAt(i);
//      }
//      System.out.println("Revers String is : "+ rev);
      // Logic 2 use array
//      String rev = "";
//      char a[] = name.toCharArray();
//      int len = a.length;
//      for(int i = len-1; i>=0; i--) {
//    	  rev= rev + a[i];
//      }
//      System.out.println("Revers String is : "+ rev);
      StringBuffer sb = new StringBuffer(name);
      System.out.println("Revers String is : "+sb.reverse());
	}

}
