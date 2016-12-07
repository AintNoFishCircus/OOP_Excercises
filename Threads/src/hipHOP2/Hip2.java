package hipHOP2;

public class Hip2 implements Runnable {
	public void run(){ 
		//verpackt den im Rumpf stehenden 
		//Code in einen ausfuehrbaren Thread
		while(true){
			try{
				Thread.sleep(100);
				System.out.print("Hip");
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void main (String [] args){
		Hip2 h = new Hip2();
		Thread t = new Thread(h);
		t.start();
		
		while(true){
			try{
				Thread.sleep(300);
				System.out.println("HOP");
			}catch(InterruptedException e ){
				e.printStackTrace();
			}
		}
	}
}


