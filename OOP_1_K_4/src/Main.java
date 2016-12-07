import verkettete_liste.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l = new List();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		for (int i = 0; i < 10; i++){
			System.out.println(l.showNumber());
			l.iterate();
		}
	}

}
