
/**
 *Author: Chris Turner
 *Date: Oct 13, 2020
 *Description: 
 */

import java.util.Random;

public class DiceTester {
	int sides;
	Random rand = new Random();
	
	public DiceTester(int sides){
		
	this.sides = sides;
	
	}
	
	public String returnRoll(){
		int roll = rand.nextInt(sides)+1;
		String words = "You rolled a " + roll + "!";
		return words;
		
	}
}
	
	
