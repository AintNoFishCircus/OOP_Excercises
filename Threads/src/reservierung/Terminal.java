package reservierung;

public class Terminal extends Thread {

	private String terminal;
	private ZugInfo zuginfo;
	
	public Terminal(String terminal, ZugInfo zuginfo){
		this.terminal = terminal;
		this.zuginfo = zuginfo;
	}
	
	public void run(){
		for(int i = 0; i < 100; i++){
			System.out.println(terminal+ ": Platz " + zuginfo.nochFrei()
			+ " reseviert.");
		}
	}
	
}
