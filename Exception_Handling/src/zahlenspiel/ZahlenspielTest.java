package zahlenspiel;

import java.util.Scanner;
public class ZahlenspielTest {

	public static void main(String[] args){
		int random = (int) (Math.random()*100);
		Scanner sc = new Scanner(System.in);
		
		int versuche = 0;
		
		System.out.println("Der Computer hat eine Zahl zwischen 1 und 100 gezogen:");
		int eingabe = sc.nextInt();
		while(eingabe != random){
			try{
				versuche++;
				if(eingabe > random){
					
				 throw new IsGreaterThanException(versuche + ". Versuch: " +
						 							"Die gesuchte Zahl ist kleiner.");
				}else{
					throw new IsSmallerThanException(versuche + ". Versuch: " +
 							"Die gesuchte Zahl ist groesser.");
				}
			}catch(GuessException e){
				System.out.println(e.getMessage());
				System.out.print(">");
				eingabe = sc.nextInt();
				
			}
		}
		System.out.println(versuche + ". Versuch: " + " Korrekt die Zahl lautet " + random);
	}
}
