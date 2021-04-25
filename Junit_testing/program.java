package fall2020testing;

import java.util.Arrays;

public class program {

	public static void main(String[] args) 
	{ 
		int[] someNumbers = new int[] {5, 3, 5, 9, 3, 2, 9, 11, 4, 7, 2};
		int[] someMoreNumbers = new int[] {5, 6, 5, 8, 9, 8, 1, 2, 1, 4, 6};
		System.out.println("Unsorted:     " + Arrays.toString(someNumbers));
		System.out.println("Sorted:       " + Arrays.toString(utilities.SelectionSort(someNumbers)));
		System.out.printf("Repeating Numbers: %B\n",utilities.RepeatedNumber(someMoreNumbers));
		System.out.printf("The Fibonacci number of %d is %d\n", 17, utilities.Fibonacci(17));
		System.out.printf("getResults of %d is %d\n", 5, utilities.getResults(5));
	}
}
