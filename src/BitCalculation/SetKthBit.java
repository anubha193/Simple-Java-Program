package BitCalculation;

public class SetKthBit {
     static int setBit(int n,int k)
     {
    	 return ((1 << k) | n);
    	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(setBit(10,2));
	}

}
