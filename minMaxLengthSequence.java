// Nick @ washingtonBrewology
/*
Challenge 11: Find the Minimum, Maximum, Length and Average Values
Create a method that takes an array of doubles and returns the following statistics:
Minimum Value
Maximum Value
Sequence Length
Average Value
Examples
[6, 9, 15, -2, 92, 11] ➞ [-2, 92, 6, 21.833333333333332]

[30, 43, 20, 92, 3, 74] ➞ [3, 92, 6, 43.666666666666664]

[4.54, 8.32, 5.20] ➞ [4.54, 8.32, 3, 6.02]

imports needed:
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;


*/

    public static double[] mMLS(double[] nums) {
        // we use DoubleSummaryStatistics and stream our nums array through to get statistics
        DoubleSummaryStatistics arrayStats = Arrays.stream(nums).summaryStatistics();
        double[] resultArray = new double[4]; // creates new array to hold our results with 4 element spots!
        resultArray[0] = arrayStats.getMin();  // here we put our result stats into our new resultsArray!
        resultArray[1] =arrayStats.getMax();
        resultArray[2] =nums.length;
        resultArray[3] =arrayStats.getAverage();
        return resultArray;  // return the results array!
    }
