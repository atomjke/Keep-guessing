import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");

        int randomizedValue, inputValue;

        randomizedValue = (int)(Math.random() * 10) + 1;

        Scanner input = new Scanner(System.in);

        inputValue = input.nextInt();

        while (inputValue != randomizedValue) {
            System.out.println("That is incorrect. Guess again.");
            System.out.print("Your guess: ");

            inputValue = input.nextInt();
        }

        input.close();

        if (inputValue == randomizedValue) {
            System.out.println("That's right! You're a good guesser.");
        }
    }
}