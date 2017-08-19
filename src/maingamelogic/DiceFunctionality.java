package maingamelogic;

import java.util.Random;

public class DiceFunctionality {

	int diceOne;
	int diceTwo;
	int firstPoint;
	int secondPoint;
	Random dice = new Random();
	
	public void rollDice() {
		diceOne = dice.nextInt(7);
		diceTwo = dice.nextInt(7); 
	}			
	
	public void secondRoll() {
		rollDice();
		secondPoint = diceOne + diceTwo;
	}

}
