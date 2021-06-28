public class VehicleDemo
{
   public static void main(String[] args)
   {
      Vehicle rr = new Vehicle("Rolls Royce", "Phantom", 2020);
      System.out.println(rr.toString());
      rr.horn();
      System.out.println();
      
      Car a6 = new Car("Audi", "A6", 2014, 4);
      System.out.println(a6.toString());
      a6.horn();
      a6.engine();
      System.out.println();
      
      // polymorphism - declare a superclass object in terms of a subclass object
      Vehicle g550 = new Car("Mercedes-Benz", "G 550 SUV", 2020, 4);
      System.out.println(g550.toString());
      g550.horn();
      //g550.engine(); // error because engine is not a method in vehicle class
      
      // error - cannot define a subclass object in terms of a superclass object
      //Car bmw745 = new Vehicle("BMW", "745i", 2019);
      //System.out.println(bmw745.toString());
      //bmw745.horn();      
   } // end main method
   
}// end VehicleDemo class