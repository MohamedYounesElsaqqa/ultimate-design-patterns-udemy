package observer.ENHANCED_SOLUTION;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineMarketPlace {
    private Map<EventType,List<Subscriber>> subscribers;
    private List<Product> products;
    private List<Offer> offers;
    private List<JobFinder> jobFinders;

    public OnlineMarketPlace() {
        this.subscribers = new HashMap<>();
        initSubscriberEvnets();
        this.products = new ArrayList<>();
        this.offers = new ArrayList<>();
        this.jobFinders = new ArrayList<>();
    }
    public void initSubscriberEvnets(){
        subscribers.put(EventType.NEW_PRODUCT, new ArrayList<>());
        subscribers.put(EventType.NEW_OFFER, new ArrayList<>());
        subscribers.put(EventType.JOB_OPENING, new ArrayList<>());
    }

    public void subscriber(EventType eventType,Subscriber subscriber)
    {
        subscribers.get(eventType).add(subscriber);
    }
    //Unsubscribers
    public void unSubscriber(Subscriber subscriber,EventType eventType)
    {
        subscribers.get(eventType).remove(subscriber);
    }
    public void addNewProduct(Product product){
        products.add(product);
        notifySubscriber(EventType.NEW_PRODUCT,"Add new Product"+product.getName());
    }
    public void notifySubscriber(EventType eventType,String message){
       subscribers.get(eventType).forEach(subscriber -> subscriber.notify(message)
    );
    }
    public void addOffer(Offer offer){
        offers.add(offer);
        notifySubscriber(EventType.NEW_OFFER,"Add new Offer"+offer.getMassage());
    }
    public void addJob(JobFinder jobFinder){
        jobFinders.add(jobFinder);
        notifySubscriber(EventType.JOB_OPENING,"Add new job"+jobFinder.getName());
    }
}
