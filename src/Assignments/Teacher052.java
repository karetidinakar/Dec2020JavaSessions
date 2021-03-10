package Assignments;

public class Teacher052 {
	public String[] getCollegeFacultyFinalList(String collegeName) {
		System.out.println("college name is: " + collegeName);
		String facultyList[] = new String[3];
		switch (collegeName) {
		case "MANIT":
			facultyList[0] = "Nidhi";
			facultyList[1] = "Pooja";
			facultyList[2] = "Neha";
			break;
		case "TRUBA":
			facultyList[0] = "Shraddha";
			facultyList[1] = "Kethy";
			facultyList[2] = "Amanda";
			break;
		case "GEC":
			facultyList[0] = "Kate";
			facultyList[1] = "Anna";
			facultyList[2] = "PoojaH";
			break;
		default:
			System.out.println("College name is not found...");
			break;

		}
		return facultyList;

	}

	public static void main(String[] args) {
		Teacher052 t1 = new Teacher052();
		String[] TrubaList = t1.getCollegeFacultyFinalList("TRUBA");
		for (int i = 0; i < TrubaList.length; i++) {
			System.out.println(TrubaList[i]);
		}
	}
}
