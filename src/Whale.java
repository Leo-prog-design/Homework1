// Кит
public class Whale extends Mammal implements Waterable {
    private String name;
    private int age;
    private int weight;

    public Whale(int age, int weight) {
        super(age, weight);
        this.age = age;
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
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
        System.out.println("Whale by name " + name + " swimming");
    }
}
