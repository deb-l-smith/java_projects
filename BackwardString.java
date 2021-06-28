import java.util.Scanner;

public class BackwardString {

      public static void backwards(String s) {
      
            for(int i = s.length() -1; i >= 0; i--)
               System.out.print(s.charAt(i));            
               System.out.println();
      }
      
      public static void main(String[] args) {
      
         Scanner keyboard = new Scanner(System.in);
         String input;
         
         System.out.print("Enter some text, I'll turn it around: ");
         input = keyboard.nextLine();
         
         backwards(input);
      }
}