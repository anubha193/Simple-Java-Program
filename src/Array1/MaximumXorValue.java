package Array1;

import java.util.ArrayList;
import java.util.List;

public class MaximumXorValue {
	 static void subset(int arr[],int[] nums)
     {
    	 List<List<Integer>>subset=new ArrayList<>();
    	 int k=0;
//    	 parmute(0,arr,new ArrayList(),subset,k);
    	 System.out.println(parmute(0,arr,new ArrayList(),subset,k));
    	 System.out.println(subset);
        
      
     }
     static int parmute(int start,int arr[],List<Integer> curr,List<List<Integer>>subset,int k) 
     {
    	k=Math.max(xor(curr), k);
          	 subset.add(new ArrayList<Integer>(curr));
    	 for(int i=start;i<arr.length;i++)
    	 {
    		 curr.add(arr[i]);
    		 parmute(i+1,arr,curr,subset,k);
    		 curr.remove(curr.size()-1);
    	 }
    	
    	 return k;
     }
     static  int xor(List<Integer> curr)
     {
    	 int x=0;
    	 for(int nums:curr) 
    		 x^=nums;
    	return x;
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]= {2, 4, 5};
		 int nums[]= {};
         subset(arr,nums);

	}
}
