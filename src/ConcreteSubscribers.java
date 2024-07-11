public class ConcreteSubscribers implements I_Subscriber {
    private static int AUTO_ID = 0;
    private String nom;
    private int id;


    public ConcreteSubscribers(String nom) {
        this.nom = nom;
        this.id = AUTO_ID++;
    }

    @Override
    public void update(Publisher publisher) {
        System.out.println(toString());
        System.out.println("Reception d une mise a jour de "+publisher.toString());
    }

    @Override
    public String toString() {
        return "ConcreteSubscribers{" +
                "nom='" + nom + '\'' +
                ", id=" + id +
                '}';
    }
}
