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

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void move() {
        System.out.println(name + " move");
    }

    @Override
    public void eat() {
        System.out.println(name + " eat");
    }

    @Override
    public void swim() {
        System.out.println("Whale by name " + name + " swimming");
    }

    @Override
    public void hasSpine() {
        System.out.println("Whale has spine");
    }

    @Override
    public void info() {
        System.out.println("Whale by name " + name + ", his age " + age + " and weight " + weight);
    }
}
