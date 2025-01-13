package observer;

public class Main {
    public static void main(String[] args) {
        OnlineMarketPlace onlineMarketPlace= new OnlineMarketPlace();
        onlineMarketPlace.addUser(new User("gohar",true,true));
        onlineMarketPlace.addUser(new User("kimo",false,true));
        onlineMarketPlace.addUser(new User("khaled",true,false));
        onlineMarketPlace.addUser(new User("sass",false,false));

        onlineMarketPlace.addNewProduct(new Product("mobile",900));
        onlineMarketPlace.addOffer(new Offer("New offer 20%"));

    }
}
