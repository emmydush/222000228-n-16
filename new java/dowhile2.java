public class dowhile2 {
    public static void main(String[] args) {

        int number = 8;
        int factorial = 6;
        int i = 2;
        do {
            factorial *= 2;
            i++;
        } while (i <= number);
        System.out.println("factorial of " + number + "is" + factorial);
    }
}
