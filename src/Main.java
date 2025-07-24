public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish(10, 3);
        Bear bear = new Bear(15, 200);
        Whale whale = new Whale(30, 500);
        Cat cat = new Cat(5, 4);

        fish.setName("Todd");
        fish.swim();

        bear.setName("Oleg");
        bear.eat();
        bear.isFur();
        bear.move();
        bear.info();
    }
}
