package charcounter;
import java.io.*;

public class Counter {

	private int rowcounter = 1;
	private int charcounter;
	
	public Counter(){
		
	}
	public int count(String file) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader(file));
		int buffer = 0;
		
		while((buffer = in.read())!= -1){
			String s = Integer.toString(buffer);
			if(s.contains(" ")){
				rowcounter++;
			}else if (buffer == 32){
				
			}else{
				charcounter++;
			}
		}
		in.close();
		System.out.println("Die Datei hat " + rowcounter + " Zeilen.");
		return charcounter;
	}
}
