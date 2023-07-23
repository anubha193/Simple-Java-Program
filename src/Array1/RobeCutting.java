package Array1;

import java.util.ArrayList;
import java.util.Arrays;

public class RobeCutting {
	public static ArrayList<Integer> RopeCutting (int arr[], int n) {
        // Complete the Function
        Arrays.sort(arr);
        ArrayList<Integer> al=new ArrayList<>();
        int cuttinglength=arr[0];
        for(int i=0;i<n;i++)
        {
            if((arr[i]-cuttinglength)>0)
            al.add(n-i);
            cuttinglength=arr[i];
        }
        return al;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5, 1, 1, 2, 3, 5};
		System.out.println(RopeCutting (arr, arr.length));
	}

}
