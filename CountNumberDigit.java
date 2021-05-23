package questions2;
import java.util.Scanner;
public class CountNumberDigit {

	public static void main(String[] args) {
		System.out.println("Enter tha Digits");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		 
//	       StringBuffer sl = new StringBuffer(String.valueOf(num));
//	           int len = sl.length();
//		for(int i=num; i<=num; i++) {
//			System.out.println("Total Digits "+len);
//		}
        int count =0;
        while(num>0) {
        	num=num/10;
        	count++;
        }
        System.out.println("Total Digits "+ count);
//		int NumberOfDigits = (int)Math.log10(num)+1;
//		System.out.println(NumberOfDigits);
	}

}
