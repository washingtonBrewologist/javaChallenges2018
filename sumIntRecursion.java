/***************************************************************
CHALLENGE 3: Add up the Numbers from a Single Number

Create a method that takes an integer as an argument. Add up all the numbers from 1 to the number you passed to the function. For example,
if the input is 4 then your function should return 10 because 1 + 2 + 3 + 4 = 10.
Examples
4 ➞ 10

13 ➞ 91

600 ➞ 180300
Notes
Expect any positive number between 1 and 1000.
****************************************************************/

/*    
For problems like this I like to list our methods expected functionality so I can look for patterns and look for a base
case.

From the instructions we see that we need to take the value passed to int and add all numbers from 1 to num.

Case 1(baseCase):
addUp(num: 1) -> (1)    This is the most basic part of our problem. (If num's value is 1 we need to return 1)
Case 2:
addUp(num: 2) -> 1 + 2 -> (3) 
Case 3:
addUp(num: 3) -> 1 + 2 + 3 -> (6)  The pattern begins to emerge!
Case 4:
addUp(num: 4) -> 1 + 2 + 3 + 4 -> (10)

From this we can see that recursion is possible.

The pattern:

if n == 1
return 1
else 
return num + addUp(num-1)


*/

private static int addUp(int num) {
       if (num == 1) {
           return 1;
       } else{
           return num + addUp(num-1);
       }

    }
