// Кит
public class Whale extends Mammal implements Waterable {
    private String name;
    private int age;
    private int weight;

    public Whale(int age, int weight) {
        super(age, weight);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void move() {
        System.out.println(name + " move");
    }

    @Override
    public void swim() {
        System.out.println("Whale is name " + name + " swimming");
    }
}
