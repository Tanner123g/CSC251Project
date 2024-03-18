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
      
      final String FILE_NAME = "PolicyInformation.txt";
      
      File file = new File(FILE_NAME);
      Scanner inputFile = new Scanner(file);
      ArrayList<Policy> policies = new ArrayList<Policy>();
      
      // loop that repeats until file ends
      do
      {
      // prompts user input and stores input in respective variables
         number = inputFile.nextInt();
         inputFile.nextLine(); // consume newline
         
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
   }
}