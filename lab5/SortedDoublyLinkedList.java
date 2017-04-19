/**
*This class inserts a warrior into a doubly linked list 
*and then sorts the linked list while keeping a count of all assignments
*@author Michael Ferron
*@author Arshdeep Benipal
*@since October 24 2016
**/

public class SortedDoublyLinkedList implements LinkedList {
	Node head;
	Node tail;
	public static int assignmentCount = 0;
	/**
	*This is the constructor for this class
	**/
	public SortedDoublyLinkedList(){
		head = null;
		tail = null;
	}
	
	/**
	*This method inserts the warrior into the linked list and calls the sort
	*@param Warrior the warrior being inserted
	*@return nothing
	**/
	public void insert(Warrior w){
		Node warrior = new Node(w);
		if(head == null){
			head = warrior;
			tail = warrior;
		}
		else if(head == tail){
			tail = warrior;
			head.setNext(tail);
			tail.setPrev(head);
			sort();
		}
		else{
			Node pTail = tail;
			tail.setNext(warrior);
			tail = warrior;
			tail.setPrev(pTail);
			sort();
		}
		assignmentCount++;
	}
	/**
	*This method sorts the linked list by the speed of the warrior
	*@return void nothing
	**/	
	public void sort(){
		boolean isSorted = false;
		int ops;
		while(isSorted == false){
			isSorted = true;
			Node cNode = head;
			while((cNode == null) == false){
				if((cNode.getNext() == null) == true)
					break;
				if(cNode.getSelf().getSpeed() < cNode.getNext().getSelf().getSpeed()){
					Warrior w = cNode.getNext().getSelf();
					assignmentCount++;
					cNode.getNext().setSelf(cNode.getSelf());
					assignmentCount++;
					cNode.setSelf(w);
					assignmentCount++;
					isSorted = false;				}
				cNode = cNode.getNext();
			}
		}
	}
	/**
	*This method allows the linked list to be printed
	*@return String the string version of the linked list
	**/
	public String toString(){
		if(head == null)
			return "Empty list.";
		String listContents = "";
		Node cNode = head;
		while(!(cNode == null)){
			listContents += cNode.getSelf().toString();
			if((cNode.getNext() == null))
				listContents += " ";
			cNode = cNode.getNext();
			if((cNode == null))
				break;
		}
		
		return listContents;
	}
}