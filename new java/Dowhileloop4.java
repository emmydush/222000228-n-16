import java.util.Scanner;

public class Dowhileloop4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//creating scannner object to read the output

        int secretNumber = 12;//the secret number to be guessed.
        int guess;//variable to store the user guess.
        do {
            System.out.println("guess the number");//prompt the user to guess the number.
            guess = scanner.nextInt();//read the user input and store it in the guess variabe.
        } while (guess != secretNumber);
        System.out.println("congratulations ! you hava guesed the right number.");//print the result.
    }
}
