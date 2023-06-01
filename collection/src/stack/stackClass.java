package stack;

import java.util.Stack;

public class stackClass {

	public static void main(String[] args) {
		
		Stack s1=new Stack<>();
		s1.add(10);s1.push('s');
		s1.add(true); s1.add(2, "Hello");s1.push(3.6);
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		System.out.println(s1.search(10));
		System.out.println(s1.peek());
	}
}
