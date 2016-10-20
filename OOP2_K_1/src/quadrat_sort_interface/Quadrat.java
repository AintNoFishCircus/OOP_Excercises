package quadrat_sort_interface;

import java.lang.Comparable; //importiere Interface Comparable
public class Quadrat implements Comparable<Object>{

	protected int seitenlaenge;
	
	public Quadrat(int seitenlaenge){
		this.seitenlaenge = seitenlaenge;
	}
	
	public String toString(){
		return "Quadrat mit Flaeche: " + (seitenlaenge * seitenlaenge);
	}
	
	public int compareTo(Object o){ // implementiere compareTo(Object o)
		if (this.seitenlaenge == ((Quadrat) o).seitenlaenge ){
			return 0;
		}else if(this.seitenlaenge > ((Quadrat) o).seitenlaenge){
			return 1;
		}else{
			return -1;
		}
		
	}
	
	
}
