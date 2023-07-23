package Array1;

import java.util.HashSet;

public class ArraySubset {
        static String subset(int a1[],int a2[],int n,int m)
        {
        	HashSet<Integer> hs= new HashSet<>();
            for(int i=0;i<n;i++)
            {
                hs.add(a1[i]);
            }
            for(int i=0;i<m;i++)
            {
                if(hs.contains(a2[i]))
                continue;
                return "NO";
            }
            return "YES";
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {11, 1, 13, 21, 3, 7};
       int arr2[]= {11, 3, 7, 66};
       System.out.println(subset(arr,arr2,arr.length,arr2.length));
	}

}
