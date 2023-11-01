import java.util.Scanner;

public class Dowhileloop4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secretNumber = 12;
        int guess;
        do {
            System.out.println("guess the number");
            guess = scanner.nextInt();
        } while (guess != secretNumber);
        System.out.println("congratulations ! you hava guesed the right number.");
    }
}
