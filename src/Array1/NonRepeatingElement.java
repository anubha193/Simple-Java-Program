package Array1;

import java.util.HashMap;


public class NonRepeatingElement {
      public static int repeated(int arr[],int n)
      {
    	  HashMap<Integer,Integer> hm=new HashMap<>();
    	  for(int i=0;i<n;i++)
    	  {
    		  if(hm.containsKey(arr[i]))
    			  hm.put(arr[i], hm.get(arr[i])+1);
    		  else
    			  hm.put(arr[i], 1);
    	  }
    	  for(int i=0;i<n;i++) {
    		  if(hm.get(arr[i])==1)
    			  return arr[i];
    	  }
    	  return -1;
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {-1, 2, -1, 3, 2};
        System.out.println("first non repeated element is="+ repeated(arr,arr.length));
	}

}
