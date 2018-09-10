// Nick @ washingtonBrewology
/*
Challenge 8: Head-Body-Tail
Skills: [conditions][strings]
Write a method that takes four string arguments. You will be comparing the first string to the three next strings. Verify if the first string starts with the second string, includes the third string, and ends with the fourth string. If the first string passes all checks, return the string "My head, body, and tail.", otherwise, return "Incomplete.".
Examples
"Onomatopeia", "on", "mato", "ia" ➞ "Incomplete."

"Centipede", "Cent", "tip", "pede" ➞ "My head, body, and tail."

"apple", "AP", "PPL", "LE" ➞ "Incomplete."
Notes
You'll always get exactly four strings as arguments.
Tests are case sensitive.

Test: subStringVerification("Centipede", "Cent", "tip", "pede");
Expected Output: My head, body, and tail.
*/

    public static String subStringVerification(String s1,String s2,String s3,String s4) {
        if(s1.contains(s2)&&    // Our if statement checks if s1 contains all other strings
            s1.contains(s3) &&
                s1.contains(s4))
        {
            return ("My head, body, and tail.");

        }
        else {
            return "Incomplete.";
        }


    }
