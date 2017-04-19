import java.util.Random;
/**
*This class inserts a warrior into a doubly linked list 
*and then sorts the linked list while keeping a count of all assignments
*@author Arshdeep Benipal
*@since October 24 2016
**/

public class ComparisonDriver{
	/**
	*This is the main method which makes the program run
	*@param args unused
	*@return nothing
	**/
	public static void main(String[] args){
		SortedDoublyLinkedList list = new SortedDoublyLinkedList();
		SortedArray array = new SortedArray();

		//insert 100 new elements int both lists (randomly generated)
		for (int i = 0; i < 100; i++){
			Warrior newWarrior = new Warrior("Generic", genStat(50),genStat(50),genStat(200));
			list.insert(newWarrior);
			array.insert(newWarrior);
		}
		// compare the number of assignment operations:
		System.out.println("Linked List assignmentCount: " + 
							list.assignmentCount);
		System.out.println("Sorted Array assignmentCount: " +
							array.assignmentCount);
	}
	/**
	*This creates random stats for the Warrior
	*@param int the highest that stat could be
	*@return int the newly randomly generated stat
	**/
	public static int genStat(int max){
		// randomly choose an integer between 1 and max
		Random rand = new Random();
		return rand.nextInt(max) + 1;
	}
}