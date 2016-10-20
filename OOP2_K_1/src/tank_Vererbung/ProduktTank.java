package tank_Vererbung;

public class ProduktTank extends Tank{

	public ProduktTank(double fassung, String inhalt){
		super(fassung, inhalt);
	}
	
	public void printStatus(){
		super.printStatus();
	}
	
	public void befuelle(double menge){
		if (menge <= (fassungsvermoegen - fuellmenge)){
			fuellmenge += menge;
		}else{
			System.out.println("Tank ist voll!");
		}
	}
}
