package CollectionsConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListCol {

	public static void main(String[] args) {
		ArrayList<String> c = new ArrayList<>();
		c.add("A");
//		c.add(8, "Aa");
		c.add("B");
		c.add("C");
		c.add("D");
		c.add("E");
//		System.out.println(c);

		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 3, 6));

		ArrayList<Integer> al1 = (ArrayList<Integer>) al.clone();
		System.out.println(al1);

		ArrayList<String> aStr = new ArrayList<String>(
				Arrays.asList("tom", "Sally", "Hond", "Kinetic", "Hardy", "tom"));
		aStr.retainAll(Collections.singleton("tom"));
		System.out.println(aStr);

		int[] iArr = new int[] { 0, 1, 2 };
		System.out.println(Arrays.toString(iArr));
	}

}
