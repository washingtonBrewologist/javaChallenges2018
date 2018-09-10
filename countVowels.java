// Nick @ washingtonBrewology
/*
CHALLENGE 7: How Many Vowels?
Skills: [loops][regex][strings]
Create a function that takes a string and returns the number (count) of vowels contained within it.
Examples
"Celebration" ➞ 5

"Palm" ➞ 1

"Prediction" ➞ 4
Notes
a, e, i, o, u are considered vowels (not y).
All test cases are one word and only contain letters.

Method call: 
countTheVowels(str: "A man, a plan, a canal, panama.");
Expected output:
A man, a plan, a canal panama. Contains: 10 vowels!

* */
    public static int countTheVowels(String str) {
        // we set our variable vowelCounter = to the string, then we use regex to pluck out the vowels upper and lower case
        // we then replace them with ""(nothing) and count them with .length().
       int vowelCounter = str.replaceAll("[^aeiouAEIOU]", "").length();
       System.out.println(str + " Contains: " + vowelCounter + " vowels!"); // we can test with this print statement
       return vowelCounter;
    }
