import java.util.*;
public class Solution {  

    public static int secondLargestElement(int[] arr) {
    	//Your code goes here
        int n = arr.length;
        
        int first = Integer.MIN_VALUE;
       int second = Integer.MIN_VALUE;
        
    if(n ==0){
        
        return second;
    }
        
        for(int i=0;i<n; i++){
            
            
            if(arr[i] > first){
                
                second = first;
                first = arr[i];
            }
            
            
            if(arr[i] > second && arr[i] != first)
                  second = arr[i];
            
        }
        
        return second;
        
    }

}
