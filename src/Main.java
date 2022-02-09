public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double annuityPaymentForOneYear = service.calculate(1_000_000, 9.99, 12, 100);
        System.out.println(annuityPaymentForOneYear);

        double annuityPaymentForTwoYears = service.calculate(1_000_000, 9.99, 24, 100);
        System.out.println(annuityPaymentForTwoYears);

        double annuityPaymentForThreeYears = service.calculate(1_000_000, 9.99, 36, 100);
        System.out.println(annuityPaymentForThreeYears);


//        int loanAmount = 1_000_000;
//        double interestRate = 9.99;
//        int creditTerm = 12;
//          int percent = 100;
//        double loanRatePerMonth = interestRate / creditTerm / percent;
//        double annuityRatio = (loanRatePerMonth * Math.pow((1+loanRatePerMonth),creditTerm)) / ((Math.pow((1+loanRatePerMonth),creditTerm))-1);
//        double annuityPayment = annuityRatio * loanAmount;
//
//        System.out.println(annuityPayment);

    }
}