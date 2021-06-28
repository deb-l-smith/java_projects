import javax.swing.JOptionPane;

public class WordCounter
{
      public static int wordCount(String str)
      {
            String[] tokens = str.split(" ");
            
            return tokens.length; //returns the number of tokens (ie words)
      }
      
      public static void main(String[] args)
      {
            String input;
            String output;
            
            input = JOptionPane.showInputDialog("Enter a phrase: ");
            output = String.format("The phrase contains %d words",
                                    wordCount(input));
            JOptionPane.showMessageDialog(null, output);                                                          
      }
}