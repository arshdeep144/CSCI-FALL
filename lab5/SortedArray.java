/**
*This array creates an array in which the warriors 
*are inserted and sorted
*@author Arshdeep Benipal
*@since October 24 2016
**/
public class SortedArray{
	public static int size = 1;
	private Warrior[] warArray = new Warrior[size];
	public static int assignmentCount = 0;
	/**
	*This method inserts the warrior into the linked list and calls the sort method
	*@param Warrior the warrior being inserted
	*@return nothing
	**/
	public void insert(Warrior warrior){
		if (size == 1){
			warArray[size-1] = warrior;
		}
		else{
			Warrior temp[] = new Warrior[size+1];
			for (int i = 0; i < size-1 ; i++){
				temp[i] = warArray[i];
			}
			temp[size-1] = warrior;

			warArray = temp;
			sort(warArray);
		}
		size++;
		assignmentCount ++;
	}
	/**
	*This method sorts the array
	*@param Warrior[] the warrior array
	*@return nothing
	**/
	public void sort(Warrior[] warr){
		boolean isSorted = true;
		Warrior temp;
		while(isSorted){
			isSorted = false;
			for (int i =0;i < size-1; i++){
				if (warr[i].getSpeed() > warr[i+1].getSpeed()){
					temp = warr[i];
					assignmentCount++;
					warr[i] = warr[i+1];
					assignmentCount++;
					warr[i+1] = temp;
					assignmentCount++;
					isSorted = true;
				}
			}
		}
	}
}