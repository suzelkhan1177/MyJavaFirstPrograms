package questions2;
import java.util.Scanner;
public class FibbonacciSeries {
	
	//Recurtion
	static int fib(int n) {
		if( n <= 0 ) {
			return 0;
		}else if( n == 1 ) {
			return 1;
		}else {
			return ( fib( n - 1 )+ fib( n - 2 ));
		}
	
	// Check Fibbonachi or not
	public static boolean checkMember(int n){
				
        if(n ==0 || n ==1){
            return true;
        }
        
        
        int a=0, b=1;
        
        do{
            int c = a;
               a= b;
              b = c+a;
        }while(b < n);
        
        if(b ==n){
            
            return true;
        }else{
            return false;
        }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tha Number");
		
		  int n= sc.nextInt();
		  int a=0, b=1;
	         System.out.print(a+" "+b+" ");
		     for(int i =0; i<=n-2;  i++) {
			int  c = a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		     }

	}
	
  
}
