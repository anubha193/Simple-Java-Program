package Sorting;

public class Minimum {
          static int min(int arr[],int n)
          {
        	  int min=854775356;
        	  for(int j=2;j<n;j++)
     		 {
     			 min=Math.min(min, arr[j]);
     			 System.out.println(min);
     		 }
             return min  ;
              }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	      int arr[]= {2, 8, 5, 4};
	      System.out.println(min(arr,arr.length));
	}

}
