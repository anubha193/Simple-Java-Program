package Array1;

public class EqualSum {
          static boolean equal(int arr[],int n)
          {
        	  int sum=0;
        	  int curr=0;
        	  for(int i=0;i<n;i++)
        	  {
        		  sum+=arr[i];
        	  }
        	  for(int i=0;i<n;i++)
        	  {
        		  curr+=arr[i];
        		  if(curr==sum)
        			  return true;
        		  sum-=arr[i];
        	  }
        	  return false;
          }
	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 3};
		if(equal(arr,arr.length))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
