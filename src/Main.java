public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        long creditAmount = 1000000;
        int month = 36;
        double percent = 9.99;
        double monthlyPayment = service.calculate(creditAmount, month, percent);
        System.out.println(monthlyPayment);
    }
}