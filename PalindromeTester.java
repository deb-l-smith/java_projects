import java.util.Scanner;

public class PalindromeTester {
      
      public static boolean isPalindrome(String s)
      {
            s = s.toUpperCase(); //converts the string to uppercase
            
            //recursion is a method that will call itself
            char first = s.charAt(0);  //first char in string
            char last = s.charAt(s.length() - 1); //last char in string
            
            //first base case
            if(s.length() < 2)
            {
               //if the string is less than 2 characters, it is a palindrome
               return true;
            }
            else if (first != last)
            {
               //if the string has more than 2 character, compare the first and last chars in the string
               //if the characters are not equal, return false
               return false;
            }
            else
            {
               //recursive case
               //if the string has more than 1 character, compare the first and last chars in the string
               //if the characters are equal, use recursion to trim the string down
               return isPalindrome(s.substring(1, s.length()-1));
            }
            
       }     

         //main method
         public static void main(String[] args) {
         
            Scanner keyboard = new Scanner(System.in);
            String input;
            
            System.out.print("Enter some text, I'll check to see if it is a palindrome: ");
            input = keyboard.nextLine();
            
            if(isPalindrome(input))
            {
               System.out.println(input + " is a palindrome.");
            }
            else
            {
               System.out.println("NO PALINDROME FOR YOU!");
            }
         
         }
}