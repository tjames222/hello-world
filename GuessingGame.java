/**
 *
 * @author tjames
 */
import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        // Generates a random number for the user to guess
        int randomNumber = (int)(Math.random() * 10000);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Play the guessing game!");
        // Checks the guess
        int guess1 = -1;
        while (guess1 != randomNumber) {
            //Prompt the user to enter a number
            System.out.print("\nEnter a guess between 1 and 10000: ");
            guess1 = input.nextInt();
            
            if (guess1 == randomNumber)
                System.out.println("Exact match! The number is " + randomNumber);
            else if (guess1 < randomNumber)
                System.out.println("Guess Higher");
            else if (guess1 > randomNumber)
                System.out.println("Guess Lower");
        } 
    }
    
}
