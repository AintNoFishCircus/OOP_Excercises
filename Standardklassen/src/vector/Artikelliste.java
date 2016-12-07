package vector;

import java.util.Vector;
import java.util.Iterator;
import java.util.List;
import java.text.DecimalFormat;

public class Artikelliste {

	List<Artikel> artikelliste = new Vector<Artikel>();
	DecimalFormat f = new DecimalFormat("#0.00");
	
	public Artikelliste(){
		
	}
	
	public void add(String bezeichnung, double preis){
		
		artikelliste.add(new Artikel(bezeichnung, preis));
	}
	
	public void erhoehePreis(int prozent){
		for(int i = 0; i < artikelliste.size(); i++){
			Artikel a = artikelliste.get(i);
			a.setPreis(a.getPreis() * ( (double)prozent /100 + 1));
		}
	}
	
	
	
	public void gibListeAus(){
		Iterator<Artikel> it = artikelliste.iterator();
		while(it.hasNext()){
			Artikel a = (Artikel)it.next();
			System.out.println(a.getBezeichnung() + ", " + f.format(a.getPreis()) + " €");
			
		}
	
	}
}
