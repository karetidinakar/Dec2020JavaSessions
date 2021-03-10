package CollectionsConcept;
/***
 * annotation Sqnce BS,BT,BC,BM,AM,AC,AT,AS
priority(can be negative)
dependsonmethods(overrrides priority)
invocationcount
enable(default is true) and ignore tests
//Sanity or smoke--launch browser in BT
 */

//ul.navbar-left li
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTreeSetMethods {

	public static void main(String[] args) {
	//1	//7 methods
	SortedSet<String> s = new TreeSet<>();
	//2
	s.comparator();
	//3
	s.first();
	//4
	s.last();
	//5
	s.subSet("","");
	//6
	s.headSet("");
	//7
	s.tailSet("");
	
	NavigableSet<String> n = new TreeSet<>();
	//1  //11 methods
	n.descendingIterator();
	//2
	n.ceiling("");
	//3
	n.descendingSet();
	//4
	n.floor("");
	//5
	n.headSet("", true);
	//6
	n.higher("");
	//7
	n.lower("");
	//8
	n.pollFirst();	
	//9
	n.pollLast();
	//10
	n.tailSet("", true);
	//11
	n.subSet("", true,"", true);
	
	}

}
