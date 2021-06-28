public class PasswordVerifier
{
      public static boolean correctLength(String str)
      {
            //passwords need to be at least 6 characters
            if (str.length() >= 6)
               return true;
            else
               return false;
      }
      
      public static boolean hasUpperCase(String str)
      {
            //passwords need to have at least 1 uppercase letter
            boolean hasUpper = false;
            
            //loop through each character in the string
            //and check to see if it has an upper case character
            for (int i = 0; i < str.length(); i++)
            {
               if(Character.isUpperCase(str.charAt(i)))
                  hasUpper = true;
            }
            return hasUpper;
      }
      
      public static boolean hasLowerCase(String str)
      {
            //passwords need to have at least 1 lowercase letter
            boolean hasLower = false;
            
            //loop through each character in the string
            //and check to see if it has a lower case character
            for (int i = 0; i < str.length(); i++)
            {
               if(Character.isLowerCase(str.charAt(i)))
                  hasLower = true;
            }
            return hasLower;     
      }
      
      public static boolean hasDigit(String str)
      {
            //passwords need to have at least 1 digit
            boolean hasDigit = false;
            
            //loop through each character in the string
            //and check to see if it has a digit
            for (int i = 0; i < str.length(); i++)
            {
               if(Character.isDigit(str.charAt(i)))
                  hasDigit = true;
            }
            return hasDigit;  
      
      }
      
      //test to see if the password is valid
      public static boolean validPassword(String str)
      {
            if(correctLength(str) && hasUpperCase(str)
               && hasLowerCase(str) && hasDigit(str))
               return true;
            else
               return false;   
      }
          
}