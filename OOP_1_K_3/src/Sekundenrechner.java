
public class Sekundenrechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(berechneSekunden(1));
	}
	public static int berechneSekunden(int tage){
		int stunden = tage * 24;
		int minuten = stunden * 60;
		int sekunden = minuten * 60;
		return sekunden;

	}
}
