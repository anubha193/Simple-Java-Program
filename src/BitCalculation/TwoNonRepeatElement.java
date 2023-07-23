package BitCalculation;

import java.util.ArrayList;

public class TwoNonRepeatElement {
       static ArrayList<Integer> repeat(int nums[])
       {
    	   int sum=0;
           for(int i=0;i<nums.length;i++)
           {
               sum^=nums[i];
           }
           int pos=(sum&(~(sum-1)));
           int a=0;
           int b=0;
           for(int i=0;i<nums.length;i++)
           {
               if((pos&nums[i])>0)
               a=a^nums[i];
               else
               b=b^nums[i];
           }
           ArrayList<Integer> arr=new ArrayList<>();
           if(a>b)
           {
               arr.add(b);
               arr.add(a);
           }
           else
           {
        	   arr.add(a);
               arr.add(b);
           }
           return arr;
       }
	public static void main(String[] args) {
	int nums[]= {2, 1, 3, 2};
	System.out.println(repeat(nums));
	}

}
