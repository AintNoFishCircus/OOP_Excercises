package tank_Vererbung;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VorratsTank vT1 = new VorratsTank(200.,"Eisen");
		vT1.printStatus();
		
		ProduktTank pT1 = new ProduktTank(300., "Schrauben");
		pT1.printStatus();
		
		pT1.befuelle(200);
		pT1.befuelle(100);
		pT1.printStatus();
		pT1.befuelle(10);
		vT1.entnehmen(10);
	}

}