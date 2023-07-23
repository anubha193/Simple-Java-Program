package BinarySearchProblem;

import java.util.Arrays;

public class SearchInAInfiniteSortedArray {
	static int searchInfinitemod(int arr[],int key)
	{
		if(arr.length==0)return -1;
		if(arr[0]==key)return 0;
		int index=1;
		while(arr[index]<=key)
			index*=2;
		int pos=search(arr,index/2,index,key);
		return pos;
		
	}
          static int searchInfinite(int arr[],int key)
          {
        	  int low=0;
        	  int high=1;
        	  while(key>arr[high])
        	  {
        		  low=high;
        		  high=2*high;
        		  }
        	 int pos=search(arr,low,high,key);
        	 return pos;
        	
          }
          static int search(int[] arr,int start,int end,int k)
          {
        	 
        	  while(start<=end)
        	  {
        		  int mid=start+(end-start)/2;
        		  if(arr[mid]==k)
        			  return mid+1;
        		  else if(arr[mid]>k)
        			  end=mid-1;
        		  else
        			  start=mid+1;
        	  }
        	  return -1;
          }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9,23,34,56,78,89,90,99,94,96};
		Arrays.sort(arr);
		int key=56;
      System.out.println(searchInfinite(arr,key));
      System.out.println(searchInfinitemod(arr,key));
	}

}
