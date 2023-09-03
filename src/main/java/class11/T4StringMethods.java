package class11;

import java.util.Scanner;

public class T4StringMethods {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();
        //write your code below
        String reversed = new StringBuilder(givenString).reverse().toString();
        System.out.println(givenString.equalsIgnoreCase(reversed));

        /*
        Write code that will take in a String input and check to see if it is a palindrome or not.

         A palindrome means that the characters are the same
         forwards and backwards, **ignoring spaces.**

          Examples of palindromes:

           - racecar
           - was it a car or a cat I saw
           - never odd or even
           - rats live on no evil star

           Your check should be case insensitive too.  For example, "Bob" is a palindrome,
           despite the first B being capitalized.

Your program will print out "true" if it's a palindrome and "false" if not.
         */


        


    }
}