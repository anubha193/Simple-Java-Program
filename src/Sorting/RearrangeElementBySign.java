package Sorting;

public class RearrangeElementBySign {
	static void rearrange(int[] arr,int n)
	{
	     int pos=0;
	     int neg=1;
	     int res[]=new int[n];
	     for(int i=0;i<n;i++)
	     {
	    	 if(arr[i]>0) {
	    		 res[pos]=arr[i];
	    	 pos+=2;
	    	 }
	    	 else {
	    		 res[neg]=arr[i];
	    	 neg+=2;
	    	 }
	    	
	     }
	     for(int i=0;i<n;i++)
    		 arr[i]=res[i];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,1,-2,-5,2,-4};
	      rearrange(arr,arr.length);
	      for(int i=0;i<arr.length;i++)
	      {
	    	  System.out.print(arr[i]+" ");
	      }
	}

}
