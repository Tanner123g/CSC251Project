
public class Policy
{
   private int number;
   private String providerName;
   private PolicyHolder policyHolder;
   private static int policyCount = 0;
   
   /**
   No argument constructor.
   */
   public Policy()
   {
      number = 0;
      providerName = "";
      policyHolder = new PolicyHolder();
      policyCount++;
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
      policyCount++;
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
   The setProviderName method sets the provider's name.
   @param provName The provider name.
   */
   public void setProviderName(String provName)
   {
      providerName = provName;
   }
   
   /**
   The setPolicyHolder method sets the PolicyHolder field to another instance of the PolicyHolder class.
   @param pHolder The PolicyHolder instance.
   */
   public void setPolicyHolder(PolicyHolder pHolder)
   {
      policyHolder = pHolder;
   }
   
   /**
   The setPolicyCount method sets the number of Policy objects that have been created.
   @param pCount The number of Policy objects that have been created.
   */
   public void setPolicyCount(int pCount)
   {
      policyCount = pCount;
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
   The getPolicyHolder method returns a copy of the instance of the PolicyHolder class stored in the policyHolder field.
   @return a copy of the instance of the PolicyHolder class stored in the policyHolder field.
   */
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(policyHolder);
   }
   
   /**
   The getPolicyCount method returns the number of Policy objects that have been created.
   @return the number of policy objects that have been created.
   */
   public int getPolicyCount()
   {
      return policyCount;
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
             policyHolder +
             "\nPolicy Price: $%,.2f\n", getPrice());
             
   }
}