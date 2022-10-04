import java.util.Scanner;

public class datepd6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        
        String day = scan.nextLine();
        System.out.println(day);
        
        System.out.print("Enter the month: ");
        
        String month = scan.nextLine();
        System.out.println(month);
        
        System.out.print("Enter the date: ");
        
        String date = scan.nextLine();
        System.out.println(date);
        
        System.out.print("Enter the year: ");
        
        String year = scan.nextLine();
        System.out.println(year);
        
        System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);
        System.out.println("European format: " + day + " " + date + " " + month + " " + year);
        
        scan.close();
    }
} // end of class