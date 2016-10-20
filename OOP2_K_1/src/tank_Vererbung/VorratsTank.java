package tank_Vererbung;

public class VorratsTank extends Tank{
	
	public VorratsTank(double fassung, String inhalt){
		super(fassung,inhalt);
	}
	
	public void entnehmen(double menge){
		if (menge <= fuellmenge){
			fuellmenge -= menge;
		}else{
			System.out.println("Tank ist leer!");
		}
	}
	
	public void printStatus(){
		super.printStatus();
	}

}
