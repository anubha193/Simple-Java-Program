package BinarySearchProblem;

public class BinarySearch2 {
	 static int firstsearch(int[] arr,int k)
	 {
		  int start=0;
    	  int end=arr.length-1;
    	  int ans=0;
    	  while(start<=end)
    	  {
    		  int mid=start+(end-start)/2;
    		  if(arr[mid]==k)
    		  {
    			  ans=mid;
    			  end=mid-1;
    		  }
    		  else if(arr[mid]>k)
    			  end=mid-1;
    		  else
    			  start=mid+1;
    	  }
    	  return ans+1;
	 }
	 static int lastsearch(int[] arr,int k)
	 {
		 int start=0;
   	  int end=arr.length-1;
   	  int ans=0;
   	  while(start<=end)
   	  {
   		  int mid=start+(end-start)/2;
   		  if(arr[mid]==k)
   		  {
   			  ans=mid;
   			  start=mid+1;
   		  }
   		  else if(arr[mid]>k)
   			  end=mid-1;
   		  else
   			  start=mid+1;
   	  }
   	  return ans+1;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,1,2,3,3,4,4,4,4,5,5};
		int m=firstsearch(arr,5);
		int n=lastsearch(arr,5);
	     System.out.println(m);
	     System.out.println(n);
	     System.out.println((n-m)+1);
	}

}
