package stringAndStringBuffer;

public class StringMethod {
	
	public static void main(String[] args) {
		String s="hello";
		String s1="HELLO";
		String s2="";
		String s3=" ";
		System.out.println(s.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s.concat(s1));
		System.out.println(s.contains("llo"));
		System.out.println(s.indexOf('l'));
		System.out.println(s.lastIndexOf('l'));
		System.out.println(s.substring(1));
		System.out.println(s.substring(1, 4));
		System.out.println(s.length());
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s3.isEmpty());
	}
	
}
