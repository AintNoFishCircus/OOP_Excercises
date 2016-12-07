package alter;

public class Person {

	private int alter;
	
	public Person (int alter) throws OutOfRangeException{
		if(alter < 0 || alter >150){
			throw new OutOfRangeException("Das angegebene Alter liegt ausserhalb des Intervalls. " + alter
											+ "\n" + "Zulässiges Alter liegt zwischen 0 und 150.");
		}
		this.alter = alter;
	}
}
