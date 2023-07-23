package Array1;

import java.util.Scanner;

public class ArrayRotation {
       static void rotation(int arr[],int d)
       {
    	 int n=d%arr.length;
    	 reverse(arr,0,arr.length-1);
         reverse(arr,0,arr.length-n-1);
         reverse(arr,arr.length-n,arr.length-1);
         for(int i=0;i<arr.length;i++)
         {
        	 System.out.print(arr[i]+" ");
         }
       }
       static void reverse(int arr[],int start,int end)
       {
    		while(start<end)
    		{
    			int temp=arr[start];
    			arr[start]=arr[end];
    			arr[end]=temp;
    			start++;
    			end--;
    		}
       }
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array=");
        int n=sc.nextInt();
        System.out.println("enter the element of array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("enter to number of rotation");
        int d=sc.nextInt();
        rotation(arr,d);
        
	}

}
