public class RaceHorse extends Horse
{
      private int racesWon = 0;
      
      //no arg constructor
      public RaceHorse()
      {
         super();
         racesWon = 0;
      }
      
      //overloaded constructor
      public RaceHorse(String n, String c, int yr, int races)
      {
         super(n, c, yr);
         racesWon = races;
      }
      
      //setters
      public void setRacesWon(int r)
      {
         racesWon = r;
      }
      
      //getters
      public int getRacesWon()
      {
            return racesWon;
      }
      
      //toString method
      public String toString()
      {
             return super.toString() + "Races won: \t\t" + getRacesWon() + "\n";
      }
      

}//endof RaceHorse class