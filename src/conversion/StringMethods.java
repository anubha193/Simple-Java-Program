package conversion;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="Hello";//crate object in string constant pool;
       String str2="Hello";// create object in both heap area and scp
       String str3=new String("Hello");
       System.out.println(str==str2); //==equals methods used for refrence comparision
                                      //if they are point the same object or not
       System.out.println(str==str3);
     
	}

}
