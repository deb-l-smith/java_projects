public class Vehicle
{
   // fields
   private String make;
   private String model;
   private int year;
   
   // no arg constructor
   public Vehicle()
   {
      make = "";
      model = "";
      year = 0;
   }
   
   // overloaded constructor
   public Vehicle(String m1, String m2, int y)
   {
      make = m1;
      model = m2;
      year = y;
   }
   
   // setters
   public void setMake(String m)
   {
      make = m;
   }
   
   public void setModel(String m)
   {
      model = m;
   }
   
   public void setYear(int y)
   {
      year = y;
   }
   
   // getters
   public String getMake()
   {
      return make;
   }
   
   public String getModel()
   {
      return model;
   }
   
   public int getYear()
   {
      return year;
   }
   
   // method for the car to honk
   public void horn()
   {
      System.out.println("The " + make + " " + model + " honked!");
   }
   
   public String toString()
   {
      return "Year: \t" + getYear() + "\n" +
             "Make: \t" + getMake() + "\n" +
             "Model: \t" + getModel() + "\n"; 
   }
   
} // end vehicle class