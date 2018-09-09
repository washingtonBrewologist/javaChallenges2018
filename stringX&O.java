// Nick @ WashingtonBrewology
/*
Challenge #6 : X's and O's

Create a function that takes a string, checks if it has the same number of 'x's and 'o's and returns either true or false.
Rules
Return a boolean value (true or false).
The string can contain any character.
When no x or o is in the string, return true.
Examples
"ooxx" ➞ true

"xooxx" ➞ false

"ooxXm" ➞ true (case insensitive)

"zpzpzpp" ➞ true (returns true if no x and o)

"zzoo" ➞ false
Notes
Remember to return true if there aren't any x's or o's.
Must be case insensitive.
*/

public class XO {
  public static boolean getXO (String str) {
		str = str.toLowerCase();    // set our string to be case insensitive by taking the string and making it lowerCase.
		String x = "x";     // creating values for x, and o, variables to use later in code.
		String o = "o";
		
		if (!str.contains(x) && !str.contains(o)) {   // The first test will check if the string contains(or doesn't) x, or o's
			return true;
		} else if(str.replace("x", "").length() == str.replace("o", "").length())   // Here the replace method replaces all occurences of
                                                                                // our targets(x,o) and replaces them with nothing "".
                                                                                // then we compare x's and o's with .length() & ==.
		{
			return true;
		}
		return false;
		
  }
}
