package Day_9;
import java.util.*;
//import java.math.*;
public class Arrays_1 {

	public static void main(String[] args) {
		int[] arr1 = {67,89,90,77,66,55};
		Arrays.sort(arr1);
		System.out.println(Arrays.stream(arr1).max());
		for(int b1:arr1)
			System.out.println(b1);
		System.out.println();
		
	}

}
