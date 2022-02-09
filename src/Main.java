public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double annuityPaymentForOneYear = service.calculate(1_000_000, 9.99, 12, 100);
        System.out.println(annuityPaymentForOneYear);

        double annuityPaymentForTwoYears = service.calculate(1_000_000, 9.99, 24, 100);
        System.out.println(annuityPaymentForTwoYears);

        double annuityPaymentForThreeYears = service.calculate(1_000_000, 9.99, 36, 100);
        System.out.println(annuityPaymentForThreeYears);
    }
}