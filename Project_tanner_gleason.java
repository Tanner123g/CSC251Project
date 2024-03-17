import java.util.Scanner;

public class Project_tanner_gleason
{
   public static void main(String[] args)
   {
      int number;
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
      keyboard.nextLine(); // consume newline
      
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      age = keyboard.nextInt();
      keyboard.nextLine(); // consume newline
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = keyboard.nextFloat();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weight = keyboard.nextFloat();
      
      // creates policy object using values from user input
      Policy policy = new Policy(number, providerName, firstName, lastName, age, smokingStatus, height, weight);
      
      // prints values using respective accessor methods
      System.out.println("Policy Number: " + policy.getNumber());
      System.out.println("\nProvider Name: " + policy.getProviderName());
      System.out.println("\nPolicyholder's First Name: " + policy.getFirstName());
      System.out.println("\nPolicyholder's Last Name: " + policy.getLastName());
      System.out.println("\nPolicyholder's Age: " + policy.getAge());
      System.out.println("\nPolicyholder's Smoking Status: " + policy.getSmokingStatus());
      System.out.printf("\nPolicyholder's Height: %,.1f\n", policy.getHeight());
      System.out.printf("\nPolicyholder's Weight: %,.1f\n", policy.getWeight());
      System.out.printf("\nPolicyholder's BMI: %,.2f\n", policy.getBMI());
      System.out.printf("\nPolicy Price: $%,.2f\n", policy.getPrice());
   }
}