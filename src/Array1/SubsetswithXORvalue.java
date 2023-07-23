package Array1;

import java.util.ArrayList;
import java.util.List;

public class SubsetswithXORvalue {
	 static void subset(int arr[],int k)
     {
    	 List<List<Integer>>subset=new ArrayList<>();
    	 parmute(0,arr,new ArrayList(),subset,k);
         System.out.println(subset.size());
     }
     static void parmute(int start,int arr[],List<Integer> curr,List<List<Integer>>subset,int k) 
     {
    	if(xor(curr,k)){
    	 subset.add(new ArrayList<Integer>(curr));}
    	 for(int i=start;i<arr.length;i++)
    	 {
    		 curr.add(arr[i]);
    		 parmute(i+1,arr,curr,subset,k);
    		 curr.remove(curr.size()-1);
    	 }
     }
     static  boolean xor(List<Integer> curr,int k)
     {
    	 int x=0;
    	 for(int nums:curr) 
    		 x^=nums;
    	
    	if(x==k)return true;
    	else
    		return false;
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]= {6, 9, 4, 2};
         subset(arr,6);

	}

}
