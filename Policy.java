import java.util.Scanner;

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
   
   public void setNumber(int num)
   {
      number = num;
   }
   public void setProviderName(String provName)
   {
      providerName = provName;
   }
   public void setFirstName(String fName)
   {
      firstName = fName;
   }
   public void setLastName(String lName)
   {
      lastName = lName;
   }
   public void setAge(int a)
   {
      age = a;
   }
   public void setSmoker(String s)
   {
      smokingStatus = s;
   }
   public void setHeight(float h)
   {
      height = h;
   }
   public void setWeight(float w)
   {
      weight = w;
   }
   public int getNumber()
   {
      return number;
   }
   public String getProviderName()
   {
      return providerName;
   }
   public String getFirstName()
   {
      return firstName;
   }
   public String getLastName()
   {
      return lastName;
   }
   public int getAge()
   {
      return age;
   }
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   public float getHeight()
   {
      return height;
   }
   public float getWeight()
   {
      return weight;
   }
   public float getBMI()
   {
      return (weight * 703) / (height * height);
   }
   public float getPrice()
   {
      final int BASE_FEE = 600;
      final int AGE_OVER_FIFTY_FEE = 75;
      final int SMOKER_FEE = 100;
      float additionalFee = 0;
      
      if (getAge() > 50)
      {
         additionalFee += AGE_OVER_FIFTY_FEE;
      }
      if (getSmokingStatus().equalsIgnoreCase("smoker"))
      {
         additionalFee += SMOKER_FEE;
      }
      if (getBMI() > 35)
      {
         additionalFee += (getBMI() - 35) * 20;
      }
      
      return additionalFee + BASE_FEE;
   }
}