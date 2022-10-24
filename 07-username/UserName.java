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
      System.out.println("Your username will be: " + initialize(firstName) + (lastName) + (favnum) + "@schools.nyc.gov");        
    }
    else{
      System.out.println("PLease select from the two options");
    }
    generatePassword(8);
    s.close();
   // end main method
  } 
  public static String initialize(String n){
    return n.substring(0, 1);
  } // end initialize method 
  public static String generatePassword(int length) {
     String password = "";
     //loop 'length' times 
     for(int i=0; i < length; i++){
      int randcap = (int)(Math.random() * (90 - 65 + 1) + 65);
      char cc = (char)randcap;
      password += cc;
      int randlow = (int)(Math.random() * (122 - 97 + 1) + 97);
      char cl = (char)randlow;
      password += cl;
      int randspec = (int)(Math.random() * (47 - 33 + 1) + 33);
      char cs = (char)(randspec);
      password += cs;
     }
     System.out.println("Your password will be: " + password);
     return password;
  } // end class
  
}// end of code