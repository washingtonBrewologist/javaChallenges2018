/*
CHALLENGE 4: Give a string of words, Reverse the order and return the result!
*/


public class ReverseOrder {
  public static String reverse(final String str) {
		String reversedStr = "";
		for (int i = str.length()-1; i >= 0; i--)
		{
			reversedStr = reversedStr + str.charAt(i);
		}
		return reversedStr;
    
  }
}
