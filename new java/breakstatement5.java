public class breakstatement5 {
    public static void main(String[] args) {
        // Create an array of integers named "numbers" with 10 elements.
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
         // Define the target number to find within the "numbers" array
        int target = 2;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("number" + target + "found at index" + i);
                 // Exit the loop using the "break" statement, as the target has been found.
                break;
            }
        }
    }
}
