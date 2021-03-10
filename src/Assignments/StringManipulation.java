package Assignments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManipulation {

	public static void main(String[] args) {
		String st3 = "     Hello Everyone    ";
		System.out.println(st3.trim());

		String tr = "your transaction id is: 12345 and reference id is: 34567";

		System.out.println(tr.replaceAll("[^0-9]", ""));
				
		Pattern  p = Pattern.compile("\\d+");
		Matcher m  = p.matcher(tr);
		while(m.find())
		{		
		System.out.println(m.group());
		}
	}

}
