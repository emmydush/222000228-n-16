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
        //calculate the monthly interest rate
        double monthlyRate = annualRate / monthsPerYear;
        //calculate the number of compaundig peiod
        int totalpayments = monthsPerYear * years;
        //caculate te final amount with compaund interest uing the compaund interest
        double totalpayment = principal * Math.pow(1 + monthlyRate, totalpayments);
        return totalpayment;
    }

    public static void main(String[] args) {

        double principal = 500000;//principal amount
        double annualRate = 0.18;//annual interestrate
        int monthsperyears = 12;//Loan term n years
        int years = 3;

        emmanuelLoanl loanCalculator = new emmanuelLoanl(principal, annualRate, years, monthsperyears);

        double totalAmount = loanCalculator.calculateTotalpayment();
        //Display the result
        System.out.println("Total amount paid after" + years + "years:frw" + totalAmount);
    }
}
