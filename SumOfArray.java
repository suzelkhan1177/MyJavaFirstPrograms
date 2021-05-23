package questions2;
import java.util.Scanner;
public class SumOfArray {

	public static void main(String[] args) {
		
		int a[] = {5, 6, 4, 3, 9};
		
		int sum=0;
//		for(int i=0; i<=a.length-1; i++) {
//			
//			sum= sum+a[i];
//		} 
		 //Enhanced for loop
		
		for(int value:a) {
			sum=sum+value;
		}
		System.out.println("Sum of Array = "+ sum);
	   
	}

}
