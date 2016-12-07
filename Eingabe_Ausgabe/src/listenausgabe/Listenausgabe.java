package listenausgabe;

import java.io.*;
public class Listenausgabe {

	public static void main(String [] args)throws IOException {
		
		BufferedReader in = new BufferedReader(new FileReader("umsatz.txt"));
		
		PrintWriter out = new PrintWriter(new FileWriter("C:/Users/Patrick Seidel/Documents/OOP_Excercises/Eingabe_Ausgabe/liste.txt"));
		
		out.println("Umsatzliste");
		out.println("=============\n");
		String line;
		double sum = 0;
		while((line = in.readLine()) != null){
			double z = 0;
			try{
				z = Double.parseDouble(line);
				out.println("€ " + z);
				sum += z;
			}catch(NumberFormatException e){
				continue;
			}
		
		}
		out.println();
		out.println("Summe: " + sum);
		in.close();
		out.close();
	}
}
