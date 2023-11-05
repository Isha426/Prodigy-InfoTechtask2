import java.util.Scanner;
import java.util.Random;

public class task2 {

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int attempts = 0;
        boolean guessed = false;

        Scanner scanner = new Scanner(System.in);

        while (!guessed) {
            System.out.println("Guess the number between 1 and 100: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                guessed = true;
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber + "! It took you "
                        + attempts + " attempts.");
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        scanner.close();
    }
}