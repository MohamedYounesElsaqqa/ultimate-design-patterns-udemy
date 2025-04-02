package Strategy.Strategy;

import Strategy.ENHANCED_SOLUTION.Products;

public class MainStrategy {

    public static void main(String[] args) {


        Product wallet = new Product("wallet", 200.0);
        double walletPrice = wallet.calculatePrice("regular");
        System.out.println(walletPrice);

        Product jacket = new Product("jacket", 100.0);
        double jacketPrice = jacket.calculatePrice("gold");
        System.out.println(jacketPrice);

        Product mobile = new Product("mobile", 1000.0);
        double mobilePrice = mobile.calculatePrice("premium");
        System.out.println(mobilePrice);

        Checkout checkout = new Checkout();
        checkout.processPayment(walletPrice,"VISA_CARD");
        checkout.processPayment(jacketPrice,"PayPAl");
        checkout.processPayment(mobilePrice,"Bank_Transfer");
    }
}