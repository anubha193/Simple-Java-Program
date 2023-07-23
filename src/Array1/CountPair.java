package Array1;

import java.util.HashMap;
import java.util.Map;

public class CountPair {
     static int count(int arr[],int k)
     {
    	  int count=0;
          HashMap<Integer,Integer>map=new HashMap<>();
          for(int i:arr)
          {
              if(map.containsKey(k-i)){
                  count+=map.get(k-i);
              }
              map.put(i,map.getOrDefault(i,0)+1);
          }
          return count;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 5, 7, 1};
       System.out.println(count(arr,6));
	}

}
