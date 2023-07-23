package string;

public class AddBinary {
    static String convert(String a,String b)
    {
    	String ans="";
    	int n=0;
    	if(a.length()>b.length())
    		n=a.length();
    	else
    		n=b.length();
    	for(int i=0;i<n;i++)
    	{
    		char aa=a.charAt(i);
    		char bb=b.charAt(i);
    		if(aa=='0' && bb=='0')
    			ans=ans+"0";
    		else if((aa=='0' && bb=='1') || (aa=='1' && bb=='0'))
    			ans=ans+"1";
    		else
    			ans=ans+"10";
    			
    	}
    	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String a="1010";
         String b="1011";
         System.out.println(convert(a,b));
         HashMap<Integer,Integer> hm=new HashMap<>();
         for(int i:hm.en)
	}

}
