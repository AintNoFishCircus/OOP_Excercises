package vector;

public class Artikel {

	private String bezeichnung;
	private double preis;
	
	public Artikel(String bezeichnung, double preis){
		this.setBezeichnung(bezeichnung);
		this.setPreis(preis);
	}
	
	public String getBezeichnung(){
		return bezeichnung;
	}
	
	public void setBezeichnung(String bezeichnung){
		this.bezeichnung = bezeichnung;
	}
	
	public double getPreis(){
		return preis;
	}
	
	public void setPreis(double preis){
		this.preis = preis;
	}
}
