public class CreditPaymentService {
    public double calculate(int loanAmount, double interestRate, int creditTerm, int percent) {
        double loanRatePerMonth = interestRate / 12 / percent;
        double annuityRatio = (loanRatePerMonth * Math.pow((1 + loanRatePerMonth), creditTerm)) / ((Math.pow((1 + loanRatePerMonth), creditTerm)) - 1);
        double annuityPayment = annuityRatio * loanAmount;
        return annuityPayment;

    }

//    public class Main {
//        public static void main(String[] args) {
//            int loanAmount = 1_000_000;
//            double interestRate = 9.99;
//            int creditTerm = 12;
//            int percent = 100;
//            double loanRatePerMonth = interestRate / 12 / 100;
//            double annuityRatio = (loanRatePerMonth * Math.pow((1+loanRatePerMonth),creditTerm)) / ((Math.pow((1+loanRatePerMonth),creditTerm))-1);
//            double annuityPayment = annuityRatio * loanAmount;
//
//            System.out.println(annuityPayment);
//
//        }
//    }
}
