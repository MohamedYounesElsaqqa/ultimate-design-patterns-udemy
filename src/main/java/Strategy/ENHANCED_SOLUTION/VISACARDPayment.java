package Strategy.ENHANCED_SOLUTION;

public class VISACARDPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("process Payment of VISA_CARD......");
        System.out.println("calculate fees of the amount" +amount+"for VISA_CARD.....");
    }
}
