package monate;

public class MonatTest {

	public static void main(String[] args) throws MonatAusnahme {
		// TODO Auto-generated method stub

		Monat monatsliste [] = {new Monat(1),
		new Monat(3),
		new Monat(7),
		 new Monat(13)};
		
		for (int i = 0; i < monatsliste.length; i++){
			System.out.println(monatsliste[i].getMonatsname());
			
		}
	}

}
