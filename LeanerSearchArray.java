package questions2;

public class LeanerSearchArray {

	public static void main(String[] args) {
		
		int a[] = {10, 20, 40, 90,50};
		
		int search_element=20;
		boolean flag = false;   
		
		for(int i=0; i<a.length; i++) {
			
			if(search_element==a[i]) {
				
				System.out.println("Element Found = "+i);
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Element Not Found");
		}

	}

}
