package inheritance;

public class studentDriver {
	public static void main(String[] args) {
		student s1=new student("RAM",1234);
		System.out.println(s1.name);
		System.out.println(s1.id);
		System.out.println(".............");
		
		student s2=s1;
		System.out.println(s2.name);
		System.out.println(s2.id);
		System.out.println(".............");
		
		
	}
}
