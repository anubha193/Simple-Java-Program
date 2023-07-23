package Array1;
import java.util.*;
public class NextGreaterElement1 {
          static int[] solve(int arr[],int n)
          {
        	  int res[]=new int[n];
                int next, i, j;
              for (i = 0; i < n; i++) {
                  next = -1;
                  for (j = i + 1; j < n; j++) {
                      if (arr[i] < arr[j]) {
                          next = arr[j];
                          break;
                      }
                  }
          res[i]=next;
              }
              return res;
          }
          static int[] solvefast(int []arr,int n)
          {
        	  Stack<Integer> dq = new Stack<>();

              int a[] = new int[n];

              for(int i=n-1;i>=0;i--){

                  while(!dq.isEmpty() && dq.peek()<=arr[i]){

                      dq.pop();

                  }

                  if(dq.isEmpty()){

                      a[i] = -1;

                  }

                  else{

                      a[i] = dq.peek();

                  }

                  dq.push(arr[i]);

              }

              return a;
        		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= { 4 , 5 , 2 , 25};
		int temp[]=solvefast(arr,arr.length);
		for(int i=0;i<arr.length;i++)
			System.out.print(temp[i]+" ");

	}

}
