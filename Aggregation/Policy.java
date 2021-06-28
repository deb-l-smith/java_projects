/**
Policy class
*/
public class Policy
{
//fields or attributes
   private String policyNumber, providerName;
   private PolicyHolder policyHolder; //instance of the PolicyHolder class
   private static int policyCount = 0; //holds the number of instances of this class

/**---------------------------------------------------------------------
A constructor no arg constructor
------------------------------------------------------------------------*/
   public Policy()
   {
      policyCount++; //increments each time a Policy object is created
      policyNumber = " ";
      providerName = " ";
   }
/**---------------------------------------------------------------------
A constructor that accepts arguments
@param policyNumber String The policy number
@param providerName String The provider name
@param holder A PolicyHolder object
------------------------------------------------------------------------*/
   public Policy(String policyNumber, String providerName, PolicyHolder holder)
   {
      policyCount++; //increments each time a Policy object is created
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.policyHolder = new PolicyHolder(holder);//PolicyHolder copy constructor
   }
//MUTATORS OR SETTERS
/**---------------------------------------------------------------------
setPolicyNum method to set the policy number
@param policyNumber int sets the policy number
------------------------------------------------------------------------*/
   public void setPolicyNum(String policyNumber)
   {
      this.policyNumber = policyNumber;
   }
/**---------------------------------------------------------------------
setProviderName method to set the provider name
@param providerName String sets the provider name
------------------------------------------------------------------------*/
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;  
   }
/**---------------------------------------------------------------------
Create a PolicyHolder object, passing holder as an argument
to the copy constructor
@param holder A PolicyHolder object  
------------------------------------------------------------------------*/  
   public void setPolicyHolder(PolicyHolder holder)
   {
      this.policyHolder = new PolicyHolder(holder);
   }
   
//ACCESSORS OR GETTERS
/**---------------------------------------------------------------------
getPolicyNum method to return the policy number
@return int returns the policy number
------------------------------------------------------------------------*/
   public String getPolicyNum()
   {
      return policyNumber;
   }
/**---------------------------------------------------------------------
getProviderName method to return the provider name
@return String returns the provider name
------------------------------------------------------------------------*/
   public String getProviderName()
   {
      return providerName;
   }
/**---------------------------------------------------------------------
getPolicyHolder method to return a copy of the policy's PolicyHolder object
@return a reference to a copy of this policy's PolicyHolder object
------------------------------------------------------------------------*/ 
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(policyHolder); 
   }
/**---------------------------------------------------------------------
getPolicyCount method returns the number of instances of this class
that have been created
@return int The value in the policyCount field
------------------------------------------------------------------------*/  
   public int getPolicyCount()
   {
      return policyCount;
   }
/**---------------------------------------------------------------------
getPolicyFee method to calculate and return price of policy
@return double fee returns insurance policy total fees + BASE_FEE
------------------------------------------------------------------------*/ 
   public double getPolicyFee()
   {
         final double BASE_FEE = 500.0;
         final double OVER_FIFTY_FEE = 50.0;
         final double SMOKER_FEE = 100.0;
         final int BMI_LIMIT = 40;
         final int AGE_LIMIT = 50;
         double fee = 0.0; //holds the fee
                
         //three separate conditions to test
         if (policyHolder.getSmokeStatus().equalsIgnoreCase("smoker"))
         {
            fee += (SMOKER_FEE);//adds 100.0 to fee if found true
         }
         if (policyHolder.getPHolderAge() > AGE_LIMIT)
         {
            fee += (OVER_FIFTY_FEE);//adds 50.0 to fee if found true
         }                     			
         if (policyHolder.getBMI() > BMI_LIMIT)
         {    
            fee += ((policyHolder.getBMI() - 40) * 50);//adds calculated BMI_FEE to fee if found true
         }      			                                
         return (fee + BASE_FEE);//returns fees + BASE_FEE of 500.0                           
   }       
/**---------------------------------------------------------------------
toString method
@return A string containing the policy information
------------------------------------------------------------------------*/ 
   public String toString()
   {
       return String.format("\nPolicy Number: " + policyNumber +
                            "\nProvider Name: " + providerName + policyHolder + 
                            "\nPolicy Price: $%.2f \n", getPolicyFee());      
   }
      
}//end of Policy class