
public class Policy
{
   private int number;
   private String providerName;
   private PolicyHolder policyHolder;
   
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
   public Policy(int num, String provName, PolicyHolder pHolder)
   {
      number = num;
      providerName = provName;
      policyHolder = new PolicyHolder(pHolder);
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
      
      if (policyHolder.getAge() > AGE_FEE_MIN) // gets age and if over fifty adds fee
      {
         additionalFee += AGE_FEE;
      }
      if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker")) // gets smoking status and if smoker adds fee
      {
         additionalFee += SMOKER_FEE;
      }
      if (policyHolder.getBMI() > BMI_FEE_MIN) // gets BMI and if over 35 adds fee
      {
         additionalFee += (policyHolder.getBMI() - BMI_FEE_MIN) * BMI_FEE_MULTIPLIER; // BMI fee calculation
      }
      
      return additionalFee + BASE_FEE;
   }
   /**
   The toString method returns data relevant to the Policy instance as a string.
   @return The data stored in the Policy class as a string.
   */
   public String toString()
   {
      return String.format("Policy Number: " + number +
             "\nProvider Name: " + providerName + "\n" +
             policyHolder.toString() +
             "\nPolicy Price: $%,.2f\n", getPrice());
             
   }
}