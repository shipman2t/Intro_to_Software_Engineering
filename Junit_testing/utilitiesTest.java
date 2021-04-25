package fall2020testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class utilitiesTest 
{

	/* *************************************************
	 * SelectionSortTest() 			Black Box Testing
	 * *************************************************
	 * 
	 * For Selection Sort these tests were systematically written for the following test cases:
	 * 		A single number, two different numbers, two of the same numbers, an array with two numbers
	 * 		in alternating positions, a series of numbers with the smallest numbers first, a series of 
	 * 		numbers with the smallest numbers in the middle, series of numbers with the smallest numbers
	 * 		last, and finally an array with no numbers.  
	 */
	@Test
	void SelectionSortTest() 
	{	
		int[] twoNumbers = new int[] {2, 1};
		int[] expTwoNumbers = new int[] {1, 2};
		int[] everyOther = new int[] {1, 3, 5, 6, 4, 2};
		int[] expEveryOther = new int[] {1, 2, 3, 4, 5, 6};
		int[] smallestFirst = new int[] {1, 2, 5, 6, 3, 4};
		int[] expSmallestFirst = new int[] {1, 2, 3, 4, 5, 6};
		int[] smallestMiddle = new int[] {3, 4, 1, 2, 5, 6};
		int[] expSmallestMiddle = new int[] {1, 2, 3, 4, 5, 6};
		
		assertArrayEquals(expTwoNumbers, utilities.SelectionSort(twoNumbers));
		assertArrayEquals(expEveryOther, utilities.SelectionSort(everyOther));
		assertArrayEquals(expSmallestFirst, utilities.SelectionSort(smallestFirst));
		assertArrayEquals(expSmallestMiddle, utilities.SelectionSort(smallestMiddle));
	}
	
	/* *************************************************
	 * RepeatedNumberTest() 		Black Box Testing
	 * *************************************************
	 * 
	 * For RepeatedNumber my tests were designed to test a single number, two different numbers, 
	 * 		to numbers repeating, repeated numbers that repeat from outside into the middle of the array.  
	 */
	@Test
	void RepeatedNumberTest() 
	{ int[] oneNum = new int[] {1};
		int[] twoDiffNums = new int[] {1, 2};
		int[] twoSameNums = new int[] {2, 2};
		int[] insideOut = new int[] {5, 4, 3, 2, 1, 1, 2, 3, 4, 5};
		
		assertFalse(utilities.RepeatedNumber(oneNum));
		assertFalse(utilities.RepeatedNumber(twoDiffNums));
		assertTrue(utilities.RepeatedNumber(twoSameNums));
		assertTrue(utilities.RepeatedNumber(insideOut));
	}

	/* *************************************************
	 * FibonacciTest()  					Black Box Testing
	 * *************************************************
	 * 
	 * The testFibonacci() method uses tests that check for a: Negative number, zero, 1, 2, as the trivial 
	 * 		cases.  Cases for 3, 4, 11 were chosen to make sure that the addition of the numbers was correct.  
	 * 		These values were verified against a third party Fibonacci calculator.  
	 */
	@Test
	void FibonacciTest() 
	{	assertEquals(0, utilities.Fibonacci(0));
		assertEquals(1, utilities.Fibonacci(1));
		assertEquals(1, utilities.Fibonacci(2));
		assertEquals(2, utilities.Fibonacci(3));
		assertEquals(3, utilities.Fibonacci(4));
		assertEquals(89, utilities.Fibonacci(11));

	}

	/* *************************************************
	 * getResultsTest() 				White Box Testing
	 * *************************************************
	 * 
	 * There are 8 paths for getResults.  
	 * 		-21, -20, -19, and -18 test the true branch of num < 0.
	 * 		21, 20, 2, and 1 test the false branch of num < 0.
	 * 
	 * 		After conversion by num < 0: -21, -20 as well as the un-converted 21 and 20 test the true branch of 
	 * 		if(num >= 20).  Converted -20 and 20 test the true branch of if(num % 2 == 0) and return the number.
	 * 	  Converted -21 and 21 test the false branch of if(num % 2 == 0) to return the number + 1.
	 * 
	 * 		After conversion by num < 0: -19, -18 as well as the un-converted 2 and 1 test the false branch of 
	 * 		if(num >= 20).  The number passed to the false branch has 20 added to itself.  Converted -18 and 2 
	 * 		test the true branch of if(num % 2 == 0) and return the number that has had 20 added to it.
	 * 	  Converted -19 and 1 test the false branch of if(num % 2 == 0) to return the number that has had 20 
	 * 		added to it + 1.
	 */
	@Test
	void getResultsTest() {
		assertEquals(22, utilities.getResults(-21));
		assertEquals(20, utilities.getResults(-20));
		assertEquals(40, utilities.getResults(-19));
		assertEquals(38, utilities.getResults(-18));
		assertEquals(22, utilities.getResults(21));
		assertEquals(20, utilities.getResults(20));
		assertEquals(22, utilities.getResults(2));
		assertEquals(22, utilities.getResults(1));
	}

}
