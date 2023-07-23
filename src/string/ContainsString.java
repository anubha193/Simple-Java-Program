package string;

import java.util.ArrayList;
import java.util.Collections;

public class ContainsString {
	 public static boolean checkInclusion(String s1, String s2) {
		 if(s1.equals(s2))
	            return true;
	        ArrayList<String> al=new ArrayList<>();
	      
	        parmute(s1,0,s1.length()-1,al);
	         
	          for(int i=0;i<al.size();i++)
	          {
	              if(s2.contains(al.get(i)))
	                  return true;
	          }
	        return false;
	    }
	     static String swap(String str,int i,int j)
	     {
	    	
	        char[] ch=str.toCharArray();
	        char temp=ch[i];
	        ch[i]=ch[j];
	        ch[j]=temp;
	        return new String(ch);
	     }
	    static ArrayList<String> parmute(String str,int l,int r,ArrayList<String> al)
	     {
	    	 
	    	 if(l==r)
	    		 al.add(str);
	    	 for(int i=l;i<=r;i++)
	    	 {
	    		  str=swap(str,l,i);
	    		 parmute(str,l+1,r,al);
	    	     str=swap(str,l,i);
	    	 }
	    	 
	    	 Collections.sort(al);
	    	 
	    	
	    	 return al;
	     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ab";
		String s2="ab";
		System.out.println(checkInclusion(s1,s2));

	}

}
