package readFile;
import java.io.*;

public class Test {
	
	public static void main (String [] args) throws FileNotFoundException{
		
		FileTest f = new FileTest("eingabe.txt");
		
		try{
			f.open();
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
	}

}
