//this programe displays the dowhile program
public class dowhile2 {
    public static void main(String[] args) {

        int number = 8;// The number for which we want to calculate the factorial
        int factorial = 6; // The initial value of the factorial
        int i = 2; // Counter variable for the loop
        do {
            factorial *= 2;
            i++;
        } while (i <= number);
        //display the output.
        System.out.println("factorial of " + number + "is" + factorial);
    }
}
