public class RaceDemo {

      public static void main(String[] args)
      {
           //superclass
           Horse h1 = new Horse("Secretariat", "Red", 1973);
           System.out.println("superclass example:");
           System.out.println(h1.toString());
           
           //subclass
           RaceHorse rh1 = new RaceHorse("HappyTails", "Brown", 1988, 20);
           System.out.println("subclass example:");
           System.out.println(rh1.toString());  
           
           //copy constructor
           Horse horse1 = new Horse("CopperPot", "Black", 2004);
           Horse horse2 = new Horse(horse1);
           System.out.println("copy constructor example:");
           System.out.println(horse2.toString());      
           
           //polymorphism - declare a superclass object in terms of a subclass object
           Horse h2 = new RaceHorse("Popcorn", "Tan", 1999, 12);
           System.out.println("polymorphism example:");
           System.out.println(h2.toString());
         
      }//end of main method
}//end of RaceDemo class