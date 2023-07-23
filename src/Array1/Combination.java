package Array1;
import java.util.*;
public class Combination {
	 static void combine(int n, int k) {
	        List<List<Integer>>subset=new ArrayList<>();
	    	 parmute(1,n,new ArrayList(),subset,k);
	        System.out.println(subset);
	 
	    }
	     static void parmute(int start,int n,List<Integer> curr,List<List<Integer>>subset,int k) 
	     {
	    	if(curr.size()==k)
	    	 subset.add(new ArrayList<Integer>(curr));
	    	 for(int i=start;i<=n;i++)
	    	 {
	    		 curr.add(i);
	    		 parmute(i+1,n,curr,subset,k);
	    		 curr.remove(curr.size()-1);
	    	 }
	     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		combine(3,2);

	}

}
