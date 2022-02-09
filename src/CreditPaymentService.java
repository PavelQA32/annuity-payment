public class CreditPaymentService {
    public double calculate(int loanAmount, double interestRate, int creditTerm, int percent) {
        double loanRatePerMonth = interestRate / 12 / percent;
        double annuityRatio = (loanRatePerMonth * Math.pow((1 + loanRatePerMonth), creditTerm)) / ((Math.pow((1 + loanRatePerMonth), creditTerm)) - 1);
        double annuityPayment = annuityRatio * loanAmount;
        return annuityPayment;

    }


}
