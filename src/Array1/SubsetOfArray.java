package Array1;

import java.util.*;

public class SubsetOfArray {
	static void subset2(List<Integer> arr)
    {
   	 List<List<Integer>>subset=new ArrayList<>();
   	 parmute2(0,arr,new ArrayList(),subset);
        System.out.println(subset);
    }
	static void parmute2(int start,List<Integer> arr,List<Integer> curr,List<List<Integer>>subset) 
    {
   	
   	 subset.add(new ArrayList<Integer>(curr));
   	 for(int i=start;i<arr.size();i++)
   	 {
   		 curr.add(arr.get(i));
   		 parmute2(i+1,arr,curr,subset);
   		 curr.remove(curr.size()-1);
   	 }
    }
     static void subset(int arr[])
     {
    	 List<List<Integer>>subset=new ArrayList<>();
    	 parmute(0,arr,new ArrayList(),subset);
         System.out.println(subset);
     }
     static void parmute(int start,int arr[],List<Integer> curr,List<List<Integer>>subset) 
     {
    	
    	 for(int i=start;i<arr.length;i++)
    	 {
    		 curr.add(arr[i]);
    		 parmute(i+1,arr,curr,subset);
    		 curr.remove(curr.size()-1);
    	 }
    	 subset.add(new ArrayList<Integer>(curr));
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]= {3,1,2};
         subset(arr);
         List<Integer> arr2=new ArrayList<>();
         arr2.add(3);
         arr2.add(1);
         arr2.add(2);
         subset2(arr2);
         }

}
