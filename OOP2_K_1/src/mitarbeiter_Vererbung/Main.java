package mitarbeiter_Vererbung;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lehrling m1 = new Lehrling("Lustig", "Peter", 560.);
		Angestellter m2 = new Angestellter("Meyer", "Hans", 1500.);
		Angestellter m3 = new Angestellter("M�ller", "J�rgen", 1500.);
		
		m1.zeigeDaten();
		m1.setPruefungen(2);
		m1.zeigeDaten();
		m2.zeigeDaten();
		m3.zeigeDaten();
		m2.befoerdere();
		m2.erhoeheGehalt(500.);
		m2.zeigeDaten();
	}

}
