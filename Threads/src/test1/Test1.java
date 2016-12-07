package test1;

public class Test1 extends Thread {
	public void run(){
		int i = 0;
		
		while(true){
			System.out.println(++i);
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				
			}
		}
	}
	
	public static void main(String [] args){
		Test1 t = new Test1();
		t.start();
		
		while(true){
			try{
				Thread.sleep(500);
				System.out.println("Hallo");
			}catch(InterruptedException e){
				
			}
		}
	}

	
}
