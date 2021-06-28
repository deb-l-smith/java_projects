public class GRatedMovieSavings implements MovieSavings
{
   //fields
   private String name;
   private String age;
   
   
   /**
   Constructor GRatedMovieSavings A constructor that accepts arguments
   @param n String The name
   @param a String The age
   */
   public GRatedMovieSavings(String n, String a)
   {
         super(); //calls the superclass MovieSavings
         this.name = n;
         this.age = a;     
   }    

   //getters
   public String getName()
   {
         return name;
   }
   public String getAge()
   {
         return age;
   }
   
   //setters
   public void setName(String name)
   {
         this.name = name;
   }
   public void setAge(String age)
   {
         this.age = age;
   }
   
   /**
   displaySavings() method To display output
   */
   public String displaySavings()
   {
         return "****G-Movie Savers****" +
                "\nName: " + getName() +
                "\nAge: " + getAge() +
                "\nSavings: $5.00 off a G-Rated Movie\n";  
   }
}