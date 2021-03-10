package FileIO;

import java.io.File;
import java.io.IOException;

public class FileClassConcept {

	public static void main(String[] args)  {
		
		try {
			System.out.println("newFileCreated");
			boolean newFileCreated = false;
			File file = new File("abc.txt");
			System.out.println(file.exists());
			newFileCreated=file.createNewFile();
			System.out.println(newFileCreated);
			System.out.println(file.exists());
			System.out.println("newDirectoryCreated");
			boolean newDirectoryCreated = false;
			File fileDir = new File("abcDir");
			System.out.println(fileDir.exists());
			newDirectoryCreated = fileDir.mkdir();
			System.out.println(newDirectoryCreated);
			System.out.println(fileDir.exists());
			
			System.out.println("newFileInDirCreated");
			boolean newFileInDirCreated = false;
			File fileInDir = new File("abcDir","cde.txt");
			System.out.println(fileInDir.exists());
			newFileInDirCreated=fileInDir.createNewFile();
			System.out.println(newFileInDirCreated);
			System.out.println(fileInDir.exists());
			
			System.out.println("newDirectoryInDirCreated");
			boolean newDirectoryInDirCreated = false;
			File fileDirInDir = new File(fileDir,"cdeDir");
			System.out.println(fileDirInDir.exists());
			newDirectoryInDirCreated = fileDirInDir.mkdir();
			System.out.println(newDirectoryInDirCreated);
			System.out.println(fileDirInDir.exists());
			
			//Creating File in particular Directory
			System.out.println("newFileMentionedDirectory");
			boolean newFileMentionedDirectory = false;
			File fd= new File("C:\\Users\\Dinakar\\eclipse-workspace\\Dec2020JavaSessions\\abcDir","abcDir.txt");
			System.out.println(fd.exists());
			newFileMentionedDirectory = fd.createNewFile();
			System.out.println(newFileMentionedDirectory);
			System.out.println(fd.exists());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
