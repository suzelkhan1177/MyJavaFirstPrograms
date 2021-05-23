package questions2;

import java.util.HashSet;

import com.sun.jdi.IntegerType;

public class DuplicateElementOfArray {

	public static void main(String[] args) {
		
		//Sorted Array Logic 1
//	     int a[] = {1,2 ,2, 3, 4, 5, 5};
//	     
//	     int temp[] = new int[a.length];
//	     
//	     int j=0;
//	     for(int i=0; i<a.length-1; i++) {
//	    	 
//	    	 if(a[i] != a[i+1]) {
//	    		 
//	    		 temp[j] = a[i];
//	    		 j++;
//	    	 }
//	     }
//	     temp[j] = a[a.length-1];
//	     
//	     for(int i=0; i<temp.length; i++) {
//	    	 
//	    	 System.out.print(temp[i]+" ");
//	     }
		
//		    Sorted or unSorted Logic 2
		int a[] = {1, 2, 3, 4, 5,6 ,7,2, 3};
		HashSet<Integer> Hs = new HashSet();
		
		for(int i=0; i<a.length; i++) {
			 Hs.add(a[i]);
		}
		for(int value:Hs) {
			
			System.out.print(value + " ");
		}
		
	}

}
