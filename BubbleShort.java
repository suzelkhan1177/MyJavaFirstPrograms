 package questions2;

import java.util.Arrays;
import java.util.Collections;

public class BubbleShort {

	public static void main(String[] args) {
	
		// Logic 1 Bubble Short
		
//		int a[] = {3, 2, 1, 4,6,5};
//		System.out.println("Array Befor Sorting = "+ Arrays.toString(a));
//		
//		int n = a.length;
//		
//		for(int i =0; i<n-1; i++) {
//			
//			for(int j=0; j<n-1; j++) {
//				
//				if(a[j] > a[j+1]) {
//					
//					int temp =a[j];
//					    
//					a[j] = a[j+1];
//					a[j +1] = temp;
//				}
//			}
//		}
//		System.out.println("Array After Sorting = "+ Arrays.toString(a));
		
		//Logic 2 sort Element
		
//	int a[] = {3, 2, 1, 4,6,5};
//		
//		System.out.println("Array Befor Sorting = "+ Arrays.toString(a));
//		Arrays.parallelSort(a);
//		System.out.println("Array After Sorting = "+ Arrays.toString(a));

		// Logic 3 sort Accending Order
		
//	int a[] = {3, 2, 1, 4,6,5};
//		
//		System.out.println("Array Befor Sorting = "+ Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println("Array After Sorting = "+ Arrays.toString(a));
		
//		Logic 4  Decending Order
		
	Integer a[] = {3, 2, 1, 4,6,5};
		
		System.out.println("Array Befor Sorting = "+ Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Array After Sorting = "+ Arrays.toString(a));
	}

}
