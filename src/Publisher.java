import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<I_Subscriber> subscribers;
    private String mainState;
    //constructeur
    public Publisher() {
        subscribers = new ArrayList<I_Subscriber>();
        mainState = "etat initial";
    }
    public void subscribe(I_Subscriber subscriber) {
        subscribers.add(subscriber);
    }
    public void unsubscribe(I_Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
    //getters and setters
    public String getMainState() {return mainState;}
    public void setMainState(String mainState) {this.mainState = mainState; }
    public List<I_Subscriber> getSubscribers() {return subscribers; }
    public void setSubscribers(List<I_Subscriber> subscribers) {this.subscribers = subscribers;     }

    public void notifySubscribers() {
        for (I_Subscriber subscriber : subscribers) {
            subscriber.update(this);
        }
    }
}
