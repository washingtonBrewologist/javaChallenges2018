// Nick @ washingtonBrewology
/*
CHALLENGE 6: Get Largest Number From Array
Skills: [Arrays][numbers][sorting]
Create a method that takes an array of integers. Return the largest integer in the array.
Examples
[4, 5, 1, 3] ➞ 5

[300, 200, 600, 150] ➞ 600

[1000, 1001, 857, 1] ➞ 1001
Notes
Expect either a positive number or zero (there are no negative numbers).
TEST:
getLargest(new int[]{2432,5234523,11111,1000000});
EXPECTED OUTPUT: 5234523;
*/
    public static int getLargest(int[] nums) {  // we create a method with int array as parameter
        int maxFinder = nums[0];                // first we need to set a new variable = to our int array at index 0
        for (int i = 0; i < nums.length; i++) { // then iterate through the array
            if (nums[i] > maxFinder) {          // if any value of the array is greater than our maxFinder value at 0 
                maxFinder = nums[i];            // set maxFinder = to that larger value
                System.out.println(maxFinder);  // for testing purposes we print it to the screen to be sure its working
            }

        }
        return maxFinder; // return max finder

    }
}
// OUTPUT: 5234523;
