package observer.ENHANCED_SOLUTION;

public class MainObserver {
    public static void main(String[] args) {
        OnlineMarketPlace onlineMarketPlace= new OnlineMarketPlace();
        Subscriber gohar =new Customer( "gohar");
        Subscriber kimo =new Customer( "kimo");
        Subscriber khaled =new Customer( "khaled");

        Subscriber sass =new Customer( "sass");

        onlineMarketPlace.subscriber(EventType.NEW_OFFER,gohar);
        onlineMarketPlace.subscriber(EventType.NEW_PRODUCT,gohar);

        onlineMarketPlace.subscriber(EventType.NEW_OFFER,kimo);

        onlineMarketPlace.subscriber(EventType.NEW_PRODUCT,khaled);

        onlineMarketPlace.subscriber(EventType.JOB_OPENING,sass);

        onlineMarketPlace.addNewProduct(new Product("mobile",900));
        onlineMarketPlace.addOffer(new Offer("New offer 20%"));
        onlineMarketPlace.addJob(new JobFinder("Software Engineer"));

    }
}
