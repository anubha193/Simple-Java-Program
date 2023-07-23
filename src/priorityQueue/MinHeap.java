package priorityQueue;

import java.util.PriorityQueue;

public class MinHeap {
          static int[] maximum(int[] arr,int k,int n)
          {
        	  
          	 PriorityQueue<Integer> pq = new PriorityQueue<>();
             int[] ans = new int[n];
             
             for(int i=0;i<k;i++) {
                 pq.add(arr[i]);
                 
                 ans[i] = pq.size() == k ? pq.peek() : -1;
             }
             for(int i=k;i<n;i++) {
                 if(arr[i] > pq.peek()) {
                     pq.poll();
                     pq.add(arr[i]);
                 }
                 ans[i] = pq.peek();
             }
             return ans;
          }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 12, 11, 13, 5, 6, 7 };
	        int N = arr.length;
	        int temp[]=maximum(arr,4,arr.length);
	        for(int i=0;i<temp.length;i++)
	        	System.out.print(temp[i]+" ");
	}

}
