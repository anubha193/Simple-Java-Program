package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ParmutationOfstring {
	static ArrayList<String> removeDuplicates(ArrayList<String>  al)
	{
		HashSet<String> hs=new HashSet<>();
		
		hs.addAll(al);
		al.clear();
		al.addAll(hs);
		return al;
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
    	 removeDuplicates(al);
    	 Collections.sort(al);
    	 
    	
    	 return al;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="aba";
      String str2=new String("ABC");
      System.out.println(str.contains(str2));
      ArrayList<String> al=new ArrayList<>();
      System.out.println(parmute(str,0,str.length()-1, al));
	}

}
