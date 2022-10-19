import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("Enter your favorite number: ");
    String favnum = s.nextLine();
    System.out.print("Are you a teacher or a student?: ");
    String school = s.nextLine().toLowerCase();

    
    // test output
    if(school.equals("student")){
      System.out.println("Your username will be: " + (firstName) + initialize(lastName) + (favnum) + "@nycstudents.net");
    }
    else if(school.equals("teacher")){
      System.out.println("Your username will be: " + initialize(firstName) + (lastName) + (favnum) + "@schools.nyc");        
    }
    else{
      System.out.println("PLease select from the two options");
    }
    s.close();
   // end main method
  } 
   /*      
    * Name: initialize       
    * Purpose: send back the first character (inital) of a name      
    * Input: a name (String)      
    * Return: a single character (String)      
    */  
  public static String initialize(String n){
    return n.substring(0, 1);
  } // end initialize method
  public static String generatePassword(int length) {
     String password = "yes";
     //loop 'length' times
     
     
     // generate random #
     // from 65-90 CAPITAL letters
    
     int rand = (char)(int)(Math.random() * (65 - 90 + 1) + 65);
     char c = (char)rand;

        // from 97 - 122 lowercase
        // from 33 - 47 for special characters
        
        // convert the random int to char, ex: c =(char)i;
        
        // add the char to password
        
     return password;
  } // end class
}