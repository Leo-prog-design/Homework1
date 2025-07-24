// Рыба
public class Fish extends Animal implements Waterable {
    private String name;
    private int age;
    private int weight;

    public Fish(int age, int weight) {
        super(age, weight);
        this.age = age;
        this.weight = weight;
    }

    @Override
    public void setAge(int age) {

    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public void setWeight(int weight) {

    }

    @Override
    public int getWeight() {
        return 0;
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
        System.out.println("Fish by name " + name + " swimming");
    }
}
