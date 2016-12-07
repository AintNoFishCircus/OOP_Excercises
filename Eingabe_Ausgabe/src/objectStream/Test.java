package objectStream;
import java.io.*;

public class Test {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		DataOutputStream out = new DataOutputStream(new FileOutputStream("konto.txt"));

		Konto k1 = new Konto(123456, 300.80);
		Konto k3 = new Konto(345678, 1500.90);
		Konto k2 = new Konto();
		Konto k4 = new Konto();
		try{
		k1.readAttributes(out);
		k3.readAttributes(out);
		k2.writeAttributes();
		k4.writeAttributes();
		
		System.out.println(k2.getKontonummer());
		System.out.println(k2.getSaldo());
		System.out.println(k4.getKontonummer());
		System.out.println(k4.getSaldo());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		out.close();
	}

}
