package string;

import java.util.ArrayList;
import java.util.List;
public class ParmutationOfNumber{
static  void parmute( List<List<Integer>> al,int[] nums,int ind)
{
    
   if(ind==nums.length)
    {
        List<Integer> temp=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            temp.add(nums[i]);
        }
        al.add(new ArrayList<>(temp));
      
   }
    for(int i=ind;i<nums.length;i++)
    {
        swap(nums,i,ind);
        parmute(al,nums,ind+1);
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
        int nums[]= {1,2,3};
        List<List<Integer>> al=new ArrayList<>();
        parmute(al,nums,0);
        System.out.println(al);
	}

}
