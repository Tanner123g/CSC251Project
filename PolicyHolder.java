public class PolicyHolder
{
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   /**
   No-arg constructor that explicitly initializes all fields.
   */
   public PolicyHolder()
   {
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0;
   }
   
   /**
   Constructor that accepts arguments for each field.
   @param fname The policyholder's first name.
   @param lname The policyholder's last name.
   @param a The policyholder's age.
   @param smoking The policyholder's smoking status.
   @param h The policyholder's height.
   @param w The policyholder's weight.
   */
   public PolicyHolder(String fName, String lName, int a, String smoking, float h, float w)
   {
      firstName = fName;
      lastName = lName;
      age = a;
      smokingStatus = smoking;
      height = h;
      weight = w;
   }
   
   /**
   Constructor to copy a PolicyHolder object.
   @param pHolder The policy holder object to be copied.
   */
   public PolicyHolder(PolicyHolder pHolder)
   {
      firstName = pHolder.firstName;
      lastName = pHolder.lastName;
      age = pHolder.age;
      smokingStatus = pHolder.smokingStatus;
      height = pHolder.height;
      weight = pHolder.weight;
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
   The toString method returns the data stored in the PolicyHolder instance as a string.
   @return The data stored in the Policy class as a string.
   */
   public String toString()
   {
      return String.format("Policyholder's First Name: " + firstName +
             "\nPolicyholder's Last Name: " + lastName +
             "\nPolicyholder's Age: " + age +
             "\nPolicyholder's Smoking Status (Y/N): " + smokingStatus +
             "\nPolicyholder's Height: " + height + " inches" +
             "\nPolicyholder's Weight: " + weight + " pounds" +
             "\nPolicyHolder's BMI: %,.2f", getBMI());
   }
}