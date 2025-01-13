package observer.observer;

import java.util.ArrayList;
import java.util.List;

public class OnlineMarketPlace {
    private List<User> users;
    private List<Product> products;

    private List<Offer> offers;

    public OnlineMarketPlace() {
        this.users = new ArrayList<>();
        this.products = new ArrayList<>();
        this.offers = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }
    public void addNewProduct(Product product){
        products.add(product);
        notifyUsers(product);
    }
    public void notifyUsers(Product product){
        users.forEach(user -> {
           if (!user.isSubscribedToProduct()){
               return;
           }
            user.notify(product);
        });
    }
    public void addOffer(Offer offer){
        offers.add(offer);
        notifyUsers(offer);
    }
    public void notifyUsers(Offer offer){
        users.forEach(user -> {
            if (!user.isSubscribedToOffer()){
                return;
            }
            user.notify(offer);
        });
    }
}
