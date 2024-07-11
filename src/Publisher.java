import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<I_Subscriber> subscribers;
    private String mainState;

    //constructeur
    public Publisher() {
        subscribers = new ArrayList<I_Subscriber>();
        mainState = "Etat initial";
    }

    //ajouter un observateur
    public void subscribe(I_Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    //retirer un abservateur
    public void unsubscribe(I_Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    //envoyer des notifications aux observateurs
    public void notifySubscribers() {
        for (I_Subscriber subscriber : subscribers) {
            subscriber.update(this);
        }
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "mainState='" + mainState + '\'' +
                '}';
    }

    //getters and setters
    public String getMainState() {
        return mainState;
    }

    public void setMainState(String newState) {
        this.mainState = newState;
    }

    public List<I_Subscriber> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<I_Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

}
