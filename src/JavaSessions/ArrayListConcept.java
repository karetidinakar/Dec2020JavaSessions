package JavaSessions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		ar.add(100);
		ar.add(200);
		System.out.println(ar.size());
		ar.add(300);
		ar.add(400);
		ar.add(500);
		ar.add(600);
		ar.add(700);
		ar.add(800);
		ar.add(900);
		ar.add(1000);
		ar.add(1100);
		ar.ensureCapacity(11);
		ar.add(1600);
		System.out.println(ar.size());

		System.out.println(ar);
		System.out.println(ar.get(11));

		String str = new String("moon noon");
		String[] sAr=str.split("");
		String strNew="";
		int count=0;
		for(int i=0;i<sAr.length;i++) {
			if(sAr[i].equals("o")) { 
				count = count+1;
				String tempStr="";
				for(int j=1;j<=count;j++) {
					tempStr= tempStr+"x";
				}
				sAr[i]=tempStr;
			}
			strNew=strNew+sAr[i];
		}
		str = strNew;
		System.out.println(str);
		
	}

}
