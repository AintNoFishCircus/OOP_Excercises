package fakultaet;

public class Fakultaet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(berechneFak(6));
	}
	
	public static int berechneFak(int n){
		int fak = n;
		
		if (fak < 0){
			return -1;
		}else if (fak == 0){
			return 1;
		}else{
			
			for(n = n -1; n > 0; n--){
				fak = fak * n ;
			}
		}
		
		return fak;
	}

}
