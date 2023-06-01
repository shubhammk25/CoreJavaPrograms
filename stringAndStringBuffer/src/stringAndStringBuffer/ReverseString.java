package stringAndStringBuffer;

public class ReverseString {

	public static void main(String[] args) {
		String s="hello",dummy=" ";
		char ch;
		for (int i = 0; i < s.length(); i++) {
			ch=s.charAt(i);
			dummy=ch+dummy;
		}
		System.out.println("Original String : "+s);
		System.out.println("Reversed String : "+dummy);
	}
}
