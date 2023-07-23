package heap;

public class HeapifyMethod {
       static void bulidHeap(int []arr,int n)
      {
    	  for(int i=n/2-1;i>=0;i--)
    		  heapify(arr,arr.length,i);
      }
      public static void heapify(int arr[],int n,int i)
      {
    	  int larg=i;
    	  int left=2*i;
    	  int right=2*i+1;
    	  if(left<n && arr[left]>arr[i])
    		larg=left;
    	  if(right<n && arr[right]>arr[i])
    		  larg=right;
    	  if(i!=larg)
    	  {
    		  swap(arr,larg,i);
    		  heapify(arr,larg,i);
    	  }
      }
      static void swap(int arr[],int a,int b)
      {
      	int temp=arr[a];
      arr[a]=arr[b];
      arr[b]=temp;
      }
	public static void main(String[] args) {
      int arr[]= {50,30,40,10,5,20,30,60};
      for(int i=0;i<arr.length;i++)
    	  System.out.print(arr[i]+" ");
      bulidHeap(arr,arr.length);
      System.out.println();
      for(int i=0;i<arr.length;i++)
    	  System.out.print(arr[i]+" ");
    	  

	}

}
