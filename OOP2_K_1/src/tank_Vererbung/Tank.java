package tank_Vererbung;

public abstract class Tank {

	double fassungsvermoegen;
	String inhalt;
	double fuellmenge;
	
	public Tank(double fassung, String inhalt){
		fassungsvermoegen = fassung;
		this.inhalt = inhalt;
		fuellmenge = 0;
	}
	public void printStatus(){
		System.out.println("Inhalt: " + inhalt);
		System.out.println("Max. Menge: " + fassungsvermoegen);
		System.out.println("F�llung: " + fuellmenge);
	}
	
}
