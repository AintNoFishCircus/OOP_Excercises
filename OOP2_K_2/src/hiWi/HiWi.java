package hiWi;

public class HiWi implements StudHilfskraft{

	private String name;
	private double gehalt;
	private int matrikelnummer;
	private int dauer;
	
	public HiWi(){
		
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public double getGehalt(){
		return gehalt;
	}
	
	public void setGehalt(double gehalt){
		this.gehalt = gehalt;
	}
	
	public int getMatrikelNummer(){
		return matrikelnummer;
	}
	
	public void setMatrikelNummer(int matrikelnummer){
		this.matrikelnummer = matrikelnummer;
	}
	
	public int getDauer(){
		return dauer;
	}
	
	public void setDauer(int dauer){
		this.dauer = dauer;
	}
}
