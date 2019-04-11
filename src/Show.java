
public class Show implements SubscriptionListener {

    SubscriptionListener subcription;
    String seriesName;

    public Show(String seriesName) {
        this.seriesName = seriesName;
    }

    public void addSeason(Season season) {

    }

    @Override
    public Boolean subscribed(User user) {
        return null;
    }

    public String getName() {
        return seriesName;
    }
}
