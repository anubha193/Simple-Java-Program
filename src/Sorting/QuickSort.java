package Sorting;

public class QuickSort {
	static void swap(int[] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	 static void quick(int arr[], int low, int high)  {      // code here
	        {
	       if(low >= high) return ;
	       int j=partition(arr , low , high);
	       quick(arr,low,j-1);
	       quick(arr, j+1, high);
	        }
	    }
	 static  int partition (int a[], int low, int high)
	   {
	      int pivot=a[low];
	      int i=low,j=high;
	      while(i<j)
	      {
	          while(i<j && a[i]<=pivot) i++;
	          while(a[j]>pivot) j--;
	          if(i<j) swap(a,i,j);
	      }
	       swap(a,j,low);
	       return j;    
	    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,5,6,8,3,2,1};
		quick(arr,0,arr.length-1);
	      for(int i=0;i<arr.length;i++)
	  		System.out.print(arr[i]+" ");
	}

}
