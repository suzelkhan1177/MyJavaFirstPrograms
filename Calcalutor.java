package questions2;
import java.util.Scanner;
public class Calcalutor {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tha First Number");
		float a= sc.nextInt();
		System.out.println("Enter tha Operator");
		    sc.nextLine();
		    char operator = sc.nextLine().charAt(0);
		    
		System.out.println("Enter tha Second Number");
		float b= sc.nextInt();
		
		float result=0;
		switch(operator) {
		case '+':
		    result=a+b;
		    break;
		case '-':
			result=a-b;
			break;
		case '*':
			result=a*b;
			break;
		case '/':
			result=a/b;
			break;
			default:
				System.out.println("invalid Operator");
		}
		System.out.println("tha reasult is "+result);
		
	}
}
