/**
 * Author: Brandon B.
 * Date: 9-25-15
 * Description: Plays the box car game.
 */

public class boxCars {
    public static void main(String[] args) {
    	final int maxFlips = 1000, winningNumber = 6;
    	int timesWon = 0;
    	pairOfDice dice = new pairOfDice();

    	// Begin a loop to roll 1000 times.
    	for (int count = 0;count <= maxFlips;count++) {
    		dice.roll();
    		if ((dice.die1 == winningNumber) && (dice.die2 == winningNumber)) {
    			// The user won!
    			// Add a point to the times they won.
    			timesWon++;
    		}
    	}
    	System.out.printf("You won %d times.%n", timesWon);
    }
}
