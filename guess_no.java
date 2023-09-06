import java.util.Scanner;
import java.util.Random;

public class guess_no {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        // Generate a random number between 0 to 100
        int randint = rand.nextInt(100);
        // guess limit is 10
        /*
         * 1. Generate a random number within a specified range, such as 1 to 100.
         * 
         * 2. Prompt the user to enter their guess for the generated number.
         * 
         * 3. Compare the user's guess with the generated number and provide feedback on
         * whether the guess
         * is correct, too high, or too low.
         * 
         * 4. Repeat steps 2 and 3 until the user guesses the correct number.
         * 
         * You can incorporate additional details as follows:
         * 
         * 5. Limit the number of attempts the user has to guess the number.
         * 6. Add the option for multiple rounds, allowing the user to play again.
         * 7. Display the user's score, which can be based on the number of attempts
         * taken or rounds won.
         */
        int limit = 10;
        int count = 1;
        boolean guess_limit = false;
        System.out.println("Guess a number between 1 to 100");
        while (randint != 0) {
            if (count < limit) {
                System.out.println("Enter your guess: \n " + "guess number " + count + "");
                int guess = sc.nextInt();
                count++;
                if (guess == randint) {
                    System.out.println("You guessed it right! " + randint + " score: " + count + "");
                    System.out.println("You won!");
                    // play again

                } else if (guess < randint) {
                    System.out.println("Your guess is too low");
                } else {
                    System.out.println("Your guess is too high");
                }
            } else {
                guess_limit = true;
                break;
            }
        }
        if (guess_limit) {
            System.out.println("You are out of guesses");

            System.out.println("You lose!");
        }
        sc.close();
    }

}
