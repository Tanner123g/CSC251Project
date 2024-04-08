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
         
         PolicyHolder policyHolder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
         
         // adds policy object to array using values from file
         policies.add(new Policy(number, providerName, policyHolder));
      }
      while (inputFile.hasNext());
      
      // loop that repeats for length of policies array
      for (int i = 0; i < policies.size(); i++)
      {
         Policy policy = policies.get(i); // variable to reference specific policy
         
         System.out.println(policy);
         
         PolicyHolder policyHolder = policy.getPolicyHolder();
         
         if (policyHolder.getSmokingStatus().equalsIgnoreCase(SMOKER))
         {
            smokerCount++;
         }
         
         else
         {
            nonSmokerCount++;
         }
      }
      

      // print number of policy objects created
      System.out.println("There were " + policies.get(0).getPolicyCount() + " Policy objects created.\n");
      // print number of smokers and non-smokers
      System.out.println("The number of policies with a smoker is: " + smokerCount);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
   }
}