package ArrayList;

import java.util.ArrayList;

public class Test {

	
	public static void main(String[] args) {
		ArrayList a1=new ArrayList<>();
		a1.add(10);	a1.add("Hello");
		a1.add('s'); a1.add(true);
		a1.add(2, 'b');
		
		System.out.println(a1);
		
		ArrayList a2=new ArrayList<>();
		a2.addAll(a1);
		System.out.println(a2);
		a2.addAll(2, a2);
		System.out.println(a2);
		
		a1.size();
		System.out.println(a1.indexOf("Hello"));
		a1.clear();
		System.out.println(a1);
		
		ArrayList<Integer> a3=new ArrayList<>();
		a3.add(1);a3.add(3);
		System.out.println(a3);
		
	}
	
}
