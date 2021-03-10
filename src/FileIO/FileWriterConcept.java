package FileIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterConcept {
	

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("fwf.txt");
			fw.write("This is my First Line \n");
			fw.write("This is my Second Line \n");
			fw.write('D'+"\n");
			fw.write(new char[]{'S','U','N'});
			fw.flush();
			fw.close();
			
			FileWriter fwr = new FileWriter("fwf.txt");//data is deleted from "fwf.txt"
			fwr.write("This is my New First Line \n");
			fwr.write("This is my New Second Line \n");
			fwr.write('K'+"\n");
			fwr.write(new char[]{'S','U','N'});
			fwr.close();
			
			FileWriter fwrr = new FileWriter("fwf.txt",true);
			fwrr.write("\n This is my New Very First Line \n");
			fwrr.write("This is my New Very Second Line \n");
			fwrr.write('Y'+"\n");
			fwrr.write(new char[]{'G','O','D'});
			fwrr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
