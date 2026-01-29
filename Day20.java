Day - 20:
Write a Java program to reverse a given string.

Example
Input: HELLO

Output: OLLEH

Explanation

Original string: HELLO
Start reading the string from the last character to the first character.
Append each character in reverse order.

Step-by-step:
Read O
Then L
Then L
Then E
Then H

The reversed string becomes OLLEH.


public class Reverse {
    public static void main(String[] args) {        
        String str = "ANDREAAAAAAAAAAAA";  
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
    }


