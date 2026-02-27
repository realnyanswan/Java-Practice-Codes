import java.util.Random;
import java.util.Scanner;

public class numberguessinggame {
    public static void main(String[] args) {
        Random rm = new Random();
        Scanner sc = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumbers = rm.nextInt(min, max ++);

        System.out.println("Welcome to Number Guessing Game!");
        System.out.print("Guess a number between 1-100!");

        do{
            System.out.print("\nEnter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if(guess < randomNumbers){
                System.out.println("Too low. Try Again");
            }
            else if(guess > randomNumbers){
                System.out.println("Too high. Try Again.");
            }
            else{
                System.out.println("Correct!");
                System.out.printf("Total Attempts: %d", attempts);
            }

        }while(guess != randomNumbers);

        sc.close();
    }
}
