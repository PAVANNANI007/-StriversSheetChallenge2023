import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        if (prices.size() == 0) {
			 return 0 ;
		 }		
		 int max = 0 ;
		 int sofarMin = prices.get(0) ;
	     for (int i = 0 ; i < prices.size() ; ++i) {
	    	 if (prices.get(i) > sofarMin) {
	    		 max = Math.max(max, prices.get(i) - sofarMin) ;
	    	 } else{
	    		sofarMin = prices.get(i);  
	    	 }
	     }	     
	    return  max ;
    }
}
