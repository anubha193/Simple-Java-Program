package Array1;

import java.util.ArrayList;
import java.util.List;

public class SubsetOfArray2 {
      static void subset(ArrayList<Integer> arr)
      {
    	  ArrayList<ArrayList<Integer>> res=new ArrayList<>(); 
    	  
    	  res.add(new ArrayList());
    	  for(int num:arr)
    	  {
    		  int n=res.size();
    		  for(int i=0;i<n;i++)
    		  {
    			  ArrayList<Integer> temp=new ArrayList(res.get(i));
    			  temp.add(num);
    			  res.add(temp);
 ;   		  }
    	  }
    	  System.out.println(res);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr2=new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        subset(arr2);
	}

}
