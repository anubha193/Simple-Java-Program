package Sorting;

public class SearchInARotatedSortedArray {
      static int search(int arr[],int key)
      {
    	  int l=0;
    	  int r=arr.length-1;
    	  while(l<=r)
    	  {
    		  int mid=l+(r-l)/2;
    		  if(arr[mid]==key)
    			  return mid;
    		  if(arr[l]<arr[mid])
    		  {
    			if(key<arr[mid] && key>=arr[l])
    				r=mid-1;
    			else
    				l=mid+1;
    		  }
    		  else
    		  {
    			 if(key>arr[mid] && key<=arr[r])
    			 l=mid+1;
    			 else
    				 r=mid-1;
    		  }
    	  }
    	  return -1;
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {4,5,6,7,8,9,1,2,3};
      int key=7;
      System.out.println(search(arr,key));
	}

}
