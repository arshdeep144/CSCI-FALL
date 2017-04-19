//Template provided for Lab 05
public class Node{
	private Warrior self;
	private Node next;
	private Node prev;
	
	public Node(Warrior w){
		self = w;
		next = null;
		prev = null;
	}
	
	public void setSelf(Warrior w){
		self = w;
	}
	
	public void setNext(Node n){
		next = n;
	}
	
	public void setPrev(Node p){
		prev = p;
	}
	
	public Warrior getSelf(){
		return self;
	}
	
	public Node getNext(){
		return next;
	}
	
	public Node getPrev(){
		return prev;
	}
}