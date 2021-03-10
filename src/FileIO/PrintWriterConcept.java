package FileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterConcept {

	public static void main(String[] args) {
		try {
//			PrintWriter pw = new PrintWriter(new FileWriter("print.txt"));
//			pw.write(100);
//			pw.print(1111);
//			pw.append('F');
//			pw.close();
			
			PrintWriter pwo = new PrintWriter(new FileWriter("output.txt"));
			BufferedReader br = new BufferedReader((new FileReader("input.txt")));
			String line = br.readLine();
			while(line!=null) {
				boolean available = false;
				BufferedReader bro = new BufferedReader((new FileReader("delete.txt")));
				String target = bro.readLine();
				while(target!=null) {
					if(target.equals(line)) {
						available = true;
						break;
					}
					target = bro.readLine();
				}
				if(available == false) {
					pwo.println(line);
				}
				line = br.readLine();
			}
			br.close();		
			pwo.close();
			
			BufferedReader brr = new BufferedReader((new FileReader("input.txt")));
			BufferedReader brd = new BufferedReader((new FileReader("delete.txt")));
			PrintWriter pwAlt = new PrintWriter(new FileWriter("outputaAlt.txt"));
			String s1=brr.readLine();
			String s2=brd.readLine();
			while(s1!=null && s2!=null) {
				pwAlt.write(s1);
				s1=brr.readLine();
				pwAlt.write(s2);
				s2=brr.readLine();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
