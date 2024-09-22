import java.util.Random;
import java.util.Scanner;

public class NumberGuessingCode {
    private int secretNumber;
    private int maxRange;
    private int numberOfAttempts;

    // Constructor to initialize the game
    public NumberGuessingCode(int maxRange, int numberOfAttempts) {
        this.maxRange = maxRange;
        this.numberOfAttempts = numberOfAttempts;
        generateSecretNumber();
    }

    // Method to generate a random secret number
    private void generateSecretNumber() {
        Random random = new Random();
        secretNumber = random.nextInt(maxRange) + 1;
    }

    // Method to start the game
    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the number between 1 and " + maxRange);

        while (attempts < numberOfAttempts) {
            int attemptsLeft = numberOfAttempts - attempts;
            System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");

            if (scanner.hasNextInt()) {
                int userGuess = scanner.nextInt();

                if (userGuess < secretNumber) {
                    System.out.println("Incorrect Guess. Try Again.");
                    System.out.println("Hint: The Secret number is greater than your guess.");
                } else if (userGuess > secretNumber) {
                    System.out.println("Incorrect Guess. Try Again.");
                    System.out.println("Hint: The Secret number is less than your guess.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number.");
                    break;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
            }

            attempts++;
        }

        if (attempts == numberOfAttempts) {
            System.out.println("Sorry, you've run out of attempts. Better luck next time :) ");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        NumberGuessingCode game = new NumberGuessingCode(20, 5);
        game.startGame();
    }
}
