package recursion;
import java.util.Stack;

public class StackUsage {
	public static void main(String[] args) {
		Stack s=new Stack();//creating empty stack
		s.push(10);
		s.push(15);
		s.push(30);
		s.push(20);
		s.push(5);
		System.out.println("iniatail stack : "+s);
		//use pop() method to remove elements
		System.out.println("popped : "+s.pop());
		System.out.println("popped : "+s.pop());
		//displaying the stack after pop operation
		System.out.println("stack after popped : "+s);
		//use peek() method to look top elements
		System.out.println("top element : "+s.peek());
		//to check if this stack is empty use empty()
		System.out.println("Is empty : "+s.empty());
		//to check for the position of an element
		System.out.println("15 : "+s.search(15));
		//display -1 if element does not exists
		System.out.println("20 : "+s.search(20));
	}
	

}
