package datum;

import java.util.Date;
import java.text.SimpleDateFormat;
public class Datum {
	Date datum = new Date();
	SimpleDateFormat f = new SimpleDateFormat("EEEE dd.MM.yyyy");
	String s = f.format(datum);
	
	public Datum(){
		String s = f.format(datum);	
		System.out.println(s);
	}
	

	public static void main(String [] args){
	
		Datum d = new Datum();
		
	}
	
}


