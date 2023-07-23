package string;

import java.util.Arrays;

public class StringAnagram {
           static boolean compar(String s1,String s2)
           {
        	   char[] ch1=s1.toCharArray();
        	   char[] ch2=s2.toCharArray();
        	   Arrays.sort(ch1);
        	   Arrays.sort(ch2);
        	   if(ch1.length!=ch2.length)
        		   return false;
        	   for(int i=0;i<ch1.length;i++)
        	   {
        		   if(ch1[i]!=ch2[i])
        			   return false;
        	   }
        	   return true;
           }
           static boolean anagram(String s1,String s2)
           {
        	   int arr[]=new int[256];
        	   for(int i=0;i<s1.length();i++)
        		   arr[s1.charAt(i)]++;
        	   for(int i=0;i<s2.length();i++)
        		   arr[s2.charAt(i)]--;
        		if(s1.length()!=s2.length())
        			return false;
        		for(int i=0;i<arr.length;i++)
        		{
        			if(arr[i]!=0)
        				return false;
        		}
        		return true;
           }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compar("hello","olhle"));
		System.out.println(anagram("hello","olhle"));
		

	}

}
