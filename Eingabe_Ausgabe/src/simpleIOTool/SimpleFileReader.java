package simpleIOTool;
import java.io.FileReader;
import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;


public class SimpleFileReader {

	public static void readFile ()throws IOException{
		BufferedReader in;
		PrintWriter out;
		String file = "test.txt";
		try{
		in = new BufferedReader(new FileReader(file));
		
		out = new PrintWriter(new PrintStream(System.out));
		out.println(">>Reading from " + file + "<<");
		String line;
		
		while((line = in.readLine()) != null){
			out.println(line);
			in.close();
			out.close();
		}
		}catch(IOException e){
			System.out.println(e.getMessage());
		}

	}
	
}