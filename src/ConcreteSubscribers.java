public class ConcreteSubscribers implements I_Subscriber {
   private String nom;
   private int id;
    public ConcreteSubscribers() {
    }

    public ConcreteSubscribers(String nom, int id) {
        this.nom = nom;
        this.id = id;
    }

    @Override
    public void update(Publisher publisher) {
        System.out.println("Subscribers update");
    }
}
