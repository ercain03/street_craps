package maingamelogic;

public class DiceLogic extends DiceFunctionality {
	
	public void initialRoll() {
		firstPoint = diceOne + diceTwo;
		if(firstPoint == 7 || firstPoint == 11) {
			System.out.println("You rolled a " + firstPoint + ", you win!!!");
		} else if (firstPoint == 2 || firstPoint == 3 || firstPoint == 12) {
			System.out.println("You rolled a " + firstPoint + ", you lost!!!");
		} else {
			System.out.println("Your point to hit is " + firstPoint);
			gameLogic();
		}
	}
	
	public void gameLogic() {
		secondRoll();
		if(secondPoint == 7) {
			System.out.println("Sucka you lose!!!, you hit a "+ secondPoint);
		} else if (secondPoint == firstPoint) {
			System.out.println("Winning!!! you hit " + firstPoint);
		} else {
			System.out.println("You rolled " + secondPoint + " not your point keep rolling.");
			gameLogic();
		}
	}
}
