package Array1;
import java.util.*;
public class xorsumofxor {
	 public static void subsetXORSum(int[] arr,int sum) {
	    	 parmute(0,arr,new ArrayList(),sum);
	         System.out.println(sum);  
	       
	    }
	     static void parmute(int start,int arr[],List<Integer> curr,int sum) 
	     {
	    	  sum+=xor(curr);
	    	  System.out.println(sum);  
	    	
	    	 for(int i=start;i<arr.length;i++)
	    	 {
	    		 curr.add(arr[i]);
	    		 parmute(i+1,arr,curr,sum);
	    		 curr.remove(curr.size()-1);
	    	 }
	     }
	    static int xor(List<Integer> curr)
	     {
	    	 int x=0;
	    	 for(int nums:curr) 
	    		 x^=nums;
	        return x;
	     }	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3};
		subsetXORSum(arr,0);
	}

}
