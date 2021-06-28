public class Car extends Vehicle
{
   // field 
   private int doors; // field is in the Car class
                      // but not in the Vehicle class
                      
   // constructor
   public Car()
   {
      // use super() to initialize the Vehicle class attributes
      super(); // call the Vehicle default constructor
               // and initializes the string fields to "" the int field to 0
      doors = 0;
   }
   
   // overloaded constructor
   public Car(String m1, String m2, int y, int d)
   {
      // use super() to initialize the Vehicle class attributes
      super(m1, m2, y); // call the Vehicle overloaded constructor
                        // and initializes the string fields and the int field using the parameters
      doors = d;
   }
   
   // setter
   public void setDoors(int d)
   {
      doors = d;
   }
   
   // getter 
   public int getDoors()
   {
      return doors;
   }
   
   // override horn method from the superclass
   public void horn()
   {
      System.out.println("The " + super.getMake() + " " + super.getModel() + " Beeped!");
   }
   
   // new method specific to the Car class
   public void engine()
   {
      System.out.println("The " + super.getMake() + " " + super.getModel() + " Vroomed!");
   }
   
   // override the toString method from the superclass
   public String toString()
   {
      return super.toString() + "Doors: \t" + getDoors() + "\n";
   }
}