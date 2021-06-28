/*
Create classes called Machine, Athlete, and PoliticalCandidate that 
all implement the Runner interface by overriding the run method to 
display the meaning of run in relation to the class name.
**/
public class Machine implements Runner
{
      public void run()
      {
            System.out.println("The machine runs on electricity!");
      }
}