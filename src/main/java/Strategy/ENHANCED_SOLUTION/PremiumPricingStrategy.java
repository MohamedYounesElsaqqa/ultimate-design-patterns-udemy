package Strategy.ENHANCED_SOLUTION;

public class PremiumPricingStrategy implements PricingStrategy {

    @Override
    public double calculatePrice(double price) {
        return price * .8; // 20% discount
    }
}
