package RegularExpresions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternQuantifier {
     //[0|91]--"0" or "91" match
	//{9}--9 times
	//[7-9]--any number between and including 7and 9
	//[^a-z]--not of any a-z
	public static void main(String[] args) {
	//Success: You have added MacBook Pro to your shopping cart!
		//Below special character or character followed by character or space  followed by single special character
		//"[\\W\\w]" this part will give "Success: You have added MacBook Pro to your shopping cart! %"
		
		//Pattern p = Pattern.compile("[\\w\\s]+[\\W]");
		//Pattern p = Pattern.compile("[\\W\\w]+[\\w\\s]+[\\W]");
		
		//Below //character should be followed by special character then character or space  followed by single special character
		//"[\\w]+[\\W]"  this part will give "Success:"
		//"[\\w\\s]+[\\W]" this part will give " You have added MacBook Pro to your shopping cart!"
		Pattern p = Pattern.compile("[\\w]+[\\W][\\w\\s]+[\\W]"); 
		//sucess:([\\w]+[\\W ])
		//followed by "you followed by space","have followed by space"([\\w\\s]+)--9times 
		//followed by single special character !([\\W])
		Matcher m=p.matcher("Success: You have added MacBook Pro to your shopping cart! %");
		while(m.find()) {
			System.out.println(m.group());
		}

	}

}
