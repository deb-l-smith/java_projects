public class PGRatedMovieSavings implements MovieSavings
{
   //fields
   private String name;
   private String age;
   
   /**
   Constructor PGRatedMovieSavings A constructor that accepts arguments
   @param n String The name
   @param a String The age
   */
   public PGRatedMovieSavings(String n, String a)
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
         return "****PG-Movie Savers****" +
                "\nName: " + getName() +
                "\nAge: " + getAge() +
                "\nSavings: $4.00 off a PG-Rated Movie\n";  
   }
}