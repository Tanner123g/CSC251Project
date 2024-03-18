import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Project_tanner_gleason
{
   public static void main(String[] args) throws IOException
   {
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
      
      final String FILE_NAME = "PolicyInformation.txt";
      final String SMOKER = "smoker";
      final String NONSMOKER = "non-smoker";
      final int INCREMENT_AMT = 1;
      
      File file = new File(FILE_NAME);
      Scanner inputFile = new Scanner(file);
      ArrayList<Policy> policies = new ArrayList<Policy>();
      
      // loop that repeats until file ends
      do
      {
      // prompts user input and stores input in respective variables
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
         
         // creates policy object using values from user input
         policies.add(new Policy(number, providerName, firstName, lastName, age, smokingStatus, height, weight));
      }
      while (inputFile.hasNext());
      
      for (int i = 0; i < policies.size(); i++)
      {
         Policy policy = policies.get(i); // 
         
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
         
         if (policy.getSmokingStatus().equals(SMOKER))
         {
            smokerCount += 1;
         }
         else
         {
            nonSmokerCount += 1;
         }
      }
      System.out.println("The number of policies with a smoker is: " + smokerCount);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
   }
}