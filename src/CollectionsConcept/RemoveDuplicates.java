package CollectionsConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 1, 1, 3, 22, 3, 4, 22, 55, 44, 3, 4, 10, 20, 30, 3, 6));

		List<Integer> alUnique = al.stream().distinct().collect(Collectors.toList());
		System.out.println(alUnique);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 1, 1, 3, 22, 3, 4, 22, 55, 44, 3, 4, 10, 20, 30, 3, 6));
		
		LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>(al2);
		System.out.println(lh);
		
		
	}

}
