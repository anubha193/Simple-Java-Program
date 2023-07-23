package BinarySearchProblem;

public class BinarySearch {
	
	 static int searchin(int arr[],int low,int high,int key)
	 {
		 int mid=(low+high)/2;
		 if(arr[mid]==key)
			 return mid+1;
		 if(key>arr[mid])   
			 searchin(arr,mid+1,high,key);
		return 
		searchin(arr,low,mid-1,key);
	 }
      static int search(int[] arr,int k)
      {
    	  int start=0;
    	  int end=arr.length-1;
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
		 int arr[]= {1,2,3,4,5,6,7,8,9};
	     System.out.println(search(arr,1));
	     System.out.println(searchin(arr,0,arr.length-1,1));
	     
	}

}
