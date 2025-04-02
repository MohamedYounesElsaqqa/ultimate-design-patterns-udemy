package Strategy.ENHANCED_SOLUTION;

public class Checkout {

    private PaymentStrategy paymentStrategy;
    public Checkout(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }
    public  void processPayment(double amount){
        paymentStrategy.processPayment(amount);
    }
}
