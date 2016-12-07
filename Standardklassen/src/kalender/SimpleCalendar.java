package kalender;

import java.util.*;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;

public class SimpleCalendar {

	public static void main(String [] args){
	Calendar cal = new GregorianCalendar(2008, Calendar.NOVEMBER, 16, 0,0,0);
	Calendar cal2 = new GregorianCalendar(2010, Calendar.NOVEMBER, 16, 0,0,0);
	SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd.MMMM.YYYY");
	DecimalFormat df = new DecimalFormat("#0.00");
	long timePassed = cal2.getTimeInMillis() - cal.getTimeInMillis();
	double daysPassed = Math.round((double) timePassed) / (24. * 60. * 60. * 1000.);
	
	if (cal.get(Calendar.YEAR) % 4 == 0 || cal2.get(Calendar.YEAR) % 4 == 0){
		daysPassed += 1.0;
	}

	System.out.println("Tage die vom " + sdf.format(cal.getTime()) + "\n" + 
			"bis zum " + sdf.format(cal2.getTime()) + " vergangen sind: "
			+ df.format(daysPassed) + " Tag(e)");
	}
	
}
