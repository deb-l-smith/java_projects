public class Horse{
   
   private String name;
   private String color;
   private int birthYear;

   //no arg constructor
   public Horse()
   {
        name = "";
        color = "";
        birthYear = 0; 
   }
   
   //overloaded constructor
   public Horse(String n, String c, int yr)
   {
         name = n;
         color = c;
         birthYear = yr;
   }
   
   //copy constructor
   public Horse(Horse object2)
   {
      name = object2.name;
      color = object2.color;
      birthYear = object2.birthYear;
   }
   
   //setters
   public void setName(String n)
   {
         name = n;
   }
   public void setColor(String s)
   {
         color = s;
   }
   public void setBirthYear(int yr)
   {
         birthYear = yr;
   }
   
   //getters
   public String getName()
   {
         return name;
   }
   public String getColor()
   {
         return color;
   }
   public int getBirthYear()
   {
         return birthYear;
   }
   
   //toString method
   public String toString()
   {
         return "Name: \t\t\t" + getName() + "\n" +                
                "Color: \t\t\t" + getColor() + "\n" +
                "Birth Year: \t" + getBirthYear() + "\n";
   }

}//end of Horse class