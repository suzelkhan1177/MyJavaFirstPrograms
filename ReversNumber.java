package questions2;
import java.util.Scanner;
public class ReversNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
          System.out.println("Enter tha Number");
		int num = sc.nextInt(); // 1234
           
		// Logic 1
//		int revers=0;
//		while( num != 0) {
//			revers= revers*10 + num%10;	 //0*10 + 1234/10=4 // 4*10 +123/10= 40+3= 43// 43*10 + 12/10= 430+2=432 // 432*10 + 1/10=4320+1= 4321                            
//           num= num/10;  // 1234/10=123 // 123/10=12 // 12/10=1 //1/10 =0
//		}
		// Logic 2
//       StringBuffer sb= new StringBuffer(String.valueOf(num));
//           StringBuffer revers = sb.reverse();
//           System.out.println("Revers Number "+revers);
		// Logic 3
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		StringBuilder revers = sb.reverse();
		System.out.println("Revers Number "+revers);
	}

}
