package Sorting;

public class MergeSort {
     static void mergesort(int arr[],int l,int r)
     {
    	 if(l<r) {
    	 int mid=(l+r)/2;
    	 mergesort(arr,l,mid);
    	 mergesort(arr,mid+1,r);
    	 merge(arr,l,mid,r);
    	 }
     }
     static void merge(int[] arr,int l,int mid,int r)
     {
    	 int i=l;
    	 int j=mid+1;
    	 int k=l;
    	 int b[]=new int[arr.length];
    	 while(i<=mid && j<=r)
    	 {
    		 if(arr[i]<arr[j])
    		 {
    			b[k]=arr[i]; 
    		i++;
    		 }
    		 else
    		 {
    			b[k]=arr[j];
    			j++;
    		 }
    		 k++;
    	 }
    	 if(i>mid)
    	 {
    		while(j<=r)
    		{
    			b[k]=arr[j];
    			j++;
    			k++;
    		}
    	 }
    	 else
    	 {
    		 while(i<=mid)
    		 {
    		 b[k]=arr[i];
    		 i++;
    		 k++;
    		 }
    	 }
    	for( i=l;i<=r;i++)
    		arr[i]=b[i];
    	 }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int arr[]= {5,5,6,8,3,2,1};
				mergesort(arr,0,arr.length-1);
			      for(int i=0;i<arr.length;i++)
			  		System.out.print(arr[i]+" ");
	}

}
