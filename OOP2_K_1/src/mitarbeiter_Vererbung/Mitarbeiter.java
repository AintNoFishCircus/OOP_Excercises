package mitarbeiter_Vererbung;

public abstract class Mitarbeiter {
	
	protected String nachname;
	protected String vorname;
	protected double gehalt;
	
	public Mitarbeiter(String nachname, String vorname, double gehalt){
		this.nachname = nachname;
		this.vorname = vorname;
		this.gehalt = gehalt;
		
	}
	
	public void erhoeheGehalt(double betrag){
		gehalt += betrag;
		
	}
	
	public void zeigeDaten(){
		System.out.println("Vorname: " + "\t" + vorname );
		System.out.println("Nachname: " + "\t" + nachname );
		System.out.println("Gehalt: " + "\t" + gehalt );
	}
	
	public abstract void addZulage(double betrag);
	

}
