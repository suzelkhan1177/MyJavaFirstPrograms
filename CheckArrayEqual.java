package questions2;

public class CheckArrayEqual {

	public static void main(String[] args) {
		int a1[] = {1, 2, 3, 4, 5};
		int a2[]= {1, 2, 3, 4, 5};
		
		// Logic 1
//		boolean status = Arrays.equals(a1, a2);
//		if(status==true) {
//			System.out.println("Array is Equal ");
//		}else {
//			System.out.println("Array is Not Equal");
//		}
          
		// Logic 2
		boolean status = true;
		if(a1.length == a2.length) {
			
			for(int i=0; i<a1.length; i++) {
				
				if(a1[i]!= a2[i]) {
					status=false;
				}
			}
			
		}else {
		    status= false;
		}
		if(status==true) {
			System.out.println("Array is Equal");
		}else {
			System.out.println("Array is NOT eQual");
		}
	}

	}


