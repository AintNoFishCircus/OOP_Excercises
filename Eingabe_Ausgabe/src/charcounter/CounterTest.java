package charcounter;
import java.io.IOException;

public class CounterTest {
	
	public static void main (String [] args) throws IOException{
		
		Counter c = new Counter();
		System.out.println(c.count("test.txt")+ " Zeichen");
	}
	
}
