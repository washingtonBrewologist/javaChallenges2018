// Nick @ WashingtonBrewology
/*
Challenge # 6: Find the Smallest Number in an Array

Create a method that takes an array of integers and returns the smallest number in the set.
Examples
[34, 15, 88, 2] ➞ 2

[34, -345, -1, 100] ➞ -345

[-76, 1.345, 1, 0] ➞ -76

[0.4356, 0.8795, 0.5435, -0.9999] ➞ -0.9999

[7, 7, 7] ➞ 7
Notes
Test cases contain only positive and negative numbers.
*/

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
			int smallestNum = args[0];            // First task is to create a variable that will hold the starting value of the int array
			for (int i = 1; i<args.length; i++)   // Then we loop through the array starting at 1 (not 0)
			{
				if (args[i] < smallestNum)          // Starting at 1 allows us to compare the rest of the array to value @ 0.
				{
					smallestNum = args[i];            // Here we assign the value of the smallest number in array into our smallestNum variable
				}	
			}
			return smallestNum;
			
    }
}
