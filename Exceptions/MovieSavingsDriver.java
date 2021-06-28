/*
   A program that offers savings to G-Rated or PG-Rated movies  
   based on their ages between 5-17 years old.
   •	Ages 5-12 - $5.00 off of a G-Rated Movie
   •	Ages 13-17 - $4.00 off of a PG Rated Movie
**/
import java.util.*;//needed for Scanner
import java.util.ArrayList;//needed for ArrayList

public class MovieSavingsDriver
{
      public static void main(String[] args)
      {
            //fields
            String name, age, keepGoing = "";
            Scanner keyboard = new Scanner(System.in);
            
            //declare two empty ArrayLists
            ArrayList<GRatedMovieSavings> gMovieList = new ArrayList<GRatedMovieSavings>();
            ArrayList<PGRatedMovieSavings> pgMovieList = new ArrayList<PGRatedMovieSavings>();
      
            do{
              //prompt user to enter their name
               System.out.print("Enter Name: ");
               name = keyboard.nextLine();
               while (name.length() == 0) //validate if name is empty
               {
                  System.out.print("Enter Name: ");
                  name = keyboard.nextLine();               
               }
               //change first letter of name to UpperCase
               name = name.substring(0, 1).toUpperCase() + name.substring(1);
            
            try{
               //prompt user to enter their age
               System.out.print("Age: ");
               age = keyboard.nextLine();
               if (validAge(age) == true) //validate age
               {
                  //display if movie-goer is eligible
                  System.out.println("User is of valid age to get a discount.");
                  if (Integer.parseInt(age) < 13)
                  {
                     System.out.println(name + " is eligible for savings on a G-Rated movie.");
                  }
                  else
                  {
                     System.out.println(name + " is eligible for savings on a PG-Rated movie.");
                  }
               }
               
               //create a new instance of either the GRatedMovieSavings or 
               //the PGRatedMovieSavings class and 
               //add that instance to its respective ArrayList
               if (Integer.parseInt(age) < 13)
               { //between 5-12
                  gMovieList.add(new GRatedMovieSavings(name, age));
               }
               else
               { //between 13-17
                  pgMovieList.add(new PGRatedMovieSavings(name, age));
               } 
                            
               } //end of AgeException try   
             catch (AgeException e) //catch Age Exception
               {
                  System.out.println(e.getMessage());
               } 
             catch (NumberFormatException e) //catch any invalid characters
               {
                  //System.out.println("You entered an invalid character.");
                  System.out.println("You must be between 5 and 17 " +
                                     "to be eligible for savings.");
	            }
                                                                                                   
               //ask the user if they want to add another contact
               System.out.print("Would you like to enter another name? (Y/N): ");
               keepGoing = keyboard.nextLine();
               System.out.println();//add a space
            
            }while(keepGoing.equalsIgnoreCase("y"));
            
            System.out.println("\n**********Savings List**********\n\n");
            
            //loop through arraylists to display users
            for (GRatedMovieSavings m : gMovieList)               
            {
               System.out.println(m.displaySavings());
               System.out.println();   
            }
                          
            for (PGRatedMovieSavings m : pgMovieList)              
            {
               System.out.println(m.displaySavings());
               System.out.println();   
            }
      
      }//end of main method


      /*
         A method to validate age is between 5 and 17
         or if the string contains one or two characters
         validAge method
         @param age String The age
         @return true if age is valid
      **/
      public static boolean validAge(String age) throws AgeException
      {     
            int length = age.length(); 
                               
            //check if length is 1 or 2 characters
            //check if the age is between 5 and 17
            if (length < 1 || length > 2  ||
                Integer.parseInt(age) < 5 || 
                Integer.parseInt(age) > 17)
            {
               throw new AgeException("You must be between 5 and 17 " +
                                      "to be eligible for savings.");
            } 
                                          
            //if an exception is not thrown
            return true;
      }

}//end of MovieSavingsDriver