package Day_9;
import java.util.*;
public class List_get {

	public static void main(String[] args) {
		List<Object> l1 = new ArrayList<Object>();
		l1.add(12);
		l1.add("hi");
		l1.add(67);
		l1.add(2,"hello");
		System.out.println(l1);
		List<Object> extra =Arrays.asList("Hello","Good Mornoing","bye");
		l1.addAll(1,extra);
		System.out.println(l1.get(6));
		System.out.println(l1.indexOf(90));

	}

}
