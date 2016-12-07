package vector;

public class Test {

	public static void main (String [] args){
		Artikelliste list = new Artikelliste();
		
		
		list.add("Staubsauger", 129.99);
		list.add("Beutel", 7.99);
		list.add("Mixer", 100.00);
		
		list.gibListeAus();
		list.erhoehePreis(10);
		list.gibListeAus();
		
	}
}
