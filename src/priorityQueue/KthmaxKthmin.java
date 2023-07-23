package priorityQueue;

import java.util.*;

public class KthmaxKthmin {
     static int maximum(int[] arr ,int k)
     {
    	PriorityQueue<Integer> pq=new PriorityQueue<>();
    	for(int i=0;i<k;i++)
    		pq.add(arr[i]);
    	for(int i=k;i<arr.length;i++)
    	{
    		if(arr[i]>pq.peek())
    		{
    			pq.poll();
    			pq.add(arr[i]);
    		}
    	}
    	return pq.peek();
     }
     static int minimum(int arr[],int k)
     {
    	 PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
     	for(int i=0;i<k;i++)
     		pq.add(arr[i]);
     	for(int i=k;i<arr.length;i++)
     	{
     		if(arr[i]<pq.peek())
     		{
     			pq.poll();
     			pq.add(arr[i]);
     		}
     	}
     	return pq.peek(); 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 12, 11, 13, 5, 6, 7 };
	        int N = arr.length;
	        
	        System.out.println(maximum(arr,3));
	        System.out.println(minimum(arr,3));

	}

}
