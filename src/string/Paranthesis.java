package string;

import java.util.Stack;

public class Paranthesis {
     static boolean matching(String str)
     {
    	 Stack<Character> st=new Stack<>();
    	 for(int i=0;i<str.length();i++)
         {
	     char ch=str.charAt(i);
	     if(isOpening(ch))
	     {
	    	 st.push(ch);
	     }
	     else
	     {
	    	if(st.isEmpty())
	    		return false;
	    	else if(!isMatching(st.peek(),ch))
	    		return false;
	    	else 
	    		st.pop();
	     }
         }
    	 return st.isEmpty();
    	 
     }
     static boolean isOpening(char ch)
     {
    	 return (ch=='(' || ch=='{' ||ch=='[');
     }
     static boolean isMatching(char a,char b)
     {
    	 return ((a=='(' && b==')')||(a=='{' && b=='}')||a=='[' && b==']');
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(matching("{([])}"))
       System.out.println("balenced");
		else
			System.out.println("not balenced");
	}

}
