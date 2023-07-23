package Sorting;

import java.util.Arrays;

public class RearrangeArrayAlternately {
        static void rearrange(int[] arr,int n)
        {
        	if(n==1)
                return;
                Arrays.sort(arr);
                int[] nums=new int[n];
                int i=0;
                int j=n-1;
                int m=0;
                while(i<j)
                { 
                    
                    nums[m]=arr[j];
                    nums[m+1]=arr[i];
                    m+=2;
                    i++;
                    j--;
                }
                if(n%2==1)
                nums[m]=arr[j];
                
                for( i=0;i<n;i++)
                {
                    arr[i]=nums[i];
                }
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {1,2,3,4,5,6};
      rearrange(arr,arr.length);
      for(int i=0;i<arr.length;i++)
      {
    	  System.out.print(arr[i]+" ");
      }
	}

}
