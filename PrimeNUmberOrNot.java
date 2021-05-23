package questions2;
import java.util.Scanner;
public class PrimeNUmberOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   System.out.println("Enter tha Number");
	   
	   int num = sc.nextInt();
//	   boolean isPrime = true;
//	   
//	   for(int i=2; i*i<num; i++) {
//		   
//		   if(num%i==0) {
//			   isPrime=false;
//			   break;
//		   }
//	   }
//	   if(num<2) isPrime=false;
//	   System.out.println("Is Prime = "+isPrime);
	   int count =0;
	  
	   if(num>1) {
		   
		   for(int i=1; i*i<=num; i++) {
			   
			   if(num%i==0) 
				   count++;
		   }
		   if(count==2) {
			   System.out.println("Prime Number");
		   }else{
			   System.out.println("Not Prime Number");
		   }
		   
	   }else {
		   System.out.println("Not Prime Number");
	   }
	}

}
