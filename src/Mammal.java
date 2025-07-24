// Млекопитающее
public abstract class Mammal extends Animal implements Vertebral {
    public Mammal(int age, int weight) {
        super(age, weight);
    }

    @Override
    public void hasSpine() {
        System.out.println("Mammal has spine");
    }
}
