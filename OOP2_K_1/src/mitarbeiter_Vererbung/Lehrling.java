package mitarbeiter_Vererbung;

public class Lehrling extends Mitarbeiter {
	
	private int abgelegtePruefungen = 0;
	
	public Lehrling(String nachname, String vorname, double gehalt){
		super(nachname,vorname,gehalt);
	}
	
	public void setPruefungen(int n){
		abgelegtePruefungen += n;
	}
	
	public void zeigeDaten(){
		super.zeigeDaten();
		System.out.println("abgel. Pruef.: " + abgelegtePruefungen);	
	}
	
	public void addZulage(double betrag){
		if (abgelegtePruefungen > 3){
			super.erhoeheGehalt(betrag);
		}
	}

}
