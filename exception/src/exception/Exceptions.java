package exception;

public class Exceptions {
	
	public static void main(String[] args) {
		System.out.println("MS");
		int a=20,b=0;
		String s1=null;
		int arr[]= {10,30,20,40};
		String s2="Hello";
		int res=a/b;
		System.out.println(res);//arithmatic exception
		System.out.println(s1.length());//null pointer 
		System.out.println(arr[4]);//Array index out of bound
		System.out.println(s2.charAt(5));////String index out of bound
		System.out.println("ME");
	}

}
