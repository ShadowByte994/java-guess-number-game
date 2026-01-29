import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int myNumber = (int) (Math.random() * 100) + 1; // random number between 1 and 100
        int userNumber;

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            System.out.print("Guess the number (1 to 100): ");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("🎉 Correct! You guessed the right number.");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Too low! Try again.");
            }
        }

        System.out.println("The number was: " + myNumber);
        sc.close();
    }
}
