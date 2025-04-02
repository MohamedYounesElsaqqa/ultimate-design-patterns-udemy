package Strategy.ENHANCED_SOLUTION;

public class BankTransferPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("process Payment of Bank_Transfer......");
    }
}
