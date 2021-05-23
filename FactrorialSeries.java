package questions2;
import java.util.Scanner;
public class FactrorialSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tha Number");
		
		// factorial
		int num =sc.nextInt();
		// Decanding order
		
//		int factorial=1;
//		for(int i=num; i>=1; i--) {
//			
//			factorial=factorial*i; // 1*5=5 5*4=20  20*3=60 60*2=120 
//		}
//      System.out.println(factorial);
		
		//Accending order
	
		int factorial=1;
		for(int i=1; i<=num; i++) {
			
			factorial=factorial*i; // 1*5=5 5*4=20  20*3=60 60*2=120 
		}
      System.out.println(factorial);
		//Square Power
//		
//		int a= sc.nextInt();
//		int b= sc.nextInt();
//		
//	    int result=1;
//		for(int i=1; i<=b; i++) {
//			
//			result=result*a; //1*2=2 2*2=4 4*2=8
//		}
//		System.out.println(result);
	}

}
