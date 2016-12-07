package reservierung;

public class ZugInfo{
	private final int PLAETZE = 100;
	private int platz = 0;
	private int frei = PLAETZE;
	
	
	public ZugInfo(){
		
	}
	public synchronized int nochFrei(){
		
		try{
			Thread.sleep(100);
			
		}catch(InterruptedException e){
			
		}
		
		if (platz < PLAETZE){
			frei--;
			++platz;
			System.out.println("Noch " + frei + " Pl�tze verf�gbar.");
			return platz;
		}else{
			System.out.println("Keine Pl�tze mehr frei.");
			return -1;
		}
	}
		
	

}