package conversion;

public class BinaryToDecimal {
       static int getDecimal(String str,int left,int right)
       {
    	   int decimal=0;
    	   int k=0;


    	  for(int i=right-1;i>=left;i--)
    	  {
    		  if(str.charAt(i)=='1')
    			  decimal+=Math.pow(2,k);
    		  k++;
    	  }
    	  return decimal; 
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        System.out.println(getDecimal("101"));
//        System.out.println(getDecimal("111"));
		String str="001110001000";
       
        for(int i=0;i<=str.length()-4;i+=4)
  	  {
  		System.out.println(getDecimal(str,i,i+4));
  	  }
       
	}

}
