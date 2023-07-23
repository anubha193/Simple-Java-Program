package BitCalculation;

public class PowerOfTwo {
     static boolean two(int n)
     {
    	 if(n==0)
    	        return false;
    	        if((n&(n-1))==0)
    	        return true;
    	        return false;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         if(two(98))
        	 System.out.println("YES");
         else
        	 System.out.println("NO");
	}

}
