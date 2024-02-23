import java.util.Scanner;

public class GuessTheNumber {
        private final int secretNumber;
        private final Scanner scanner;

        public GuessTheNumber() {
            secretNumber = (int) (Math.random() * 100) + 1;
            scanner = new Scanner(System.in);
        }

        public void start() {
            System.out.println("Welcome to GUESS THE NUMBER!");
            System.out.println("Guess the number between 1 and 100.");

            int guess;
            do {
                System.out.print("Your guess?: ");
                guess = scanner.nextInt();

                if (guess < secretNumber) {
                    System.out.println("Too low, try again.");
                } else if (guess > secretNumber) {
                    System.out.println("Too high, try again.");
                } else {
                    System.out.println("YOU WIN!!! " + secretNumber + "!");
                }
            } while (guess != secretNumber);
        }

        public void end() {
            System.out.println("Thank you for playing!");
            scanner.close();
        }
    }
