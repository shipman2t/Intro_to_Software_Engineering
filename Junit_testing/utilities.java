package fall2020testing;

public class utilities {
	
	public static int[] SelectionSort(int[] testArray) 
	{ for(int i = 0; i < testArray.length - 1; i++)
    { int index = i;
        for(int j = i + 1; j < testArray.length; j++)
            if(testArray[j] < testArray[index])
                index = j;

        int smallerNumber = testArray[index];
        testArray[index] = testArray[i];
        testArray[i] = smallerNumber;
    }
		return testArray;
	}
	
	public static boolean RepeatedNumber(int[] testArray) 
	{	for (int i = 0; i < testArray.length; i++) 
			for(int j = i + 1; j < testArray.length; j++) 
				if(testArray[i] == testArray[j] && i != j) 
					return true;
		
		return false;
	}
	
	public static int Fibonacci(int number) 
	{	if (number <= 1) 
			return number; 
		return Fibonacci(number-1) + Fibonacci(number-2); 
	}
	
	public static int getResults(int num) 
	{ if(num < 0)
			num *= -1;
		
		if(num >= 20) 
		{ if(num % 2 == 0)
				return num;
			else
				return num + 1;
		}
		
		else 
		{ num += 20;
			
			if(num % 2 == 0)
				return num;
			else
				return num + 1;
		}
	}
	/*
	 * Mutated with:  num > 0, 
	 */
	public static int getResultsFirstMutant(int num) 
	{ if(num > 0)
				num *= -1;
			
			if(num <= 20) 
			{ 
				if(num % 2 == 0)
					return num;
				else
					return num + 1;
			}
			else 
			{ num += 20;
				
				if(num % 2 == 0)
					return num;
				else
					return num + 1;
			}
	}
	/*
	 * Mutated with:  num > 20
	 */
	public static int getResultsSecondMutant(int num) 
	{ if(num < 0)
			num *= -1;
		
		if(num > 20) 
		{ if(num % 2 == 0)
				return num;
			else
				return num + 1;
		}
		
		else 
		{ num += 20;
			
			if(num % 2 == 0)
				return num;
			else
				return num + 1;
		}
	}

}