public class CreditPaymentService {

    public int calculate(int amount, int termYear, double percent) {

        double payment = (amount * (percent / (100 * 12))) / (1 - Math.pow(1 + (percent / (100 * 12)), -(termYear * 12)));

        return (int) payment;
    }
}
