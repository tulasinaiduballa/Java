package Day_9;
import java.util.*;
public class Stack_1 {

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack <Integer>();
		s1.push(56);
		s1.push(89);
		s1.push(90);
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1.pop());
	}

}
