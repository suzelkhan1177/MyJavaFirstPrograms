package questions2;

public class Swap2Number {

	public static void main(String[] args) {
	  int a=20, b=30;
	  System.out.println("Before Swapping value "+ a +" " + b);
	  // Logic 1
//	  int t=a;//20
//	   a=b;// 30
//	   b=t;//20
//	   System.out.println("Swapping value "+ a +" " + b);
	  //Logic  2
	  // + & - operater used 
//	  a=a+b;  //50
//	  b=a-b;  //50-30
//	  a=a-b;  //50-20
//	  System.out.println("Swapping value "+ a +" " + b);
	  //Logic 3 * & / operateor used
//	  a=a*b;   // 600
//	  b=a/b;   //600/30
//	  a=a/b;
//	  System.out.println("Swapping value "+ a +" " + b);
	  // Logic 4 ^ Bitwish Operator
//	  a=a^b;  //20^30=50
//	  b=a^b; // 50^30=20
//	  a=a^b; //50^20=30
//	  System.out.println("Swapping value "+ a +" " + b);
	  //Logic 5 simpal stettment
	  b= a+b -(a=b);
	  System.out.println("Swapping value "+ a +" " + b);
	}

}
