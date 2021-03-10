package Assignments;

import java.util.ArrayList;

public class MethodsCheck {

	public ArrayList<String> getCollegeFacultyFinalList(String collegeName){
		System.out.println("college name is: " + collegeName);
		//String facultyList[] = new String[3];
		ArrayList<String> facultyList = new ArrayList<String>();
		switch (collegeName) {
		case "MANIT":
			facultyList.add("Nidhi");
			facultyList.add("Pooja");
			facultyList.add("Neha");
			break;
		case "TRUBA":
			facultyList.add("Shraddha");
			facultyList.add("Kethy");
			facultyList.add("Amanda");
			break;
		case "GEC":
			
			facultyList.add("Kate");
			facultyList.add("Anna");
			facultyList.add("PoojaH");
			break;	
		default:
			System.out.println("College name is not found...");
			break;
			
		}
		return facultyList;
		
	}
public static void main(String[] args) {
	MethodsCheck t1 = new MethodsCheck();
		ArrayList<String> SRMList = t1.getCollegeFacultyFinalList("SRM");
		System.out.println(SRMList);
		
		ArrayList<String> someList = t1.getCollegeFacultyFinalList("GEC");
		System.out.println(someList);
		
		ArrayList<String> TrubaList=t1.getCollegeFacultyFinalList("TRUBA");
		for (int i = 0 ; i <TrubaList.size();i++){
			System.out.println(TrubaList.get(i));
		}
		System.out.println("-----------------");
		
}
}
