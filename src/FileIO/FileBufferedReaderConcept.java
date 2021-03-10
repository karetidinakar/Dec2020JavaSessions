package FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileBufferedReaderConcept {

	public static void main(String[] args) {
		try {
			FileReader br = new FileReader("bwf.txt");
			int i=br.read();
			while(i!=-1) {
				System.out.println((char)i);
				i=br.read();
			}
			br.close();
			System.out.println("How many characters to read");
			FileReader fr = new FileReader("bwf.txt");
			char[] ch = new char[10];
			fr.read(ch);
			for(char c:ch) {
				System.out.println(c);
			}
			fr.close();
			System.out.println("How many Lines to read");
			BufferedReader brr = new BufferedReader(new FileReader("bwf.txt"));
			String line=brr.readLine();
			while(line!=null) {
				System.out.println(line);
				 line=brr.readLine();
			}
			brr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
