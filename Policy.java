public class Policy
{
   private int number;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private float height;
   private float weight;
   private int bmi;
   
   /**
      no-arg constructor
   */
   public Policy()
   {
      number = 0;
      providerName = "N/A";
      firstName = "N/A";
      lastName = "N/A";
      age = 0;
      smokingStatus = "N/A";
      height = 0;
      weight = 0;
      
   }
   /**
      constructor
      @param num the policy number
      @param provName the provider name
      @param fname the policyholder's first name
      @param lname the policyholder's last name
      @param a the policyholder's age
      @param smoking the policyholder's smoking status
      @param h the policyholder's height
      @param w the policyholder's weight
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
      policy number mutator
      @param num the policy number
   */
   public void setNumber(int num)
   {
      number = num;
   }
   /**
      provider name mutator
      @param provName the provider name
   */
   public void setProviderName(String provName)
   {
      providerName = provName;
   }
   /**
      policyholder's first name mutator
      @param fName the policyholder's first name
   */
   public void setFirstName(String fName)
   {
      firstName = fName;
   }
   /**
      policyholder's last name mutator
      @param lName the policyholder's last name
   */
   public void setLastName(String lName)
   {
      lastName = lName;
   }
   /**
      policyholder's age mutator
      @param a the policyholder's age
   */
   public void setAge(int a)
   {
      age = a;
   }
   /**
      policyholder's smoking status mutator
      @param s the policyholder's smoking status
   */
   public void setSmoker(String s)
   {
      smokingStatus = s;
   }
   /**
      policyholder's height mutator
      @param h the policyholder's height
   */
   public void setHeight(float h)
   {
      height = h;
   }
   /**
      policyholder's weight mutator
      @param w the policyholder's weight
   */
   public void setWeight(float w)
   {
      weight = w;
   }
   /**
      policy number accessor
      @return the policy number
   */
   public int getNumber()
   {
      return number;
   }
   /**
      provider name accessor
      @return the provider name
   */
   public String getProviderName()
   {
      return providerName;
   }
   /**
      policyholder's first name accessor
      @return the policyholder's first name
   */
   public String getFirstName()
   {
      return firstName;
   }
   /**
      policyholder's last name accessor
      @return the policyholder's last name
   */
   public String getLastName()
   {
      return lastName;
   }
   /**
      policyholder's age accessor
      @return the policyholder's age
   */
   public int getAge()
   {
      return age;
   }
   /**
      policyholder's smoking status accessor
      @return the policyholder's smoking status
   */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   /**
      policyholder's height accessor
      @return the policyholder's height
   */
   public float getHeight()
   {
      return height;
   }
   /**
      policyholder's weight accessor
      @return the policyholder's weight
   */
   public float getWeight()
   {
      return weight;
   }
   /**
      calculates policyholder's BMI
      @return the policyholder's BMI
   */
   public float getBMI()
   {
      return (weight * 703) / (height * height);
   }
   /**
      calculates the price of the insurance policy
      @return the price of the insurance policy
   */
   public float getPrice()
   {
      final int BASE_FEE = 600;
      final int AGE_OVER_FIFTY_FEE = 75;
      final int SMOKER_FEE = 100;
      float additionalFee = 0;
      
      if (getAge() > 50) // gets age and if over fifty adds fee
      {
         additionalFee += AGE_OVER_FIFTY_FEE;
      }
      if (getSmokingStatus().equalsIgnoreCase("smoker")) // gets smoking status and if smoker adds fee
      {
         additionalFee += SMOKER_FEE;
      }
      if (getBMI() > 35) // gets BMI and if over 35 adds fee
      {
         additionalFee += (getBMI() - 35) * 20; // BMI fee calculation
      }
      
      return additionalFee + BASE_FEE;
   }
}