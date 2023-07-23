package string;

public class StringMatching {
	static boolean searchPattern(String str, String pat)
	{
	    // your code here
	    int m=str.length();
	    int n=pat.length();
	    int j=0;
	    for(int i=0;i<=m-n;i++)
	    {
	        for(;j<n;j++)
	        {
	            if(str.charAt(i+j)!=pat.charAt(j))
	            break;
	        }
	        if(j==n)
	        return true;
	    }
	    return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        if(searchPattern("i love my life","file"))
        	System.out.println("present");
        else
        	System.out.println("Not Present");
        	
	}

}
