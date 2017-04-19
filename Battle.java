//Author: Arshdeep Benipal
//Student ID: 100591622
//Date: September 19 2016
//Purpose: Lab 1 A battle between two warriors
import java.util.*;

public class Battle{
	public static void main(String[] args){
		//initialize variables
		double kroggAttack = 38.5;
		double kroggDefense = 20.0;
		double kroggHP = 200;
		double bossAttack = 25;
		double bossDefense = 12.5;
		double bossHP = 200;
		int round = 1;

		//loop until someone dies
		while(bossHP > 0 && kroggHP > 0){
			// print round
			System.out.println("Round " + round);
			//tell the user how much damage is done each round
			System.out.println("Krogg does " + (kroggAttack - bossDefense) + " points of damage to Boss");
			System.out.println("Boss does " + (bossAttack - kroggDefense) + " points of damage to Krogg");

			//calculate how much hp is remaining each round and tell user how much hp is remaining
			kroggHP = kroggHP - (bossAttack - kroggDefense);
			bossHP = bossHP - (kroggAttack - bossDefense);
			System.out.println("Boss: " + bossHP);
			System.out.println("Krogg: " + kroggHP);
			round++;
		}
		//Tell user who won
		if(kroggHP <= 0)
			System.out.println("Boss has won. You are not victorious.");
		else
			System.out.println("Krogg has won. You are victorious!");
	}
}