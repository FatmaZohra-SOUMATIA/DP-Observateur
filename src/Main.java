import java.util.concurrent.Flow;

public class Main {
    public static void main(String[] args) {

        //creation d un publisher
        Publisher publisher = new Publisher();

        System.out.println(publisher.toString());

        //creation de subscribers
        I_Subscriber subscriber1 = new ConcreteSubscribers("Observateur1");
        I_Subscriber subscriber2 = new ConcreteSubscribers("Observateur2");

        //mettre a jour la liste des subscriber du publisher
        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);

        //changement d etat du publisher
        publisher.setMainState("nouvel etat");
        publisher.notifySubscribers();




    }
}
