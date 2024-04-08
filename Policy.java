public class Policy
{
   private int number;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   /**
   No-Arg Constructor
   */
   public Policy()
   {
      number = 0;
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0;
   }
   
   /**
   Constructor that accepts arguments.
   @param num The policy number.
   @param provName The provider name.
   @param fname The policyholder's first name.
   @param lname The policyholder's last name.
   @param a The policyholder's age.
   @param smoking The policyholder's smoking status.
   @param h The policyholder's height.
   @param w The policyholder's weight.
   */
   public Policy(int num, String provName, String fName, String lName, int a, String smoking, float h, float w)
   {
      number = num;
      providerName = provName;
      firstName = fName;
      lastName =  lName;
      age = a;
      smokingStatus = smoking;
      height = h;
      weight = w;
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
   The setFirstName method sets the policyholder's first name.
   @param fName The policyholder's first name.
   */
   public void setFirstName(String fName)
   {
      firstName = fName;
   }
   
   /**
   The setLastName method sets the policyholder's last name.
   @param lName The policyholder's last name.
   */
   public void setLastName(String lName)
   {
      lastName = lName;
   }
   
   /**
   The setAge method sets the policyholder's age.
   @param a The policyholder's age.
   */
   public void setAge(int a)
   {
      age = a;
   }
   
   /**
   The setSmoker method sets the smoking status of the policy holder.
   @param s The policyholder's smoking status.
   */
   public void setSmoker(String s)
   {
      smokingStatus = s;
   }
   
   /**
   The setHeight method sets the policyholder's height.
   @param h The policyholder's height.
   */
   public void setHeight(float h)
   {
      height = h;
   }
   
   /**
   The setWeight method sets the policyholder's weight.
   @param w The policyholder's weight.
   */
   public void setWeight(float w)
   {
      weight = w;
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
   The getFirstName method returns the policyholder's first name.
   @return The policyholder's first name.
   */
   public String getFirstName()
   {
      return firstName;
   }
   
   /**
   The getLastName method returns the policyholder's last name.
   @return The policyholder's last name.
   */
   public String getLastName()
   {
      return lastName;
   }
   
   /**
   The getAge method returns the policyholder's age.
   @return The policyholder's age.
   */
   public int getAge()
   {
      return age;
   }
   
   /**
   The getSmokingStatus method returns the policyholder's smoking status.
   @return The policyholder's smoking status.
   */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   /**
   The getHeight method returns the policyholder's height.
   @return The policyholder's height.
   */
   public double getHeight()
   {
      return height;
   }
   
   /**
   The getWeight method returns the policyholder's weight.
   @return The policyholder's weight.
   */
   public double getWeight()
   {
      return weight;
   }
   
   /**
   The getBMI method calulates and returns the policyholder's BMI.
   @return The policyholder's BMI.
   */
   public double getBMI()
   {
      final double WEIGHT_MULTIPLIER = 703;
      return (weight * WEIGHT_MULTIPLIER) / (height * height);
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