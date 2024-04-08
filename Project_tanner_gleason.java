import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Project_tanner_gleason
{
   public static void main(String[] args) throws IOException
   {
      // declare variables
      int number;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      float height;
      float weight;
      int smokerCount = 0;
      int nonSmokerCount = 0;
      
      // declare constants
      final String FILE_NAME = "PolicyInformation.txt";
      final String SMOKER = "smoker";
      
      File file = new File(FILE_NAME); // create file object
      Scanner inputFile = new Scanner(file); // create scanner object with file object
      
      ArrayList<Policy> policies = new ArrayList<Policy>(); // create array to store policy information
      
      // loop that repeats until file ends
      do
      {
         // stores input from file
         number = inputFile.nextInt();
         inputFile.nextLine();
         
         providerName = inputFile.nextLine();
         
         firstName = inputFile.nextLine();
         
         lastName = inputFile.nextLine();
         
         age = inputFile.nextInt();
         inputFile.nextLine(); // consume newline

         smokingStatus = inputFile.nextLine();

         height = inputFile.nextFloat();

         weight = inputFile.nextFloat();
         
         // adds policy object to array using values from file
         policies.add(new Policy(number, providerName, firstName, lastName, age, smokingStatus, height, weight));
      }
      while (inputFile.hasNext());
      
      // loop that repeats for length of policies array
      for (int i = 0; i < policies.size(); i++)
      {
         Policy policy = policies.get(i); // variable to reference specific policy
         
         // prints values using respective accessor methods
         System.out.println("Policy Number: " + policy.getNumber());
         System.out.println("Provider Name: " + policy.getProviderName());
         System.out.println("Policyholder's First Name: " + policy.getFirstName());
         System.out.println("Policyholder's Last Name: " + policy.getLastName());
         System.out.println("Policyholder's Age: " + policy.getAge());
         System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
         System.out.printf("Policyholder's Height: %,.1f\n", policy.getHeight());
         System.out.printf("Policyholder's Weight: %,.1f\n", policy.getWeight());
         System.out.printf("Policyholder's BMI: %,.2f\n", policy.getBMI());
         System.out.printf("Policy Price: $%,.2f\n\n", policy.getPrice());
         
         // count number of smokers and non-smokers
         if (policy.getSmokingStatus().equals(SMOKER))
         {
            smokerCount += 1;
         }
         else
         {
            nonSmokerCount += 1;
         }
      }
      
      // print number of smokers and non-smokers
      System.out.println("The number of policies with a smoker is: " + smokerCount);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
   }
}