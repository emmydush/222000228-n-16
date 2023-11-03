public class SimpleInterestCalculator {
    private double principal;
    private double rate;
    private int time;

    public SimpleInterestCalculator(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double calculateSimpleInterest() {
        double interest = (principal * rate * time) / 100;
        return interest;
    }

    public static void main(String[] args) {
        SimpleInterestCalculator Calculator = new SimpleInterestCalculator(100000, 5, 5);

        double interest = Calculator.calculateSimpleInterest();

        System.out.println("principal amount:" + Calculator.principal + "FRW");
        System.out.println("annual interest rate:" + Calculator.rate + "%");
        System.out.println("time(in years):" + Calculator.time);
        System.out.println("simple Interest:" + interest + "FRW");
    }

}
