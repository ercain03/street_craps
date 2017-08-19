package maingamelogic;

public class CrapsTester {
	public static void main(String[] args) {
		
		System.out.println("Welcome to Street Dice.");
		System.out.println("A simple game of craps played with street rules.");
	
		DiceLogic shooter = new DiceLogic();
		shooter.rollDice();
		shooter.initialRoll();

	}
}
