/**
PolicyHolder class
*/
public class PolicyHolder
{
//fields or attributes
   private String policyHolderFName, policyHolderLName;
   private String smokeStatus;
   private int policyHolderAge;
   private double heightInInches, weightInPounds; 
    
/**---------------------------------------------------------------------
A no arg constructor
------------------------------------------------------------------------*/
   public PolicyHolder()
   {
      policyHolderFName = " ";
      policyHolderLName = " ";
      policyHolderAge = 0;
      smokeStatus = " ";
      heightInInches = 0.0;
      weightInPounds = 0.0;
   }
/**---------------------------------------------------------------------
A constructor that accepts arguments
@param pFN String The policy holder's first name
@param pLN String The policy holder's last name
@param pA String The policy holder's age
@param smk String The policy holder's smoking status
@param h double The policy holder's height
@param w double The policy holder's weight
------------------------------------------------------------------------*/
   public PolicyHolder(String policyHolderFName, String policyHolderLName, int policyHolderAge, 
                       String smokeStatus, double heightInInches, double weightInPounds)
   {
      this.policyHolderFName = policyHolderFName;
      this.policyHolderLName = policyHolderLName;
      this.policyHolderAge = policyHolderAge;
      this.smokeStatus = smokeStatus;
      this.heightInInches = heightInInches;
      this.weightInPounds = weightInPounds;
   }
/**---------------------------------------------------------------------
A copy constructor creates a copy of the PolicyHolder class
that is passed as a parameter.
It initializes the object and is used to prevent security holes.
@param object2 The object to copy
------------------------------------------------------------------------*/  
   public PolicyHolder(PolicyHolder object2)
   {
      this.policyHolderFName = object2.policyHolderFName;
      this.policyHolderLName = object2.policyHolderLName;
      this.policyHolderAge = object2.policyHolderAge;
      this.smokeStatus = object2.smokeStatus;
      this.heightInInches = object2.heightInInches;
      this.weightInPounds = object2.weightInPounds;
   } 
//MUTATORS OR SETTERS
/**---------------------------------------------------------------------
setPHolderFirstName method to set the first name
@param fN String sets the first name of policyholder
------------------------------------------------------------------------*/
   public void setPHolderFirstName(String policyHolderFName)
   {
      this.policyHolderFName = policyHolderFName;
   }
/**---------------------------------------------------------------------
setPHolderLastName method to set the last name
@param lN String sets the last name of policyholder
------------------------------------------------------------------------*/
   public void setPHolderLastName(String policyHolderLName)
   {
      this.policyHolderLName = policyHolderLName;
   }
/**---------------------------------------------------------------------
setPAge method to set the age
@param age double sets the age of policyholder
------------------------------------------------------------------------*/
   public void setPAge(int policyHolderAge)
   {
      this.policyHolderAge = policyHolderAge;
   }
/**---------------------------------------------------------------------
setSmokeStatus method to set the smoking status
@param sStatus String sets smoking status of policyholder
------------------------------------------------------------------------*/
   public void setSmokeStatus(String smokeStatus)
   {
      this.smokeStatus = smokeStatus;
   }
/**---------------------------------------------------------------------
setHeight method to set height in inches
@param h double sets height in inches
------------------------------------------------------------------------*/ 
   public void setHeight(double heightInInches)
   {
      this.heightInInches = heightInInches;
   }
/**---------------------------------------------------------------------
setWeight method to set weight in pounds
@param w double sets weight in pounds
------------------------------------------------------------------------*/ 
   public void setWeight(double weightInPounds)
   {     
      this.weightInPounds = weightInPounds;
   } 
//ACCESSORS OR GETTERS
/**---------------------------------------------------------------------
getPHolderFName method to return the first name
@return String returns the first name of policyholder
------------------------------------------------------------------------*/
   public String getPHolderFName()
   {
      return policyHolderFName;
   }
/**---------------------------------------------------------------------
getPHolderLName method to return the last name
@return String returns the last name of policyholder
------------------------------------------------------------------------*/
   public String getPHolderLName()
   {
      return policyHolderLName;
   }
/**---------------------------------------------------------------------
getPHolderAge method to return the age
@return double returns the age of policyholder
------------------------------------------------------------------------*/
   public int getPHolderAge()
   {
      return policyHolderAge;
   }
/**---------------------------------------------------------------------
getSmokeStatus method to return the smoking status
@return String returns smoking status of policyholder
------------------------------------------------------------------------*/
   public String getSmokeStatus()
   {
      return smokeStatus;
   }
/**---------------------------------------------------------------------
getHeight method to return height in inches
@return double height in inches
------------------------------------------------------------------------*/ 
   public double getHeight()
   {
      return heightInInches;
   }
/**---------------------------------------------------------------------
getWeight method to return weight in pounds
@return double weight in pounds
------------------------------------------------------------------------*/ 
   public double getWeight()
   {
      return weightInPounds;
   }  
/**---------------------------------------------------------------------
getBMI method to calculate and return the policyholder's BMI
@return double bmi returns the bmi of policyholder
------------------------------------------------------------------------*/ 
   public double getBMI()
   {
      return (weightInPounds * 703) / Math.pow(heightInInches,2.0);
   }
/**---------------------------------------------------------------------
toString method
@return A string containing the policy holder information
------------------------------------------------------------------------*/ 
   public String toString()
   {
      return String.format("\nPolicy Holder's First Name: " + policyHolderFName + 
                           "\nPolicy Holder's Last Name: " + policyHolderLName + 
                           "\nPolicy Holder's Age: " + policyHolderAge +
                           "\nPolicy Holder's Smoking Status (Y/N): " + smokeStatus +
                           "\nPolicy Holder's Height: %.1f inches" +
                           "\nPolicy Holder's Weight: %.1f pounds" +
                           "\nPolicy Holder's BMI: %.2f", heightInInches, weightInPounds, getBMI());   
   }
    
}//end of Policy class