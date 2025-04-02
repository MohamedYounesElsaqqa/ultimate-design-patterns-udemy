package Strategy.ENHANCED_SOLUTION;


public class MainStrategy {

    public static void main(String[] args) {


        Products wallet = new Products("wallet", 200.0,new RegularPricingStrategy());
        double walletPrice = wallet.calculatePrice();
        System.out.println(walletPrice);

        Products jacket = new Products("jacket", 100.0,new GoldPricingStrategy());
        double jacketPrice = jacket.calculatePrice();
        System.out.println(jacketPrice);

        Products mobile = new Products("mobile", 1000.0,new PremiumPricingStrategy());
        double mobilePrice = mobile.calculatePrice();
        System.out.println(mobilePrice);

        new Checkout(new VISACARDPayment()).processPayment(walletPrice);
        new Checkout(new PayPAlPayment()).processPayment(jacketPrice);
         new Checkout(new BankTransferPayment()).processPayment(mobilePrice);

    }
}