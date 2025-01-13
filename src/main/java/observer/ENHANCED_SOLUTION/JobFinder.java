package observer.ENHANCED_SOLUTION;

public class JobFinder implements Subscriber{
    private String name;
    @Override
    public void notify(String massage) {
        System.out.println(name + " is receiving a notification about job finding: " + massage);
    }

    public JobFinder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
