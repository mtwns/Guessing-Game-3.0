import java.util.Scanner;

public class Menu {
    public static void Menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Play Guess The Word");
        System.out.println("2. PLay Guess The Number.");
        System.out.print("Choose: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        switch (choice) {
            case 1:
                // Código proporcionado (GuessTheWord)
                GuessTheWord game1 = new GuessTheWord();
                game1.start();
                game1.end();
                break;

            case 2:
                // GuessTheNumber
                GuessTheNumber game2 = new GuessTheNumber();
                game2.start();
                game2.end();
                break;

            default:
                System.out.println("Opción inválida.");
                break;
        }

        scanner.close();
    }
}
