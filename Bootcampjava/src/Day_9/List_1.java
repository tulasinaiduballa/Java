package Day_9;
import java.util.*;
public class List_1 {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(65);
		l1.add(8);
		l1.add(4);
		List<Integer> l2 = new ArrayList<Integer>(l1);
		l2.add(95);
		l2.add(54);
		l2.add(76);
		l2.add(23);
		l2.add(42);
		System.out.println(l2);

	}

}
