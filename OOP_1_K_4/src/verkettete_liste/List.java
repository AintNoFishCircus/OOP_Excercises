package verkettete_liste;

public class List {
	public int length;
	private Node head;
	private Node tail;
	private Node iterator;
	
	
	public List(){
		
	}
	
	public Node getHead(){
		return head;
	}
	
	public void setHead(Node head){
		this.head = head;
	}
	
	public Node getTail(){
		return tail;
	}
	
	public void setTail(Node tail){
		this.tail = tail;
	}
	
	public Node getIterator(){
		return iterator;
	}
	
	public void setIterator(Node n){
		iterator = n;
	}
	
	public void init(){
		head = null;
		tail = head;
		iterator = tail;
	
	}
	
	public void add(int number){
		Node n = new Node(number);
		if (head == null){
			head = n;
			head.setNext(n);
			tail = head;
			iterator = tail;
			length = 1;
		}else{
			head.setNext(n);
			n.setNext(tail);
			head = n;
			length += 1;
		}
		
	}
	
	public int showNumber(){
		return iterator.getNumber();
		
	}
	
	public void iterate(){
		if (head != null){
			iterator = iterator.getNext();
		}
	}
	
	

}
