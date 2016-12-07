package downtimeCalculator;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Datum {
	
	private Calendar cal;
	private Date date = new Date();
	private SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd.MM.YYYY");

	public Datum(int year, int month, int day){ //Konstruktor für spezifisches Datum
		cal = new GregorianCalendar(year, month-1, day,0,0,0);
		date = cal.getTime();
	}
	
	public Date getDate(){
		return date;
	}
	
	public boolean isLeapYear(){
		if(cal.get(Calendar.YEAR)% 4 == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public int getHolidays(){
		
	    int jahr = cal.get(Calendar.YEAR); //Setze angegebenes Jahr
		int daysOff = 0;
	    int a = jahr % 19; //Berechnung Ostersonntag
	    int b = jahr % 4;
	    int c = jahr % 7;
	    int monat = 0;
	  
	    int m = (8 * (jahr / 100) + 13) / 25 - 2;
	    int s = jahr / 100 - jahr / 400 - 2;
	    m = (15 + s - m) % 30;
	    int n = (6 + s) % 7;
	  
	    int d = (m + 19 * a) % 30;
	  
	    if (d == 29)
	      d = 28;
	    else if (d == 28 && a >= 11)
	      d = 27;
	  
	    int e = (2 * b + 4 * c + 6 * d + n) % 7;
	  
	    int tag = 21 + d + e + 1;
	  
	    if (tag > 31)
	    {
	      tag = tag % 31;
	      monat = 3;
	    }
	    if (tag <= 31)
	      monat = 2; // Ende der Berechung Ostersonntag
	  
	    GregorianCalendar gc_ostersonntag = new GregorianCalendar(jahr, monat, tag);
	    GregorianCalendar gc_ostermontag = new GregorianCalendar(gc_ostersonntag.get(Calendar.YEAR), gc_ostersonntag.get(Calendar.MONTH), (gc_ostersonntag.get(Calendar.DATE) + 1));
	    GregorianCalendar gc_karfreitag = new GregorianCalendar(gc_ostersonntag.get(Calendar.YEAR), gc_ostersonntag.get(Calendar.MONTH), (gc_ostersonntag.get(Calendar.DATE) - 2));    
	    GregorianCalendar gc_rosenmontag = new GregorianCalendar(gc_ostersonntag.get(Calendar.YEAR), gc_ostersonntag.get(Calendar.MONTH), (gc_ostersonntag.get(Calendar.DATE) - 48));
	    GregorianCalendar gc_christihimmelfahrt = new GregorianCalendar(gc_ostersonntag.get(Calendar.YEAR), gc_ostersonntag.get(Calendar.MONTH), (gc_ostersonntag.get(Calendar.DATE) + 39));
	    GregorianCalendar gc_pfingstsonntag = new GregorianCalendar(gc_ostersonntag.get(Calendar.YEAR), gc_ostersonntag.get(Calendar.MONTH), (gc_ostersonntag.get(Calendar.DATE) + 49));
	    GregorianCalendar gc_pfingstmontag = new GregorianCalendar(gc_ostersonntag.get(Calendar.YEAR), gc_ostersonntag.get(Calendar.MONTH), (gc_ostersonntag.get(Calendar.DATE) + 50));
	    GregorianCalendar gc_frohnleichnahm = new GregorianCalendar(gc_ostersonntag.get(Calendar.YEAR), gc_ostersonntag.get(Calendar.MONTH), (gc_ostersonntag.get(Calendar.DATE) + 60));
	    GregorianCalendar gc_wiedervereinigung = new GregorianCalendar(gc_ostersonntag.get(Calendar.YEAR), 9, 1);
	    GregorianCalendar gc_allerheiligen = new GregorianCalendar(gc_ostersonntag.get(Calendar.YEAR),10,1);
	    GregorianCalendar gc_weihnachten_1 = new GregorianCalendar(gc_ostersonntag.get(Calendar.YEAR), 11, 24);
	    GregorianCalendar gc_weihnachten_2 = new GregorianCalendar(gc_ostersonntag.get(Calendar.YEAR), 11, 25);
	    GregorianCalendar gc_weihnachten_3 = new GregorianCalendar(gc_ostersonntag.get(Calendar.YEAR), 11, 26);
	    GregorianCalendar gc_silvester = new GregorianCalendar(gc_ostersonntag.get(Calendar.YEAR), 11, 31);
	    GregorianCalendar gc_neujahr = new GregorianCalendar(gc_silvester.get(Calendar.YEAR), 0, 1);
		
	    Calendar [] daylist = {gc_ostermontag, gc_karfreitag, gc_christihimmelfahrt,
	    						gc_pfingstsonntag,gc_pfingstmontag,gc_frohnleichnahm,gc_wiedervereinigung,
	    						gc_allerheiligen, gc_weihnachten_2,gc_weihnachten_3,gc_neujahr};
	    
	    for(int i = 0; i < daylist.length; i++){ //Abfrage ob der Feiertag ein Sonntag ist
	    	if(daylist[i].get(Calendar.DAY_OF_WEEK) != 1){
	    		daysOff +=1;
	    	}
	    }
	    
	    System.out.println(gc_pfingstmontag.getTime());

		return daysOff; //Rückgabe Feiertage
		
			
		
	}
		 public boolean isFeiertag()

	  {
	    int jahr = cal.get(Calendar.YEAR);
	  
	    int a = jahr % 19;
	    int b = jahr % 4;
	    int c = jahr % 7;
	    int monat = 0;
	  
	    int m = (8 * (jahr / 100) + 13) / 25 - 2;
	    int s = jahr / 100 - jahr / 400 - 2;
	    m = (15 + s - m) % 30;
	    int n = (6 + s) % 7;
	  
	    int d = (m + 19 * a) % 30;
	  
	    if (d == 29)
	      d = 28;
	    else if (d == 28 && a >= 11)
	      d = 27;
	  
	    int e = (2 * b + 4 * c + 6 * d + n) % 7;
	  
	    int tag = 21 + d + e + 1;
	  
	    if (tag > 31)
	    {
	      tag = tag % 31;
	      monat = 3;
	    }
	    if (tag <= 31)
	      monat = 2;
	  
	    GregorianCalendar gc_ostersonntag = new GregorianCalendar(jahr, monat, tag);
	    GregorianCalendar gc_ostermontag = new GregorianCalendar(gc_ostersonntag.get(Calendar.YEAR), gc_ostersonntag.get(Calendar.MONTH), (gc_ostersonntag.get(Calendar.DATE) + 1));
	    GregorianCalendar gc_karfreitag = new GregorianCalendar(gc_ostersonntag.get(Calendar.YEAR), gc_ostersonntag.get(Calendar.MONTH), (gc_ostersonntag.get(Calendar.DATE) - 2));    
	    GregorianCalendar gc_rosenmontag = new GregorianCalendar(gc_ostersonntag.get(Calendar.YEAR), gc_ostersonntag.get(Calendar.MONTH), (gc_ostersonntag.get(Calendar.DATE) - 48));
	    GregorianCalendar gc_christihimmelfahrt = new GregorianCalendar(gc_ostersonntag.get(Calendar.YEAR), gc_ostersonntag.get(Calendar.MONTH), (gc_ostersonntag.get(Calendar.DATE) + 39));
	    GregorianCalendar gc_pfingstsonntag = new GregorianCalendar(gc_ostersonntag.get(Calendar.YEAR), gc_ostersonntag.get(Calendar.MONTH), (gc_ostersonntag.get(Calendar.DATE) + 49));
	    GregorianCalendar gc_pfingstmontag = new GregorianCalendar(gc_ostersonntag.get(Calendar.YEAR), gc_ostersonntag.get(Calendar.MONTH), (gc_ostersonntag.get(Calendar.DATE) + 50));
	    GregorianCalendar gc_frohnleichnahm = new GregorianCalendar(gc_ostersonntag.get(Calendar.YEAR), gc_ostersonntag.get(Calendar.MONTH), (gc_ostersonntag.get(Calendar.DATE) + 60));
	    GregorianCalendar gc_wiedervereinigung = new GregorianCalendar(gc_ostersonntag.get(Calendar.YEAR), 9, 1);
	    GregorianCalendar gc_weihnachten_1 = new GregorianCalendar(gc_ostersonntag.get(Calendar.YEAR), 11, 24);
	    GregorianCalendar gc_weihnachten_2 = new GregorianCalendar(gc_ostersonntag.get(Calendar.YEAR), 11, 25);
	    GregorianCalendar gc_weihnachten_3 = new GregorianCalendar(gc_ostersonntag.get(Calendar.YEAR), 11, 26);
	    GregorianCalendar gc_silvester = new GregorianCalendar(gc_ostersonntag.get(Calendar.YEAR), 11, 31);
	    GregorianCalendar gc_neujahr = new GregorianCalendar(gc_silvester.get(Calendar.YEAR), 0, 1);

	    if(gc_ostermontag.equals(this) || gc_karfreitag.equals(this) || gc_rosenmontag.equals(this) || gc_christihimmelfahrt.equals(this) || gc_pfingstmontag.equals(this) || gc_frohnleichnahm.equals(this) || gc_weihnachten_1.equals(this) || gc_weihnachten_2.equals(this) || gc_weihnachten_3.equals(this) || gc_silvester.equals(this) || gc_neujahr.equals(this) || gc_wiedervereinigung.equals(this))
	    {
	      return true;
	    }
	    else
	    {
	      return false;
	    }
	  }
		 
	public Date getOstersonntag(){
		int jahr = cal.get(Calendar.YEAR); //Setze angegebenes Jahr
		int a = jahr % 19;
	    int b = jahr % 4;
	    int c = jahr % 7;
	    int monat = 0;
	    
	    int m = (8 * (jahr / 100) + 13) / 25 - 2;
	    int s = jahr / 100 - jahr / 400 - 2;
	    m = (15 + s - m) % 30;
	    int n = (6 + s) % 7;
	    
	    int d = (m + 19 * a) % 30;
	    
	    if ( d == 29 )
	      d = 28;
	    else if (d == 28 && a >= 11)
	      d = 27;
	      
	    int e = (2 * b + 4 * c + 6 * d + n) % 7;
	    
	    int tag = 21 + d + e + 1;
	    
	    if (tag > 31)
	    {
	      tag = tag % 31;
	      monat = 4;
	    }
	    if (tag <= 31)
	      monat = 3;
 // Ende der Berechung Ostersonntag
	  
	    GregorianCalendar gc_ostersonntag = new GregorianCalendar(jahr, monat, tag);
	    
	    Date date = new Date();
	    
	    date = gc_ostersonntag.getTime();
	    
	    return date;
	}
}


	   


