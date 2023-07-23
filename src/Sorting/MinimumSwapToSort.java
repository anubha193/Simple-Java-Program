package Sorting;

public class MinimumSwapToSort {
     static void minimum(int[] arr)
     {  
    	 int count=0;
    	 for (int i = 0; i < arr.length - 1; i++)  
     {  
         int index = i;  
         for (int j = i + 1; j < arr.length; j++){  
             if (arr[j] < arr[index]){  
                 index = j;//searching for lowest index  
             }  
         }  
         if(arr[index]<arr[i]) {
        	 count++;
         int smallerNumber = arr[index];   
         arr[index] = arr[i];  
         arr[i] = smallerNumber;  
         }
     }  
       System.out.println(count);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {4, 3, 2, 1};
      minimum(arr);
      for(int i=0;i<arr.length;i++)
  		System.out.print(arr[i]+" ");
	}

}
