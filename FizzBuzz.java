/**
Fizz Buzz
this is my preferred way to code fizzbuzz
*/
public class FizzBuzz
{
      public static void main(String[] args)
      {     
           getFizzBuzz(); //calls getFizzBuzz method             
      }//end of main method
      
      //method to determine fizzbuzz while looping through 1 to 100
      public static void getFizzBuzz()
      {    
            for (int i = 1; i <= 15; i++) 
            {
               if ((i % 3 == 0) && (i % 5 == 0)) 
                  {  //if divisible by 3 and 5
                     System.out.println("FizzBuzz");
                  }
               else if (i % 3 == 0) 
                  {  //if divisible by 3
                     System.out.println("Fizz");
                  }
               else if (i % 5 == 0)
                  {  //if divisible by 5
                     System.out.println("Buzz");
                  }
               else 
                  {  //if none of the above just print number
                     System.out.println(i);
                  } 
            }//end of for loop             
      }//end of getFizzBuzz method
      
}//end of class