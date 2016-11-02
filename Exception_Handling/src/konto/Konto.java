package konto;

public class Konto {

	public String kunde;
	private double saldo;
	private long kontonummer;
	
	
	public Konto(){
		
	}
	
	public Konto(long kontonummer, double saldo)throws KontoAusnahme{
		setKontonummer(kontonummer);
		if(saldo < 0){
			throw new KontoAusnahme("Kein negativer Saldo möglich!");
		}
		setSaldo(saldo);
	}
	
	public  long getKontonummer(){
		return kontonummer;
	}
	
	public void setKontonummer(long kontonummer){
		this.kontonummer = kontonummer;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void setSaldo(double saldo) throws KontoAusnahme{
		if(saldo < 0){
			throw new KontoAusnahme("Kein negativer Betrag möglich!");
		}
		this.saldo = saldo;
	}
	
	public boolean zahleEin(double betrag) throws KontoAusnahme{
		boolean isTrue = true;
		if(betrag < 0){
			throw new KontoAusnahme("Keine negative Einzahlung möglich!");
		}
		saldo += betrag;
		
		return isTrue;
	}
	
	public boolean zahleAus(double betrag) throws KontoAusnahme{
		boolean isTrue = true;
		if(betrag < 0){
			throw new KontoAusnahme("Keine negative Auszahlung möglich!");
		}
		if(betrag > saldo){
			throw new KontoAusnahme("Saldo nicht ausreichend");
		}
		saldo -= betrag;
		return isTrue;
	}
	
	public void kontoInfo(){
		System.out.println("Kontonummer:" + "\t" + kontonummer);
		System.out.println("Saldo:" + "\t" + saldo);
	}
}
