package BitCalculation;

public class BinaryToDecimal {
      static int decimal(int arr[])
      {
    	  int decimal=0;
    	  int k=0;
    	  for(int i=arr.length-1;i>=0;i--)
    	  {
    		  if(arr[i]==1)
    			  decimal+=Math.pow(2, k);
    		  k++;
    	  }
    	  return decimal;
      }
	public static void main(String[] args) {
	int arr[]= {1,0,1};
	System.out.print("the decimal is "+decimal(arr));
	}

}
