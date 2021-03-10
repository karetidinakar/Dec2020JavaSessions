package JavaSessions;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ForLoopFirstRecursiveElement {

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 3, 2, 5, 5, 6 };
		
		outerLoop:
		for (int i = 1; i < input.length; i++) {
			for (int j = i ; j >0; j--) {
				if (input[j-1] == input[i]) {		
					System.out.println(input[i]);
					break outerLoop;
				}

			}

		}
		

	}

}
