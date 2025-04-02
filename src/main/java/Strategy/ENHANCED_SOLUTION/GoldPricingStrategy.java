package Strategy.ENHANCED_SOLUTION;

public class GoldPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double price) {
        return price * .9; // 10% discount
    }
}
