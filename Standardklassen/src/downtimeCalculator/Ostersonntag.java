package downtimeCalculator;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Ostersonntag {

	public static Date getOstersonntag(int year){
		Calendar cal = new GregorianCalendar(year,0,0);
		int jahr = cal.get(Calendar.YEAR); //Setze angegebenes Jahr
		double a = jahr % 19;
	    double b = jahr % 4;
	    double c = jahr % 7;
	    double k = jahr / 100;
	    double p = (8*k + 13) / 25;
	    double q = k / 4;
	    double m = (15 + k - p - q)% 30;
	    double d = (19 * a + m) % 30;
	    double n =  (4 + k - q) % 7;
	    double e = (2*b + 4*c + 6*d + n) % 7;
	    
	
	
}
