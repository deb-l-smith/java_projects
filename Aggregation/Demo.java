/**
An application that will keep track of Insurance Policies
*/
import java.util.*; //needed for Scanner and ArrayList
import java.io.*; //needed for File
public class Demo
{//open class container
   public static void main(String[] args)
   {//open main method
      try 
      {//open the "try" block of code
         //create instance of file class and pass String to constructor
         File file = new File("PolicyInformation.txt");
         //pass a reference to File class as an argument
         Scanner inputFile = new Scanner(file);
         
         //declare and initialized variables         
         String policyNum = " ", providerName = " ";
         String pHolderFN = " ", pHolderLN = " ", smokeStatus = " ";
         int pHolderAge = 0;
         double pHolderHeight = 0.0, pHolderWeight = 0.0; 
         double totalCost = 0.0;//hold total cost of policy
         int smoker = 0; int nonSmoker = 0;//hold counts for smokeStatus
         int policyCount = 0;//hold count for Policy objects
         
         //create an ArrayList to store policy objects
         ArrayList<Policy> policies = new ArrayList<Policy>();
                     
       while (inputFile.hasNext())
       {//open while loop
               policyNum = inputFile.nextLine();
               providerName = inputFile.nextLine();
               pHolderFN = inputFile.nextLine();
               pHolderLN = inputFile.nextLine();
               pHolderAge = inputFile.nextInt();
               inputFile.nextLine();//clear buffer
               smokeStatus = inputFile.nextLine();                
               pHolderHeight = inputFile.nextDouble();
               pHolderWeight = inputFile.nextDouble();
                
               if (inputFile.hasNext())
               {
                  inputFile.nextLine();
                  inputFile.nextLine();                     
               }

         //create PolicyHolder object
         PolicyHolder policyHolder = new PolicyHolder(pHolderFN, pHolderLN, pHolderAge, 
                                                     smokeStatus, pHolderHeight, pHolderWeight);
         
         //create Policy objects using Policy class
         //pass variables and PolicyHolder object by reference
         Policy p = new Policy(policyNum, providerName, policyHolder);
         
         policyCount = p.getPolicyCount();//add policy count
             
         //add policy objects to the ArrayList
         policies.add(p);
              
         //add counts for smokers and non smokers
         if (policyHolder.getSmokeStatus().equalsIgnoreCase("smoker"))
         {
            smoker += 1;//add 1 for each smoker
         }
         else
         {
            nonSmoker += 1;//add 1 for each non-smoker
         }
                                  
      }//close while loop
      
      inputFile.close();//close the file when done reading from it   
           
         for (int i = 0; i < policies.size(); i++)
         {//open for loop
            //output using the toString method
            System.out.print(policies.get(i));                                                 
         }//close for loop
         
      //display the counts for objects created and smokeStatus outside the loop
      System.out.print("\nThere were " + policyCount + " Policy objects created.");
      System.out.print("\nThe number of policies with a smoker is: " + smoker);
      System.out.print("\nThe number of policies with a non-smoker is: " + nonSmoker);
         
      }//close the "try" block of code 
      catch(IOException ex)//an IOException is "thrown" to us, and we "catch" it and deal with it
      {
      //use the getMessage method of the exception we "caught" to print out it's message about what went wrong
      System.out.println("Something went wrong: " + ex.getMessage());
      }
 
  }//end of main method
}//end of class