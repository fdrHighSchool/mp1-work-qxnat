import java.util.Scanner;
import java.util.Random;
public class rnggame {
    public static void main(String[] args) {
     // pick a random number
     Scanner s = new Scanner(System.in);
     Random r = new Random();
     int number = r.nextInt(100) + 1;
     int playerGuess = s.nextInt();
     if(playerGuess != number) {
        //if player guess too low
        if(playerGuess < number){
            System.out.println("You were off by " + (number - playerGuess));
        }//end of inner if statement
        else {//when player guessed too high
            System.out.println("You were off by " + (playerGuess - number));
        }
     }   
     else {
         System.out.println("Correct!");
     }//end of inner else
  }//end of outter if
}

