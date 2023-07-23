package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class parmutett {
	static  void parmute( List<List<Integer>> al,int[] nums,int ind,int k)
	{
	    
	    if(ind==k)
	    {
	        List<Integer> temp=new ArrayList<>();
	        for(int i=0;i<k;i++)
	        {
	            temp.add(nums[i]);
	        }
	        al.add(new ArrayList<>(temp));
	      
	    }
	    for(int i=ind;i<nums.length;i++)
	    {
	        swap(nums,i,ind);
	        parmute(al,nums,ind+1,k);
	         swap(nums,i,ind);
	    }
	    
	}
	static void swap(int arr[],int i,int j)
	{
	    int temp=arr[i];
	    arr[i]=arr[j];
	    arr[j]=temp;
	}	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
	        int nums[]= {1,2,3,4};
	        List<List<Integer>> al=new ArrayList<>();
	        int k=2;
	        parmute(al,nums,0,k);
	        System.out.println(al);
		}


}
