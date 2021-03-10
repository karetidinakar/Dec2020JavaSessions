package Assignments;

import java.util.Scanner;

public class ConditionalAssignment {

	public static void main(String[] args) {
		
		double i=25.11;
		int j=78;
		int k=87;
		double l=91.90;
		
		if(i>j && i>k && i>l) {
			System.out.println("The greatest: "+i);
		}else if(j>k && j>l) {
			System.out.println("The greatest: "+j);
		}else if(k>l) {
			System.out.println("The greatest: "+k);
		}else {
			System.out.println("The greatest: "+l);
		}

		System.out.println("");
		
		/*
		 * int x=35; int y=-11; if(x>=0) { System.out.println("x is Positive Number");
		 * }else { System.out.println("x is Negative Number"); }
		 * 
		 * if(y>=0) { System.out.println("y is Positive Number"); }else {
		 * System.out.println("y is Negative Number"); }
		 */
		
		System.out.println("");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number: ");
		if(input.nextInt()>=0) {
			System.out.println("input is Positive Number");
		}else {
			System.out.println("input is Negative Number");
		}
		

	}

}
