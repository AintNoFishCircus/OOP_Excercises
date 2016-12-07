package scanner;


import java.io.*;

public class Tastatur {
	
	public Tastatur(){
		
	}
	public static String read() throws IOException{
		System.out.print("> ");
		
		String s = "";
		try{
		while(true){ //Solange die Schleife true zurückgibt (Endlosschleife)
			char c = (char) System.in.read();
			if (c == '.')
				break;
			s+=c;
		}
		
		
		}catch (IOException e){
			System.out.println(e.getMessage());
		}
		
		return s;
	}
	

}
