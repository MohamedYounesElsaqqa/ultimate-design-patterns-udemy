package observer.ENHANCED_SOLUTION;

public class Customer implements Subscriber {
    private String name;

    public Customer(String name) {
        this.name = name;
    }
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void notify(String massage) {

        System.out.println("Notifying user : "+name +" about : "+ massage);
    }
}
