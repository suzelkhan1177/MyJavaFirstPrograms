package questions2;

public class Removejunk {

	public static void main(String[] args) {
		
		String s = " @#$%%^& Java *(&^$#@@%^  Programer **^$@#& Suzel";
		
		String a =s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(a);
		
		// Remove Tha White Spaces
		
		String str = "Java          Programer            suzel";
		
		System.out.println("Before remove white Space = "+str);
		String b= str.replaceAll("\\s","");
		
		System.out.println("After remove white Space = "+b);
	}
       
}
