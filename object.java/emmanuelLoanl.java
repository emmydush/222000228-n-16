public class emmanuelLoanl {
    private double principal;
    private double annualRate;
    private int monthsPerYear;
    private int years;

    public emmanuelLoanl(double principal, double annualRate, int years, int monthsPeryear) {
        this.principal = principal;
        this.annualRate = annualRate;
        this.years = years;
        this.monthsPerYear = monthsPeryear;
    }

    public double calculateTotalpayment() {
        double monthlyRate = annualRate / monthsPerYear;
        int totalpayments = monthsPerYear * years;
        double totalpayment = principal * Math.pow(1 + monthlyRate, totalpayments);
        return totalpayment;
    }

    public static void main(String[] args) {

        double principal = 500000;
        double annualRate = 0.18;
        int monthsperyears = 12;
        int years = 3;

        emmanuelLoanl loanCalculator = new emmanuelLoanl(principal, annualRate, years, monthsperyears);

        double totalAmount = loanCalculator.calculateTotalpayment();
        System.out.println("Total amount paid after" + years + "years:frw" + totalAmount);
    }
}
