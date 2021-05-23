package questions2;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tha Number");
		int num = sc.nextInt();
		int org_num=num;
		
		int rev =0;
		
		while(num != 0) {
			
			rev=rev*10 + num%10;
			num=num/10;
		}
		if(org_num ==rev) {
			System.out.println(rev +" is Palindrome number");
		}else {
			System.out.println(rev +" is not Palindrome number");
		}

	}

}
