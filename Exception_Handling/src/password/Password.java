package password;

import java.util.Scanner;
public class Password {

	public static void main (String [] args)throws PasswordException{
		Scanner sc = new Scanner(System.in);
		String password;
		password = sc.nextLine();
		int anz = 0;
		
		while(password != "passwort" && anz != 3){
		anz++;
		try{
			try{
				if(!password.equals("passwort")){
					throw new PasswordException("Passwort ist nicht korrekt." + "\n"
												+ (3-anz) + " Versuch(e) verbleibend");
				}
				System.out.println("Anwendung wird gestartet");
			}catch (PasswordException e){
				if(anz == 3){
					throw e;
				}
			 System.out.println(e.getMessage());
			 System.out.println("Bitte das Passwort eingeben:");
			 password = sc.nextLine();
			
			}//Innere try catch Anweisung
			
		}catch(PasswordException e){
			
			System.out.println("Login gescheitert");
		}
		}
		
	}
}
