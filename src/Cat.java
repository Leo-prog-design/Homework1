// Кот
public class Cat extends Mammal implements Furable{
    private String name;

    public Cat(int age, int weight) {
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
    public void isFur() {
        System.out.println("Whale is name " + name + " swimming");
    }
}
