// CHALLENGE # 1 

/*
Create a method that accepts an array and returns the last item in the array.
Examples
[1, 2, 3] ➞ 3

[0] ➞ 0

[-1, -3] ➞ -3

*/


public class Program {
public static int getLastItem(int[] nums) {   //method takes 1 parameter, an int array called nums
      int index = 0;                          // We create a variable index to store the value of our last int in the array, set it = 0.
			for (int i = 0; i < nums.length; i++)   // we use a for loop to itrate over the array of ints.
			{
				index = nums[i];	     // We set our index variable to the value of the last int counted in our loop.
			}
			return index;           // We return it ! Swish.
			
    }
}
