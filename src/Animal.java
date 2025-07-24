// Животное
public abstract class Animal {

    public Animal(int age, int weight) {}

    public abstract void setAge(int age);
    public abstract int getAge();
    public abstract void setWeight(int weight);
    public abstract int getWeight();
    public abstract void setName(String name);
    public abstract String getName();

    public void move() {
        System.out.println("Move");
    }

    public void eat() {
        System.out.println("Eat");
    }

    public void info() {
        System.out.println("Info");
    }
}
