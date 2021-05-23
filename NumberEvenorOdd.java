package questions2;
import java.util.Scanner;
public class NumberEvenorOdd {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter tha Number");
	     int num = sc.nextInt();
	    int even_number=0;
	    int odd_number=0;
	    while(num>0) {
	    	int rem=num%10;
	    	
	    	
	    	if(rem%2==0) {
	    		even_number++;
	    	}else {
	    		odd_number++;
	    	}
	    	num=num/10;
	    }
	    System.out.println("Even Number : "+even_number);
	    System.out.println("odd Number : "+odd_number);
        
	}
}
