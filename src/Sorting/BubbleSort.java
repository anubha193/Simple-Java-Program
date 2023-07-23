package Sorting;

public class BubbleSort {
      static void bubble(int[] arr,int n)
      {
    	  for(int i=0;i<n-1;i++)
    	  {
    		  for(int j=0;j<n-i-1;j++)
    		  {
    			  if(arr[j]>arr[j+1]) {
    			  int temp=arr[j];
    			  arr[j]=arr[j+1];
    			  arr[j+1]=temp;
    			  }
    		  }
    	  }
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,6,3,1,4,6};
		bubble(arr,arr.length);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}

}
