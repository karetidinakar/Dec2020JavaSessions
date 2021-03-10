package Assignments;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.tree.TreeNode;

public class Test {

	public static void main(String[] args) {
		String range = "Welcome to Naveen Automation Labs ! ";
		//for the fifth occurrence 
		System.out.println(range.indexOf('e'));
		System.out.println(range.indexOf('e',range.indexOf('e')+1));
		System.out.println((range.indexOf('e',range.indexOf('e',range.indexOf('e')+1)+1)));
		System.out.println((range.indexOf('e',range.indexOf('e',range.indexOf('e',range.indexOf('e')+1)+1)+1)));
		System.out.println(range.indexOf('e',(range.indexOf('e',range.indexOf('e',range.indexOf('e',range.indexOf('e')+1)+1)+1)+1)));
		
		
		String tr = "your transaction id is: 12345 and reference id is: 34567";

		//System.out.println(tr.replaceAll("[^0-9]", ""));
		Pattern  p = Pattern.compile("[0-9]");
		//Pattern  p = Pattern.compile("\\d+");
		Matcher m  = p.matcher(tr);
		while(m.find())
		{		
		System.out.print(m.group());
		}
		
//		Stack<TreeNode> s = new Stack<>();
		int[][] aaa = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		System.out.println(aaa.length);
		
		 //Try to concat "Hello Selenium" with a character 't'.
		
		//Solution1:
		String s1 = String.valueOf('t');
		System.out.println("Hello Selenium".concat(s1));
		
		//Solution2:
		String s2 = Character.toString('t');
		System.out.println("Hello Selenium".concat(s2));
		
		//Solution3:
	    char[] ch = new char[1];
	    ch[0]='t';
	    String s3 = new String(ch);
	    System.out.println("Hello Selenium".concat(s3));
	    System.out.println(" ");
	    String ss = "Hello Selenium";
	    for(int i=0;i<ss.length();i++) {
	    	System.out.println(ss.charAt(i));
	    }
	    
	    
	    

	}

}
