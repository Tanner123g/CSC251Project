import java.util.Scanner;

public class Project_tanner_gleason
{
   public static void main(String[] args)
   {
      int number;
      int bmi = 0;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      float height;
      float weight;
      Scanner keyboard = new Scanner(System.in); // creates scanner object for keyboard input
      
      // prompts user input and stores input in respective variables
      System.out.print("Please enter the Policy Number: ");
      number = keyboard.nextInt();
      keyboard.nextLine();
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Age: ");
      age = keyboard.nextInt();
      keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = keyboard.nextFloat();
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weight = keyboard.nextFloat();
      
      // creates policy object using values from user input
      Policy policy = new Policy(number, providerName, firstName, lastName, age, smokingStatus, height, weight);
      
      // prints values using respective accessor methods
      System.out.print("Policy Number: " + policy.getNumber());
      System.out.print("\nProvider Name: " + policy.getProviderName());
      System.out.print("\nPolicyholder's First Name: " + policy.getFirstName());
      System.out.print("\nPolicyholder's Last Name: " + policy.getLastName());
      System.out.printf("\nPolicyholder's Age: %,d", policy.getAge());
      System.out.print("\nPolicyholder's Smoking Status: " + policy.getSmokingStatus());
      System.out.printf("\nPolicyholder's Height: %,.1f", policy.getHeight());
      System.out.printf("\nPolicyholder's Weight: %,.1f", policy.getWeight());
      System.out.printf("\nPolicyholder's BMI: %,.2f", policy.getBMI());
      System.out.printf("\nPolicy Price: $%,.2f", policy.getPrice());
   }
}