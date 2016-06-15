/* MonopolyDice.java
 * Frances Blendermann
 * Create a program that will randomly select two numbers from 1-6 
 * (like rolling two dice). 
 * Show the dice rolls and end the program UNLESS the program rolls doubles. 
 * If the program rolls doubles, then it should roll again, 
 * show the new roll and stop UNLESS the program rolls doubles again and so on. 
 * But on the third time you roll doubles, you don't get to roll again, 
 * on the third time you roll doubles, you go to jail!
 */

import java.util.Random;

public class MonopolyDice {

	public static void main(String[] args) {
		Random randomGen = new Random();
		int firstRoll, secondRoll, move;
		int rolls = 0;
		boolean keepRolling = true;

		while (keepRolling) {
			firstRoll = 1 + randomGen.nextInt(2);
			secondRoll = 1 + randomGen.nextInt(2);
			move = firstRoll + secondRoll;
			System.out.println("User rolls " + firstRoll + " & " + secondRoll);

			// if not doubles, don't roll again
			if (firstRoll != secondRoll) {
				System.out.println("Move " + move + " spaces and stop");
				keepRolling = false;

			// if doubles
			} else {
				System.out.println("DOUBLES!");
				rolls++;

				// if doubles, but not third roll, then roll again
				if (rolls < 3) {
					System.out.println("Move " + move + " spaces "
						+ "and roll again getting...");

					// if doubles and third roll, then go to jail
				} else {
					System.out.println("GO TO JAIL --->");
					keepRolling = false;
				}
			}
		}
	}
}