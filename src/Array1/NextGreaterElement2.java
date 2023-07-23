package Array1;
import java.util.*;
public class NextGreaterElement2 {
     static int[] solve(int[] arr1,int[] arr2)
     {
    	 int n1=arr1.length;
    	 int n2=arr2.length;
    	 HashMap<Integer,Integer> hm=new HashMap<>();
    	Stack<Integer> st=new Stack<>();
    	int res[]=new int[n2];
    	for(int i=n2-1;i>=0;i--)
    	{
    		while(!st.isEmpty() && st.peek()<=arr2[i])
    			st.pop();
    		if(st.isEmpty())
    			res[i]=-1;
    		else
    			res[i]=st.peek();
    		st.push(arr2[i]);
    	}
    	
    	for(int i=0;i<n2;i++)
    	{
    		hm.put(arr2[i],res[i]);
    	}
    	int temp[]=new int[n1];
    	for(int i=0;i<n1;i++)
    	{
    		temp[i]=hm.get(arr1[i]);
    	}
    	return temp;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {2,4};
		int arr2[]= {1,2,3,4};
		int temp[]=solve(arr1,arr2);
		for(int i=0;i<temp.length;i++)
			System.out.print(temp[i]+" ");

	}

}
