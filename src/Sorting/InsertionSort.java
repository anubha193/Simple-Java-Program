package Sorting;

public class InsertionSort {
	 public static void insertionSort(int arr[], int n)
	  {
	      //code here
	     
	      for(int i=1;i<n;i++){
	            int temp=arr[i];
	            		int j=i-1;
	            for(;j>=0;j--)
	            {
	            	if(temp <arr[j])
	            		arr[j+1]=arr[j];
	            	else
	            		break;
	            }
	           arr[j+1]=temp;
	        }
	  }
	public static void main(String[] args) {
		int arr[]= {7,6,5,3,3,2,1};
		insertionSort(arr,arr.length);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}

}
