import static java.lang.Math.pow;

public class CreditPaymentService {
    public double calculate (long creditAmount, int month, double persent) {
        double monthlyPayment;
        monthlyPayment = creditAmount * (persent/100/12 + persent/100/12 / (pow((1 + persent/100/12),month)-1));
        System.out.println(monthlyPayment);
        return monthlyPayment;
    }

}
