package readFile;

import java.io.*;

public class FileTest {

	private String file;
	private FileInputStream input;
	
	public FileTest(String file){
		this.file = file;
	}
	
	public void open() throws FileNotFoundException{
		input = new FileInputStream(file);
	}
	
}
