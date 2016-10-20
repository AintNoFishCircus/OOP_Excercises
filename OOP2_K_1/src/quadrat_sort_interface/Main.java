package quadrat_sort_interface;
public class Main {

	public static void main (String[] args){
		
		Quadrat[] einArray = {new Quadrat(23), new Quadrat(10), new Quadrat(12), new Quadrat(15), new Quadrat(10)};
		
		java.util.Arrays.sort(einArray);
		
		for(int i = 0; i < einArray.length; i++){
			System.out.println(einArray[i]);
		}
	}
}
