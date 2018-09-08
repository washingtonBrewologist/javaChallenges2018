/*
Nick @ WashingtonBrewology
CHALLENGE 2:
Create a method that accepts a string (of a persons first and last name) and returns a string with the first and last name swapped.
Examples:

"Donald Trump" ➞ "Trump Donald"

"Rosie O'Donnell" ➞ "O'Donnell Rosie"

"Seymour Butts" ➞ "Butts Seymour"
Notes
There will be exactly one space between the first and last name.
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.

*/

// I was initially making this much harder than it needed to by creating individual variables for first and Last names and 
// trying to use the indexOf method to swapEm. I was ending up with " Trump Donald" instead of "Trump Donald".
// this solution should do the trick!

public class Program {
    public static String nameShuffle(String s) {
    String[] names = s.split(" "); //first,we create a new string array 'names' and set it = to our initial string s and use s.split(" ");
			                              // this splits the string at the space and takes the string and sticks it in our new String array.
                                    // Now inside the array the names have indexed values of [0] & [1].
			return names[1] + " " + names[0]; // All that left to do is simply return the swapped names by their index position. And add our " "! 
      
    }
}
