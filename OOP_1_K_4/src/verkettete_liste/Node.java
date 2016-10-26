package verkettete_liste;

public class Node {

	private int number;
	private Node next;
	
	public Node(int number){
		setNumber(number);
	}
	
	public int getNumber(){
		return number;
	}
	
	public void setNumber(int number){
		this.number = number;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setNext(Node n){
		this.next = n;
	}
}
