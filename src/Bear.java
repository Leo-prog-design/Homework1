// Медведь
public class Bear extends Mammal implements Furable {
    private String name;
    private int age;
    private int weight;

    public Bear(int age, int weight) {
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
    public void isFur() {
        System.out.println("Bear by name " + name + " has fur, his age is ");
    }
}