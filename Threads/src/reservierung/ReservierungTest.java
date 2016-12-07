package reservierung;

public class ReservierungTest {

	public static void main (String [] args){
		
		ZugInfo db = new ZugInfo();
		Terminal t1 = new Terminal("Terminal 1", db);
		Terminal t2 = new Terminal ("Terminal 2", db);
		
		t1.start();
		t2.start();
	}
}
