import java.util.*;
public class TowerOfHanoi{
	public static void main(String[] args){
		System.out.println("Towers of Hanoi:");
		solveHanoi(1,3,2,4);
	}
	public static void move1(int source, int dest){
		System.out.printf("Move top ring from %d to %d. \n", source, dest);
	}
	public static void solveHanoi(int start, int dest, int temp, int height){
		if (height == 1){
			move1(start, dest);
		}
		else{
			solveHanoi(start, temp, dest, height-1);
			move1(start, dest);
			solveHanoi(temp, dest, start, height-1);
		}
	}
}