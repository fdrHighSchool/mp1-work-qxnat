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
      System.out.println("Your username will be: " + (firstName) + initialize(lastName) + (favnum) + ".");
    }
    else if(school.equals("teacher")){
      System.out.println("Your username will be: " + initialize(firstName) + (lastName) + (favnum) + ".");        
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

} // end class
