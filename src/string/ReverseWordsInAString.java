package string;

public class ReverseWordsInAString {
	 public static String reverseWords(String s) {
	        String st=s.trim();
	        char[] ch=st.toCharArray();
	        int start=0;
	        int end=0;
	        for(end=0;end<st.length();end++)
	        {
	            if(ch[end]==' '){
	               reverse(ch,start,end-1);
	            start=end+1;
	            }
	        }
	       reverse(ch,start,end-1);
//	       reverse(ch,0,st.length()-1);
	        return new String(ch);
	    }
	    static void reverse(char[] ch,int i,int j)
	    {
	        while(i<j){
	        char temp=ch[i];
	            ch[i]=ch[j];
	        ch[j]=temp;
	        i++;
	        j--;
	    }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch="Let's take LeetCode contest";
		String ch2=reverseWords(ch);
		System.out.println(ch2);
//		String m=ch.replace("boss"," kmina");
//		System.out.println(m);

	}

}
