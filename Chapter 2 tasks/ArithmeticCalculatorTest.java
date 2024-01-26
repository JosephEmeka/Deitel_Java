/* Test for dietel java how to program textbook chapter 2 exercise 2.15 
(Arithmetic) Write an application that asks the user to enter two integers, obtains them from the user and prints the square of each, the sum of their squares, and the difference of the squares (first number squared minus the second number squared). Use the techniques shown in Fig. 2.7.
  By Joseph Emeka Onah
*/

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ArithmeticCalculatorTest{

	@Test
	public void testsquareEachIntegerEnteredByUser(){

		Arithmetic arithmetic = new Arithmetic();


		int squareOfIntegers = arithmetic.squareEachIntegerEnteredByUser(5);

		assertEquals(25, squareOfIntegers);

	}



}