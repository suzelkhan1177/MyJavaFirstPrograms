package questions2;
import java.util.Scanner;
public class FindThaLargeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tha First Number");
		int a= sc.nextInt();
		System.out.println("Enter tha Second Number");
		int b= sc.nextInt();
		System.out.println("Enter tha Third Number");
		int c= sc.nextInt();
          
//		if(a>b && a>c) {
//			System.out.println(a+ " is Largest Number");
//		}else if(b>a && b>c) {
//			System.out.println(b+ " is Largest Number");
//		}else {
//			System.out.println(c+ " is Largest Niumber");
//		}
		int largest = a>b?a:b;
		int largest2 = c>largest? c:largest;
		System.out.println(largest2+" is tha laegest NUMBER");
		
		
	}

}
