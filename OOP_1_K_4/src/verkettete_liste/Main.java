package verkettete_liste;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l = new List();
		l.init();
		
		l.add(4);
		l.add(5);
		
		System.out.println(l.showNumber());
		l.iterate();
		System.out.println(l.showNumber());
		l.iterate();
		System.out.println(l.showNumber());

	}

}
