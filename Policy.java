public class Policy
{
   private int number;
   private String providerName;
   
   /**
   No-Arg Constructor
   */
   public Policy()
   {
      number = 0;
      providerName = "N/A";
   }
   
   /**
   Constructor that accepts arguments.
   @param num The policy number.
   @param provName The provider name.
   */
   public Policy(int num, String provName, String fName, String lName, int a, String smoking, float h, float w)
   {
      number = num;
      providerName = provName;
   }
   
   /**
   The setNumber method sets the policy number.
   @param num The policy number.
   */
   public void setNumber(int num)
   {
      number = num;
   }
   
   /**
   the setProviderName method sets the provider's name.
   @param provName The provider name.
   */
   public void setProviderName(String provName)
   {
      providerName = provName;
   }
   
   
   /**
   The getNumber method returns the policyholder's policy number.
   @return The policy number.
   */
   public int getNumber()
   {
      return number;
   }
   
   /**
   The getProviderName method returns the name of the provier.
   @return The provider name.
   */
   public String getProviderName()
   {
      return providerName;
   }
   
   /**
   The getPrice method determines and returns the price of the polcy.
   @return The price of the insurance policy.
   */
   public double getPrice()
   {
      final int BASE_FEE = 600;
      final int AGE_FEE = 75;
      final int SMOKER_FEE = 100;
      final int AGE_FEE_MIN = 50;
      final int BMI_FEE_MIN = 35;
      final int BMI_FEE_MULTIPLIER = 20;
      float additionalFee = 0;
      
      if (getAge() > AGE_FEE_MIN) // gets age and if over fifty adds fee
      {
         additionalFee += AGE_FEE;
      }
      if (getSmokingStatus().equalsIgnoreCase("smoker")) // gets smoking status and if smoker adds fee
      {
         additionalFee += SMOKER_FEE;
      }
      if (getBMI() > BMI_FEE_MIN) // gets BMI and if over 35 adds fee
      {
         additionalFee += (getBMI() - BMI_FEE_MIN) * BMI_FEE_MULTIPLIER; // BMI fee calculation
      }
      
      return additionalFee + BASE_FEE;
   }
}