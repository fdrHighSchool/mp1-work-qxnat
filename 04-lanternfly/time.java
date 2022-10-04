import java.util.Scanner;

public class time
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Theres around 7 billion people on earth ");
        System.out.println("and theres around 330 million people in America.");
        
        System.out.print("How old are you? ");
        //int num = input.nextLine(); instead of nextLine, it should be nextInt
        int num = input.nextInt(); 
        if (num < 18) {
            System.out.println("Youre a little baby!");
        } // end if statement
        else {
            System.out.println("Youre old and withering away as we speak");
        } // end else statement
        
    } // end main method

} // end class