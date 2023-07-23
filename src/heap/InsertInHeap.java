package heap;

public class InsertInHeap {
//	static void delete(int arr[],int n)
//	{
//		arr[1]=arr[n];
//		n--;
//		int i=1;
//		while(i<n)
//		{
//			int left=2*i;
//			int right=2*i+1;
//			int larg=(left>right)?left:right;
//			if(arr[i]<arr[larg])
//			{
//				swap(arr,i,larg);
//				i=larg;
//			}
//			else
//				return;
//		}
//	}
        static void insert(int[] arr,int n, int val)
        {
        	System.out.println(arr.length);
        	arr[n- 1] = val;
        	int i=arr.length-1;
        	while(i>0)
        	{
        		int parent=(i)/2;
        		if(arr[i]>arr[parent]) {
        			swap(arr,i,parent);
        			i=parent;
        		}
        		else 
        			return ;
        		
        	}
        
        }
        static void swap(int arr[],int a,int b)
        {
        	int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]= {50,30,40,10,5,20,30,0};
         int value=60;
         insert(arr,arr.length,value);
         System.out.println("in order to insert a element we add 0 at last position beacuse we can not increase and descrese the size of array at rum time");
         for(int i=0;i<arr.length;i++)
        	 System.out.print(arr[i]+" ");
         }

}
