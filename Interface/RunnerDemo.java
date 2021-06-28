/*
A driver class that demonstrates the use of the classes.
**/
public class RunnerDemo
{
      public static void main(String[] args)
      {                          
          // Machine
          Machine machineObject = new Machine();
          machineObject.run();
          
          // Athlete
          Athlete athleteObject = new Athlete();
          athleteObject.run();
          
          // PoliticalCandidate
          PoliticalCandidate politicalCandidateObject = new PoliticalCandidate();
          politicalCandidateObject.run();
                 
      }
}