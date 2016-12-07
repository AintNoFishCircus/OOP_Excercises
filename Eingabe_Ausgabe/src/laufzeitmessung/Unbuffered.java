package laufzeitmessung;
import java.io.*;


public class Unbuffered {

	
	private long dauer;
	private long stop;
	
	public long read()throws IOException{
		long start = System.currentTimeMillis();
		FileInputStream in = new FileInputStream("test.txt");
		FileOutputStream out = new FileOutputStream("kopie.txt");
		int c;
		byte[] buffer = new byte[1024];
		//while((c = in.read(buffer))!= -1){
		while(in.read() != -1){
			//out.write(buffer, 0 ,c);
			out.write(1);
		}
		stop = System.currentTimeMillis();
		dauer = (stop - start);
		in.close();
		out.close();
		return dauer;
	}
	
	public static void main (String [] args){
		Unbuffered ub = new Unbuffered();
		try{
			System.out.println("Der Kopiervorgang benötigte " + ub.read() + " Millisekunde(n)");
		}catch(IOException e){
			
		}
	}
}
