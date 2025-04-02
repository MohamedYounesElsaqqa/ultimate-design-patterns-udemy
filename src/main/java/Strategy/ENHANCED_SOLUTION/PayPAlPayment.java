package Strategy.ENHANCED_SOLUTION;

public class PayPAlPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("process Payment of PayPAl......");
        System.out.println("calculate fees of the amount" +amount+" for PayPAl.....");
    }
}
