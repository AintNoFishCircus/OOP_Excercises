package monate;

public class Monat {
	
	private int monat;
	
	public Monat(int monat){
	
		this.monat = monat;
	}
	
	public String getMonatsname() throws MonatAusnahme{
		
		try{
		String s;
		switch(monat){
		case 1:
			s ="Januar";
			break;
		case 2:
			s = "Februar";
			break;
		case 3:
			s ="März";
			break;
		case 4:
			s ="April";
			break;
		case 5:
			s ="Mai";
			break;
		case 6:
			s ="Juni";
			break;
		case 7:
			s ="Juli";
			break;
		case 8:
			s ="August";
			break;
		case 9:
			s ="September";
			break;
		case 10:
			s ="Oktober";
			break;
		case 11:
			s ="November";
			break;
		case 12:
			s = "Dezember";
			break;
		default:
			throw new MonatAusnahme("Ungültiger Monat " + monat);
			
		}
		return s;
		}catch(MonatAusnahme m){
			System.out.println(m.getMessage());
			 return null;
		}
	}

}
