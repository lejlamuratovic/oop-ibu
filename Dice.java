package lab4;

import java.util.Random; 

public class Dice {
	//The constructor Dice(int numberOfSides) creates a new dice object that has the amount of sides defined by the argument.
	//The method roll tells the result of a roll (which depends on the number of its sides)
	
	private int numberOfSides; 
	private Random random; 
	
	public Dice(int numberOfSides) {
		this.numberOfSides = numberOfSides;
		random = new Random();
	}
	
	 public int roll() {
		 return random.nextInt(numberOfSides) + 1;
   }
}
