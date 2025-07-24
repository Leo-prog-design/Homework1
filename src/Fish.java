// Рыба
public class Fish extends Animal implements Waterable {

    private String name;

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
        System.out.println("Fish is name " + name + " swimming");
    }
}
