package Array1;

import java.util.HashMap;

public class Matrix {
	public static void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
      HashMap<Integer,Boolean> hm1=new HashMap<>();
       HashMap<Integer,Boolean> hm2=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    hm1.put(i,true);
                    hm2.put(j,true);
                }
            }
        }
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(hm1.containsKey(i) || hm2.containsKey(j))
                   matrix[i][j]=0;
            }
        }
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<m;j++)
             {
                 System.out.print(matrix[i][j]+" ");
             }
             System.out.println();
         }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,1},{1 ,0}};
		setZeroes(arr);
		

	}

}
