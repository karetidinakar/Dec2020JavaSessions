package FileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterConcept {

	public static void main(String[] args) {
		try {
		BufferedWriter fw = new BufferedWriter(new FileWriter("bwf.txt"));
		fw.write("This is my First Line");
		fw.newLine();
		fw.write("This is my Second Line");
		fw.newLine();
		fw.write('D');
		fw.newLine();
		fw.write(new char[]{'S','U','N'});
		fw.flush();
		fw.close();
		
		BufferedWriter fwr = new BufferedWriter((new FileWriter("bwf.txt")));//data is deleted from "bwf.txt"
		fwr.write("This is my New First Line");
		fwr.newLine();
		fwr.write("This is my New Second Line");
		fwr.newLine();
		fwr.write('K');
		fwr.newLine();
		fwr.write(new char[]{'S','U','N'});
		fwr.close();
		
		BufferedWriter fwrr = new BufferedWriter((new BufferedWriter(new FileWriter("bwf.txt"))));//data is deleted from "bwf.txt"
		fwrr.write("This is my appended New Very First Line");
		fwrr.newLine();
		fwrr.write("This is my appended New Very Second Line");
		fwrr.newLine();
		fwrr.write('Y');
		fwrr.newLine();
		fwrr.write(new char[]{'G','O','D'});

		fwrr.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}


