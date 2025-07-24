// Медведь
public class Bear extends Mammal implements Furable {
    private String name;


    public Bear(int age, int weight) {
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
        System.out.println("Bear by name " + name + " has fur, his age is ");
    }
}