package objectStream;
import java.io.*;

public class Konto {

	private int kontonummer;
	private double saldo;
	
	
		
	
	public Konto(){
		
	}
	public Konto(int kontonummer, double saldo){
		this.kontonummer = kontonummer;
		this.saldo = saldo;
	}
	public int getKontonummer(){
		return kontonummer;
	}
	
	public void setKontonummer(int ktoNummer){
		kontonummer = ktoNummer;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	public void readAttributes(DataOutputStream out)throws IOException{
		out.writeInt(this.kontonummer);
		out.writeDouble(this.saldo);
		
		
	}
	
	public void writeAttributes()throws IOException{
			DataInputStream in = new DataInputStream(new FileInputStream("konto.txt"));
			this.kontonummer = in.readInt();
			this.saldo = in.readDouble();
			in.close();
	
	}
	
}
