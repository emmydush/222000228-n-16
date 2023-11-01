public class whileloop3 {
    public static void main(String[] args) {
        int num = 12;
        int sum = 0;

        while (num > 1) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("sum of digits:" + sum);
    }
}
