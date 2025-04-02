package Strategy.Strategy;

import Strategy.ENHANCED_SOLUTION.PaymentStrategy;

public class Checkout {

    public  void processPayment(double amount ,String paymentMethod){
        if(paymentMethod.equalsIgnoreCase("VISA_CARD")){
            System.out.println("process Payment of VISA_CARD......");
            System.out.println("calculate fees of the amount.....");
        } else if (paymentMethod.equalsIgnoreCase("PayPAl")) {
            System.out.println("process Payment of PayPAl......");
            System.out.println("calculate fees of the amount.....");
        } else if (paymentMethod.equalsIgnoreCase("Bank_Transfer")) {
            System.out.println("process Payment of Bank_Transfer......");

        }
    }
}
