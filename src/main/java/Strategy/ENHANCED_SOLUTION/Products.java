package Strategy.ENHANCED_SOLUTION;

public class Product {
    private String name;
    private double price;
    private PricingStrategy pricingStrategy;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double calculatePrice(String membershipType){
        if(membershipType.equalsIgnoreCase("regular")){
            return price;
        } else if (membershipType.equalsIgnoreCase("gold")) {
            return price * .9; // 10% discount
        } else if (membershipType.equalsIgnoreCase("premium")) {
            return price * .8; // 20% discount
        }
        return price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
