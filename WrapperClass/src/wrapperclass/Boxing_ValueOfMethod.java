package wrapperclass;

public class Boxing_ValueOfMethod {
	// boxing is process of wrapping the primitive datatype into an object
	public static void main(String[] args) {
		
		long l=1000;//primitve datatype
		System.out.println(l);
		Long l1=Long.valueOf(l);//Boxing
		System.out.println(l1);//converted into non-primitive OR Object
		System.out.println("-------------------------------");
		char ch='S';//primitve datatype
		System.out.println(ch);
		Character ch1=Character.valueOf(ch);//Boxing
		System.out.println(ch1);//converted into non-primitive OR Object
		System.out.println("-------------------------------");
		boolean b=true;//primitve datatype
		System.out.println(b);
		Boolean b1=Boolean.valueOf(b);//Boxing
		System.out.println(b1);//converted into non-primitive OR Object
		System.out.println("-------------------------------");
		 
		 // LikeWise we can convert into all 8 primitive-datatype into non-primitive.
		
	}

}
