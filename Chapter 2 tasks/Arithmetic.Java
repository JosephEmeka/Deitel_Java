
 /* 2.15 (Arithmetic) Write an application that asks the user to enter two
 * integers, obtains them from the user and prints the square of each, the sum of their squares, and the difference of the squares (first number squared minus the second number squared). Use the techniques shown in Fig. 2.7.
 * 
 * By Joseph Emeka Onah
 */

public class Arithmetic{


	public int squareEachIntegerEnteredByUser(int squareofnumber) {

		int result = squareofnumber^2;

		return result;

		}


	public int computeTheSumOfTheSquareOfEachIntegerEnteredByUser(int firstSquaredNumber, int secondSquaredNumber) {

		int sumOfSquaredNumbers = firstSquaredNumber + secondSquaredNumber  ;

		return sumOfSquaredNumbers;

		}


	public int computeTheDifferenceOfTheSquareOfEachIntegerEnteredByUser(int firstSquaredNumber, int secondSquaredNumber) {

		int differenceOfSquaredNumbers = firstSquaredNumber - secondSquaredNumber  ;

		return differenceOfSquaredNumbers;

		}


	}

}